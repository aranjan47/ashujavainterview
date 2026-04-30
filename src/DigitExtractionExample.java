import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DigitExtractionExample {
    public static void main(String[] args) {
        List<Integer> L1 = Arrays.asList(123, 45, 178, 9, 1001, 25, 4, 3);

        String result = L1.stream()
                .flatMapToInt(i -> String.valueOf(i).chars())
                .filter(c -> c == '4' || c == '3' || c == '1' || c == '7' || c == '8')
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
