package JAVA8CODE;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//interface SayHello{
	//void sayHelloJava8();}

interface Sum{
	int sumimng(int a,int b);}

public class java8practice {

	public static void main(String[] args) {
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");
		List<String> stationeryList = Arrays.asList(words);
		Map<String, Long> stationeryCountMap = 
                stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
        System.out.println(stationeryCountMap);

	}

}