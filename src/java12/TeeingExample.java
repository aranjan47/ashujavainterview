package java12;

import java.util.List;
import java.util.stream.Collectors;
//Combines two collectors and merges their result.
public class TeeingExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        var result = numbers.stream().collect(
            Collectors.teeing(
                Collectors.summingInt(i -> i),
                Collectors.counting(),
                (sum, count) -> "Average: " + (sum / count)
            )
        );

        System.out.println(result); // Average: 25
    }
}
