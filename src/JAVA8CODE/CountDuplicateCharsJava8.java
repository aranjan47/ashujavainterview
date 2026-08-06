package JAVA8CODE;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateCharsJava8 {

	public static void main(String[] args) {

        // given input string
        String input = "JavaJavaEE is my name ";
        
        String[] str5=input.split("\\s");
 
        // convert string into stream
        Map < Character, Long > result = input.replaceAll("\\s", "")
            .chars().mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        
        
        
        String input1="My Name Is ram is  is ashutosh  ranjan";
		String arr[]=input1.split("\\s");
		List<String> chars=Arrays.asList(arr);
        Map<Character, Long> result1 = input1.replaceAll("\\s", "")
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String,Long> charValue = chars.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		charValue.forEach((k, v) -> {
            if (v > 0) {
                System.out.println(k +" : "+ v);
                //break;
            }
        }
        );
       /* result1.forEach((k, v) -> {
                    if (v == 1) {
                        System.out.println(k +" : "+ v);
                        //break;
                    }

                }

        );*/
        

        charValue.forEach((k, v) -> {
        	
            if (v > 1) {
                //System.out.println(k + " : " + v);
                
            }

                }


        );

        
    }
}
