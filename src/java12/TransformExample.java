package java12;
//Applies a function to the string and returns the result.
public class TransformExample {
    public static void main(String[] args) {
        String result = "java 12".transform(s -> s.toUpperCase());
        System.out.println(result); // JAVA 12
    }
}
