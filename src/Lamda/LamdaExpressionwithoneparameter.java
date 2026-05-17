package Lamda;


//Java program to demonstrate simple lambda expressions
import java.util.ArrayList;

class LamdaExpressionwithoneparameter {

 public static void main(String args[])
 {
     // Creating an ArrayList with elements
     // {1, 2, 3, 4}
     ArrayList<Integer> al = new ArrayList<Integer>();
     al.add(1);
     al.add(2);
     al.add(3);
     al.add(4);

     // Using lambda expression to print all elements of al
     System.out.println("Elements of the ArrayList: ");
     al.forEach(n -> System.out.println(n));

     // Using lambda expression to print even elements
     // of al
     System.out.println(
         "Even elements of the ArrayList: ");
     al.forEach(n -> {
         if (n % 2 == 0)
             System.out.println(n);
     });
 }
}

