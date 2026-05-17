package Java14;

//Purpose: Extend switch to return values and support arrow syntax.


public class SwitchExpressions {
    public static void main(String[] args) {
        String day = "TUE";
        int numLetters = switch (day) {
            case "MON", "TUE", "WED" -> 3;
            case "THU", "FRI"         -> 4;
            case "SAT", "SUN"         -> 6;
            default                   -> throw new IllegalArgumentException("Invalid day");
        };
        System.out.println(numLetters); // 3
    }
}

//✅ Benefits:
//More concise and less error-prone.

//Returns values directly, no need for break statements.