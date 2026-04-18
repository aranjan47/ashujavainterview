package String;

public class StringReverseExample {

    // Method to reverse a string
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";

        // Call reverse method
        String reversed = reverse(input);

        // Output
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

    }
}