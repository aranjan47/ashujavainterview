package CollectionInterview.ArraylistPgm;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Priya");
        list.add("Amit");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            //list.add("ram"); java.util.ConcurrentModificationException
            System.out.println(itr.next());
        }
    }
}