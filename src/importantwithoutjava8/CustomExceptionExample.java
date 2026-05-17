package importantwithoutjava8;

//Custom exception class
class CustomException extends Exception {
 public CustomException(String message) {
     super(message);
 }
}

//Example class using the custom exception
public class CustomExceptionExample {

 // A method that throws the custom exception
 public static void performCustomOperation(int value) throws CustomException {
     if (value < 0) {
         throw new CustomException("Negative values are not allowed");
     } else {
         System.out.println("Operation successful");
     }
 }

 // Main method to demonstrate the custom exception
 public static void main(String[] args) {
     try {
         // Calling the method that may throw the custom exception
         performCustomOperation(-5);
     } catch (CustomException e) {
         // Handling the custom exception
         System.out.println("CustomException caught: " + e.getMessage());
     }
 }
}
