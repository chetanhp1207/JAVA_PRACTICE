package functional_interfaces;

import java.util.function.*;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Predicate2 {

    public static void main(String[] args) {

        Predicate<Employee> p = e -> e.salary > 40000;

        Employee e1 = new Employee(1, "Rahul", 30000);
        Employee e2 = new Employee(2, "Amit", 60000);

        System.out.println(p.test(e1));
        System.out.println(p.test(e2));
    }
}
