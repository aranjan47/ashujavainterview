package Java16;

public class PatternMatchDemo {
    public static void main(String[] args) {
        Object obj = "Java 16";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // JAVA 16
        }
    }
}

// all feature are repeated not major changes.