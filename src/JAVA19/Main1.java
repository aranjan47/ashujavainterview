package JAVA19;

//Pattern Matching for Switch (Preview)

//Allows using types and patterns inside switch.

public class Main1 {
    static String check(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s.toUpperCase();
            case null -> "Null value";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        System.out.println(check(20));
        System.out.println(check("java"));
    }
}

