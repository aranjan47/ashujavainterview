package Java17;

public class Newswitchwith {
    public static String format(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        System.out.println(format(10));
        System.out.println(format("Hello"));
    }
}




