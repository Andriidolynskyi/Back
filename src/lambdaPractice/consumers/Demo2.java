package lambdaPractice.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    String gender;

    Employee(String name, int salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
}


public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 50000, "Male"));//5000
        list.add(new Employee("David", 30000, "Male"));//3000
        list.add(new Employee("Mary", 30000, "Female"));//3000
        list.add(new Employee("Lam", 40000, "Male"));//4000

        //Function(calculating)
        Function<Employee, Integer> f1 = emp -> (emp.salary * 10) / 100; //task1

        //Predicate(boolean)
        Predicate<Integer> p1 = e -> e >= 5000; //task2

        //Consumer(printing)
        Consumer<Employee> c1 = emp -> {
            System.out.println(emp.name);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };//task3

        for (Employee e : list){

            //bonus f1.apply(e)
            //boolean p1.test(bonus >= 5000)
            if (p1.test(f1.apply(e))){
                c1.accept(e);
                System.out.println("Bonus value: " + f1.apply(e));
            }

        }

    }
}
