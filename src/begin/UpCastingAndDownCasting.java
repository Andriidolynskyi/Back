package begin;

public class UpCastingAndDownCasting {

    public static void main(String[] args) {
        // Up casting
        // When you upcasting (from smaller container to bigger container) you can simply assign right away
        int i = 25;
        long l = i;
        System.out.println(i);
        System.out.println(l);

        // Down casting
        // When you downcasting (from the bigger container to smaller container) YOU MAST EXPLICITLY CAST IT
        System.out.println();

        long l2 = 15;
//        int i2 = l2; ==> show the error. You need to specify the datatype in parentheses
        int i2 = (int) l2;
        System.out.println(l2);
        System.out.println(i2);


    }

}
