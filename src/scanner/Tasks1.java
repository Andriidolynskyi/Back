package scanner;

import java.util.Scanner;

public class Tasks1 {

    //Task1
    /*
    Create three int variables: month, day, year
    Take those values and put them into a string in this format: “M/D/Y”

    Month: 5
    Day: 20
    Year: 2019
    > Output:
    5 / 20 / 2019
     */
    public static void date() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the month today");
        int month = scanner.nextInt();

        System.out.println("Please enter the day today");
        int day = scanner.nextInt();

        System.out.println("Please enter the year today");
        int year = scanner.nextInt();

        System.out.println(month + " / " + day + " / " + year);

        year += 5;
        day -= 1;

        System.out.println(month + " / " + day + " / " + year);

    }

    //Task2
    /*
    Create a number variable for age. Create another variable that has a value of: [65 - the given age]. Then print the the resulting age in this format: Because you are: givenAge years old and will retire in: secondAge years

    > input: 23
    > output: Because you are: 23 years old and will retire in: 42 years

    -----

    Write a program that calculates minutes into hours and minutes.
    > Enter minutes:
    89
    Output: 1 hour and 29 minutes
     */

    public static void retireAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println(age);
        System.out.println("Because you are: " + age + " years old and will retire in: " + (65 - age));
    }

    //Task3
    /*
    Write a program that calculates minutes into hours and minutes.
    > Enter minutes:
    89
    Output: 1 hour and 29 minutes
     */
    public static void minutesToHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        minutes %= 60;

        System.out.println(hours + " hour and " + minutes + " minutes");
    }


    public static void main(String[] args) {

//        date();
//        retireAge();
        minutesToHours();

    }

}
