package lambdaPractice.functions;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {


        Function<Integer, Integer> f1 = n -> n * n;

        //Integer
        System.out.println("Integer multiply");
        System.out.println(f1.apply(10));//100

        //String length
        Function<String, Integer> f2 = s -> s.length() + 2;
        System.out.println("String");
        System.out.println(f2.apply("apple"));//5 + 2 = 7

    }
}
