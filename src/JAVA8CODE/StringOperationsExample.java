package JAVA8CODE;

import java.util.*;
import java.util.stream.Collectors;

public class StringOperationsExample {

    public static void main(String[] args) {

        String str = "Java 8 Stream API 123 Java";

        System.out.println("Original String: " + str);

        // 11. Frequency of characters
        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("\nCharacter Frequency:");
        freq.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 12. Most frequent character
        Character maxChar = freq.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("\nMost Frequent Character: " + maxChar);

        // 13. Least frequent character
        Character minChar = freq.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Least Frequent Character: " + minChar);

        // 14. Remove spaces
        String noSpaces = str.replaceAll("\\s", "");
        System.out.println("\nString without spaces: " + noSpaces);

        // 15. Count words
        long words = Arrays.stream(str.trim().split("\\s+")).count();
        System.out.println("Word Count: " + words);

        // 16. Find duplicate characters
        Set<Character> duplicates = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) != str.lastIndexOf(c))
                .collect(Collectors.toSet());

        System.out.println("\nDuplicate Characters: " + duplicates);

        // 17. Convert string to list
        List<String> list = Arrays.stream(str.split(""))
                .collect(Collectors.toList());

        System.out.println("\nString to List: " + list);

        // 18. Join list into string
        String joined = list.stream().collect(Collectors.joining());
        System.out.println("Joined String: " + joined);

        // 19. Filter only alphabets
        String alphabets = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("\nOnly Alphabets: " + alphabets);

        // 20. Filter only digits
        String digits = str.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Only Digits: " + digits);
    }
}