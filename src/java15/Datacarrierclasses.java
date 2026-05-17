package java15;


// Data carrier classes without boilerplate code.


public class Datacarrierclasses {
    public static void main(String[] args) {
        Person p = new Person("Ashutosh", 30);
        System.out.println(p.name());
        System.out.println(p);
    }
}


//✅ Benefits:
//Eliminates boilerplate (getters, constructors, toString, equals, hashCode)

//Immutability and thread safety

//Ideal for DTOs