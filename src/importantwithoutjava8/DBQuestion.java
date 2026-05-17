package importantwithoutjava8;

import java.util.stream.Collectors;
public class DBQuestion {
	public static void main(String[] args) {
		String str="aabcccdd";
		String result=getCharacterCount(str);
		System.out.println(result);
	}
	private static String getCharacterCount(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> entry.getKey() + "" + entry.getValue())
                .collect(Collectors.joining());
	}
}