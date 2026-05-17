package java12;
//Switch Expressions (Preview Feature)
public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "t";
        int num = switch (day) {
            case "MONDAY", "TUESDAY" -> 1;
            case "WEDNESDAY" -> 2;
            default -> 0;
        };
        System.out.println(num); // 1
    }
}
