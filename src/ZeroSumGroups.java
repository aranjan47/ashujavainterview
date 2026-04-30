import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZeroSumGroups {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(-1, 0, 1, 2, -1, -4);

        List<List<Integer>> output = findZeroSumGroups(input);

        System.out.println(output);
        System.out.println(+input.size());
    }

    public static List<List<Integer>> findZeroSumGroups(List<Integer> input) {
        List<List<Integer>> result = new ArrayList<>();
int count=0;
        for (int i = 0; i < input.size() - 2; i++) {
            for (int j = i + 1; j < input.size() - 1; j++) {
                for (int k = j + 1; k < input.size(); k++) {
                    if (input.get(i) + input.get(j) + input.get(k) == 0) {
                        List<Integer> group = Arrays.asList(input.get(k), input.get(i), input.get(j));
                        result.add(group);
                    }
                }
            }
             count=2;
            break;
        }


        return result;
    }
}
