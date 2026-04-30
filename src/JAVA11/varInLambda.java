package JAVA11;

import java.util.stream.Stream;
// var in Lambda Parameters

public class varInLambda {
	public static void main(String[] args) {
        Stream.of("Java", "Python")
              .map((var s) -> s.toUpperCase())
              .forEach(System.out::println);
    }

}
