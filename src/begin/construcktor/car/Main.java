package begin.construcktor.car;

public class Main {

    //Task1
    /*
    1. Create a class Car
    Instance variables: make, year, sportEdition, mileage
    Methods:
    drive -> print “%year %make is driving” -> increment mileage by 10
    drive -> accepts String(destination) -> print “%year %make is driving to %destination”
    -> increment mileage by 10
    drive -> accepts integer(mile) -> print “%year %make is driving %mile miles”
    -> increment mileage by given mile.
    */
    public static void main(String[] args) {
        Car car = new Car("Honda",2008,"EX-L",155000);
//        car.drive();
//        car.drive("Chicago");
        car.drive(27);
    }
}
