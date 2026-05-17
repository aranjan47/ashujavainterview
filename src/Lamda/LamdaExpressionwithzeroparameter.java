package Lamda;

//Java program to demonstrates Lambda expression with zero parameter
@FunctionalInterface
interface ZeroParameter {
 void display();
}

public class LamdaExpressionwithzeroparameter {
 public static void main(String[] args)
 {
     // Lambda expression with zero parameters
     ZeroParameter zeroParamLambda = ()
         -> System.out.println(
             "This is a zero-parameter lambda expression!");

     // Invoke the method
     zeroParamLambda.display();
 }
}