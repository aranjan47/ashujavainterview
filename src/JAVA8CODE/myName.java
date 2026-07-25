package JAVA8CODE;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class myName {
    public static void main(String[] args) {
        String name = "ASHUTOSH";
//Remove Duplicate Characters
        String result = name.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        //System.out.println(result);

        //2. Count Frequency of Each Character
        Map<Character, Long> freq = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(freq);
//3. Find First Non-Repeating Character
        Character result1 = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),  Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

       // System.out.println(result1);
//4. Count Vowels in a String
        long count = name.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        //System.out.println(count);
        //5. Sort Characters in a String
        String sorted = name.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

       // System.out.println(sorted);
/// 6. Find Duplicate Characters in a String
       // String name = "ASHUTOSH";

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = name.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c))
                .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}
