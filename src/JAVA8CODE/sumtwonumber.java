package JAVA8CODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumtwonumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,5,6,7,1,2,3);
        Integer sum = integers.stream()
        		  .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
     }
 }