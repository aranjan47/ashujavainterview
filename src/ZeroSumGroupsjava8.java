import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeroSumGroupsjava8 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(-1, 0, 1, 2, -1, -4);

        List<List<Integer>> output = findZeroSumGroups(input);

        System.out.println(output);
    }

    public static List<List<Integer>> findZeroSumGroups(List<Integer> input) {
        return IntStream.range(0, input.size() - 2)
                .boxed()
                .flatMap(i ->
                        IntStream.range(i + 1, input.size() - 1)
                                .boxed()
                                .flatMap(j ->
                                        IntStream.range(j + 1, input.size())
                                                .filter(k ->
                                                        input.get(i) + input.get(j) + input.get(k) == 0)
                                                .mapToObj(k ->
                                                        Arrays.asList(input.get(i), input.get(j), input.get(k)))))
                .collect(Collectors.toList());
    }
}
