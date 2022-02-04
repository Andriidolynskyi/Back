package begin.construcktor.House;

    /*
    Part I
    Create a class House
    Instance variables: type, address, numRooms
    Methods:
    info: this method should simply print details of house.

    Part II
    Create a program that asks from user details of the house through console and create object from House. And print the details of created House.
     */

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        House house = new House("main", "3215 w Beach ave", 123);
//
//        house.info();

        System.out.println("Enter the type of house");
        String type = scanner.nextLine();

        House house = new House(type, "3215 w Beach ave", 123);
        house.info();
    }
}
