package JAVA19;

//1. Record Patterns (Preview)

//Record patterns help deconstruct record objects directly in pattern matching.

record Person(String name, int age) {}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ashutosh", 30);

        if (p instanceof Person(String name, int age)) {
            System.out.println(name + " is " + age + " years old");
        }
    }
}

