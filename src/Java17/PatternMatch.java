package Java17;


//No need for explicit casting after instanceof
public class PatternMatch {
    public static void main(String[] args) {
        Object obj = "Java 17";
        if (obj instanceof String s) {
            System.out.println(s.toLowerCase()); // java 17
        }
    }
}

//✅ Benefits:
//Less boilerplate code

//Safe and more readable
