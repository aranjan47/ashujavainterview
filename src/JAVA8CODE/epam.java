package JAVA8CODE;


import java.util.*;
        import java.util.stream.*;

public class epam {
    public static void main(String[] args) {
        String[] arr = {"11", "aa", "gg", "78", "98", "ij"};

        List<Integer> numbers = Arrays.stream(arr)
                .filter(s -> s.matches("\\d+")) // keep only digits
                .map(Integer::parseInt)        // convert to Integer
                .collect(Collectors.toList());
/// .filter(s -> s.matches("-?\\d+")) // allow negative integers
        //        .filter(s -> s.matches("-?\\d+(\\.\\d+)?")) // integer + decimal
        System.out.println(numbers);
    }
}
