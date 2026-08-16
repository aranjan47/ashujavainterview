package CollectionInterview;

public class StringObject {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("Hello").intern();


        System.out.println(s1 == s2); // true, both refer to the same string literal in the string pool
        System.out.println(s1 == s3); // false, s3 is a new object in the heap
        System.out.println(s3 == s4); // false, both are different objects in the heap
        System.out.println(s1.equals(s3)); // true, content is the same
        System.out.println(s3.equals(s4)); // true, content is the same

        System.out.println(s1 == s5); // true, s5 refers to the string literal in the string pool

        System.out.println("Hashcode of s1: " + s1.hashCode());
        System.out.println("Hashcode of s5: " + s5.hashCode());
        System.out.println(s1.equals(s5));

    }
}
