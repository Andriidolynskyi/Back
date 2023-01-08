package lambdaPractice.predicate;

//Joining Predicates - and , or , negate
//p1 - check number is even
//p2 - checks greater than 50

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {

        int[] nums = {5,15,20,25,30,30,35,40,45,50,55,60,65};

        Predicate<Integer> p1 = i -> (i % 2 == 0);
        Predicate<Integer> p2 = i -> (i > 50);

        //and
        System.out.println("Following are numbers EVEN and Greater then 50...");

        for (int n : nums){
            if (p1.and(p2).test(n)){
                System.out.println(n);
            }
        }

        // or
        System.out.println("or");
        for (int n : nums){
            if (p1.or(p2).test(n)){
                System.out.println(n);
            }
        }

        // negate
        System.out.println("negate");
        for(int n: nums){
            if(p1.negate().test(n)){
                System.out.println(n);
            }
        }


    }
}
