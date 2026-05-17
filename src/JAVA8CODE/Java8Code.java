package JAVA8CODE;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
 
public class Java8Code 
{
    public static void main(String[] args) 
    {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
         
         listOfIntegers.stream().filter(i-> i%2==0).forEach(System.out::println);
         listOfIntegers.stream().filter(i-> i%2!=0).forEach(System.out::println);
                //listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
         
        //Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
         
        //System.out.println(oddEvenNumbersMap);
    }
}