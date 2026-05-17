package JAVA13;


//This enhances the switch statement to be used as an expression and improves 
//readability and reduces error-proneness.
//
//🔹 Before Java 13:
//int day = 2;
//String result;
//switch (day) {
//    case 1:
//        result = "Monday";
//        break;
//    case 2:
//        result = "Tuesday";
//        break;
//    default:
//        result = "Unknown";
//}
//System.out.println(result);

public class SwitchExpressionExample {
    public static void main(String[] args) {
        int day = 2;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
