package JAVA8CODE;

import java.util.Arrays;

public class arraymuliplybyitself {
	public static void main(String args[])   
	{ 
		int [] arrays = {2,3,4,5};
		int [] arrays1= {3,4,5,6};
	      int[] ints = Arrays.stream(arrays).map(s -> 
	                   Arrays.stream(arrays1).reduce(1, (x, y) -> x * y) / s)
	                   .toArray();
	      Arrays.stream(ints).forEach(System.out::println);
		
		
}}
