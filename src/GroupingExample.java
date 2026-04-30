import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//USSA interview
public class GroupingExample {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(123, 45, 178, 9, 1001, 25, 4, 3);

        Map<Boolean, List<Integer>> groupedMap = input.stream()
                .collect(Collectors.groupingBy(i -> i > 100));
        
        List<List<Integer>> output = Arrays.asList(groupedMap.get(true), groupedMap.get(false).stream()
                .filter(i -> i != 25 && i != 45)
                .collect(Collectors.toList()));

        System.out.println(output);
    }
}
