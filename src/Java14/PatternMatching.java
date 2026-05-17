package Java14;
//Purpose: Simplify type casting after instanceof.


public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello Java 14";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // HELLO JAVA 14
        }
    }
}

//✅ Benefits:
//Eliminates redundant casting.

//Enhances code readability and reduces errors.


