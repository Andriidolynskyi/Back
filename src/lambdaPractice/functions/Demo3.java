package lambdaPractice.functions;

import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {

        Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n * n;

        System.out.println(f1.apply(2));
        System.out.println(f1.andThen(f2).apply(2)); // 2 * 2 = 4 => 4 * 4 * 4 = 64

        System.out.println(f1.compose(f2).apply(2)); // 2 * 2 * 2 = 8. 8 * 2 = 16


    }
}
