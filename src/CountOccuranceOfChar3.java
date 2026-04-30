import java.util.stream.Collectors;  
import java.util.*;  
public class CountOccuranceOfChar3  
{  
public static void main(String args[])   
{  
String str= "Communication";  
Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
System.out.println(result);  
}  
}  