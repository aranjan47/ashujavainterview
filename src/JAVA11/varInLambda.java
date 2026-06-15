package JAVA11;

import java.util.List;
import java.util.stream.Stream;
// var in Lambda Parameters

public class varInLambda {
	public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");

        list.forEach((var item) -> System.out.println(item));
    }

}
