package lambdaPractice.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;
    int experience;

    Employee(String ename, int salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }

}

public class Demo2 {

    public static void main(String[] args) {
        //Ex2
        Employee employee = new Employee("John", 50000, 5);
        // emp obj -> return if salary > 50k and exp > 3

        Predicate<Employee> p = e -> (e.salary > 30000 && e.experience > 3);

        if (p.test(employee)) {
            System.out.println(employee.ename);
        }

        //Ex2
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("John", 50000, 5));
        al.add(new Employee("David", 20000, 2));
        al.add(new Employee("Scott", 30000, 3));
        al.add(new Employee("Lam", 50000, 6));

        for (Employee e : al) {
            //if(e.salary > 50000 && e.experience > 5)
            if (p.test(e)) {
                System.out.println(e.ename + " " + e.salary + " " + e.experience);
            }
        }


    }
}
