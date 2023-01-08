package lambdaPractice.predicate;

interface Cab {
    public String bookCab(String source, String destination);
}

//class Ola implements Cab{
//    public String bookCab(String source, String destination){
//        System.out.println("Ola cab os booked from " + source + "To " + destination);
//        return ("Price: 5000 $");
//    }
//}


public class lambdaExpressionPractice {

    public static void main(String[] args) {

        Cab cab = (source, destination) -> {
            System.out.println("Ola cab os booked from " + source + "To " + destination);
            return ("Price: 5000$");
        };
        System.out.println(cab.bookCab("Hyd", "New York2"));
    }
}
