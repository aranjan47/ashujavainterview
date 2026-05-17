package JAVA8CODE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findduplicate {

	public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        
        
       
        //find duplicate
        myList.stream()
              .filter(n -> !set.add(n))
              .forEach(System.out::println);
        
        
        // counting dullicate
        Map < Integer, Long > result=myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
result.forEach((k, v) -> {
        	
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });

          // find distict element
        //myList.stream().distinct().forEach(System.out::println);

       // find first element 
        //myList1.stream().findFirst().ifPresent(System.out::println);

      // find max number

  int m=      myList1.stream().max(Comparator.naturalOrder()).get();
  System.out.println(m);
}
	}
