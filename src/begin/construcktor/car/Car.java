package begin.construcktor.car;

public class Car {

    String make;
    int year;
    String sportEdition;
    int mileage;

    public Car(String make, int year, String sportEdition, int mileage) {
        this.make = make;
        this.year = year;
        this.sportEdition = sportEdition;
        this.mileage = mileage;
    }

    public void drive() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
        System.out.println("Sport Edition: " + sportEdition);
        System.out.println("Mileage: " + (mileage + 10));
    }

    public void drive(String destination){
        System.out.println(year + " " + make + " is driving to " + destination);
    }

    public void drive(int miles){
        System.out.println(year + " " + make + " is driving " + miles + " " + (mileage + miles));
    }

}
