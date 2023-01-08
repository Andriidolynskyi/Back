package lambdaPractice.predicate;

import java.util.function.Predicate;

public class Demo1 {

    // 1 - Predicate --> one parameter returns boolean
    // 2 - Use only if you have conditional check in your program...

    public static void main(String[] args) {
        //Ex1
        Predicate<Integer> p = i -> (i > 10);

        System.out.println(p.test(11));//true
        System.out.println(p.test(5));//false

        //Ex2 : Check the length of given string is greater than 4 or not.

        Predicate<String> pr = s -> (s.length() > 4);

        System.out.println(pr.test("javac"));//true
        System.out.println(pr.test("jav"));//false

        //Ex3 : Print array elements whose size is > 4 from array
        String[] names = {"David", "Scott", "Smith", "John", "Mary"};


        for(String name: names){
            if (pr.test(name)){
                System.out.println(name);
            }
        }




    }


}
