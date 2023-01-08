import java.util.Random;

public class FizzBuzz {

    public static void main(String[] args) {
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 6; i++) {
            str += random.nextInt(9);
        }
        System.out.println(str);
    }


}
