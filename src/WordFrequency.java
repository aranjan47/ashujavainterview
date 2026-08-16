import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "hello world Hello";

        Map<String, Long> frequencyMap = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        frequencyMap.forEach((word, count) ->
                System.out.println(word + " -> " + count)
        );
    }
}