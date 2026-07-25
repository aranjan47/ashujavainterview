package JAVA8CODE;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary + " " + department;
    }
}

public class EmployeeJava8Demo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ashu", 30, 60000, "IT"),
                new Employee(2, "Ravi", 45, 80000, "HR"),
                new Employee(3, "Neha", 28, 40000, "IT"),
                new Employee(4, "John", 50, 90000, "Finance"),
                new Employee(5, "Pooja", 35, 70000, "HR"),
                new Employee(6, "Amit", 60, 30000, "Finance"),
                new Employee(7, "Kiran", 62, 95000, "IT")
        );

        // 1. Employees with salary > 50000
        System.out.println("1. Salary > 50000:");
        employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .forEach(System.out::println);

        // 2. Sort by salary descending
        System.out.println("\n2. Sorted by salary desc:");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

        // 3. Highest paid employee
        System.out.println("\n3. Highest salary:");
        Optional<Employee> highest =
                employees.stream()
                        .max(Comparator.comparing(Employee::getSalary));

        highest.ifPresent(System.out::println);

        // 4. Group by department
        System.out.println("\n4. Group by department:");
        Map<String, List<Employee>> groupByDept =
                employees.stream()
                        .collect(groupingBy(Employee::getDepartment));

        groupByDept.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });

        // 5. Average salary by department
        System.out.println("\n5. Avg salary by department:");
        Map<String, Double> avgSalary =
                employees.stream()
                        .collect(groupingBy(Employee::getDepartment,
                                averagingDouble(Employee::getSalary)));

        avgSalary.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 6. Names in uppercase
        System.out.println("\n6. Names uppercase:");
        employees.stream()
                .map(e -> e.getName().toUpperCase())
                .forEach(System.out::println);

        // 7. Second highest salary (Tricky)
        System.out.println("\n7. Second highest salary:");
        Optional<Double> secondHighest =
                employees.stream()
                        .map(Employee::getSalary)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();

        secondHighest.ifPresent(System.out::println);

        // 8. Any employee age > 60
        System.out.println("\n8. Any age > 60:");
        boolean anyMatch =
                employees.stream()
                        .anyMatch(e -> e.getAge() > 60);

        System.out.println(anyMatch);

        // 9. Convert to Map (id -> employee)
        System.out.println("\n9. Convert to Map:");
        Map<Integer, Employee> empMap =
                employees.stream()
                        .collect(toMap(Employee::getId, e -> e));

        empMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 10. Optional example (null safety)
        System.out.println("\n10. Optional Example:");
        Employee emp = null;

        String name = Optional.ofNullable(emp)
                .map(Employee::getName)
                .orElse("Default Name");

        System.out.println(name);
    }
}