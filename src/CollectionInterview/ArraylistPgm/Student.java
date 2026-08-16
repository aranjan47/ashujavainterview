package CollectionInterview.ArraylistPgm;

import java.util.*;

class Student {
    int rollno;
    String name;
    int age;

    Student(int r, String n, int a) {
        rollno = r;
        name = n;
        age = a;
    }
}

class Main {
    public static void main(String args[]) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Sonoo", 23));
        list.add(new Student(102, "Ravi", 21));
        list.add(new Student(103, "Hanumat", 25));
        list.add(new Student(104, "ashutosh", 27));
        list.add(new Student(104, "ashutosh", 27));


        for (Student s : list) {
            System.out.println(s.rollno + " " + s.name + " " + s.age);
        }
    }
}