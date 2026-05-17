package CollectionInterview.ArraylistPgm;


import java.util.*;

class ClassretainAll {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ravi");
        list1.add("Vijay");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ravi");

        list1.retainAll(list2);

        System.out.println(list1);
    }
}