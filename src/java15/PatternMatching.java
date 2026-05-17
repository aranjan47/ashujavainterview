package java15;


//Simplifies the instanceof check and cast.

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello Java";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}

//✅ Benefits:
//Less verbose

//More readable and maintainable code

