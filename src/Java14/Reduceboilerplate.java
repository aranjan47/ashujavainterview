package Java14;


//✅ 1. Records (Preview Feature)
//Purpose: Reduce boilerplate for simple data carrier classe
record Person(String name, int age) {}

public class Reduceboilerplate {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p.name()); // Alice
        System.out.println(p);        // Person[name=Alice, age=30]
    }
}

//✅ Benefits:
//Automatically provides toString(), equals(), hashCode(), and accessors.

//Greatly reduces boilerplate code compared to POJOs.

//Safer and cleaner for immutable data classes.


