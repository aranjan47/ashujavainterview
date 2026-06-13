package JAVA8CODE;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        Map<Integer, Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Step 2: Sort by frequency in descending order and pick top k
        List<Integer> result = frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3,3,4};
        int k = 2;

        List<Integer> result = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + result);
    }
}