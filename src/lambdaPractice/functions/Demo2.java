package lambdaPractice.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 50000));//20000
        list.add(new Employee("David", 20000));//2000
        list.add(new Employee("Scott", 30000));//6000
        list.add(new Employee("Lam", 40000));//12000

        Function<Employee, Integer> f1 = e -> {

            if (e.salary >= 10000 && e.salary <= 20000)
                return e.salary * 10 / 100;
            if (e.salary > 20000 && e.salary <= 30000)
                return e.salary * 20 / 100;
            if (e.salary > 30000 && e.salary <= 40000)
                return e.salary * 30 / 100;
            else
                return e.salary * 40 / 100;

        };

        Predicate<Integer> p = n -> n > 5000;

        for (Employee e : list) {
            if (p.test(f1.apply(e)))
            System.out.println(e.name + " bonus is: " + f1.apply(e));
        }


    }
}
