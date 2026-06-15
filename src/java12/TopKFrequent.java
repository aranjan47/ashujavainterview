package java12;

import java.util.*;
import java.util.stream.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        List<Integer> result = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}