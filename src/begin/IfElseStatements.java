package begin;

import java.util.Scanner;

public class IfElseStatements {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        oddOrEven();
//        howManyOddAndEven();
//        findMaximum();
//        arithmeticOperation();
//        login();
//        campusTime();
        bmi();

    }


    //Task1
    /*
    Write a program that finds if the entered number is odd or even.
    Simply ask user to enter one integer value and print “odd” or “even” based on the value user enters.
     */

    public static void oddOrEven() {
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    //Task2
    /*
    Ask user to enter 5 integers and store all of them.
    Count how many of them odd, how many of them even.
    Print number of evens and odds.
     */

    public static void howManyOddAndEven() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        int countOdd = 0;
        int countEven = 0;

        if (number1 % 2 == 0) {
            countEven++;
        }
        if (number2 % 2 == 0) {
            countEven++;
        }
        if (number3 % 2 == 0) {
            countEven++;
        }
        if (number4 % 2 == 0) {
            countEven++;
        }
        if (number5 % 2 == 0) {
            countEven++;
        } else {
            countOdd++;
        }
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }

    //Task3
    /*
    Write a program that asks 3 integers from user and finds maximum value among those 3 entered integers.
    Print “All 3 integers are equal” if they are all equal to each other.
     */

    public static void findMaximum() {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Bigger number: " + num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("Bigger number: " + num2);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("Bigger number: " + num3);
        } else {
            System.out.println("All numbers are equal");
        }
    }

    //Task4
    /*
    Write a program that asks two double values and allows user to choose arithmetic operation to apply.
    Then program should calculate based on the chosen arithmetic operator by user.
     */

    public static void arithmeticOperation() {
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter arithmetic operation");
        char arithmeticOperation = scanner.next().charAt(0);
        System.out.println(arithmeticOperation);

        if (arithmeticOperation == '+') {
            System.out.println(num1 + num2);
        }
        if (arithmeticOperation == '-') {
            System.out.println(num1 - num2);
        }
        if (arithmeticOperation == '*') {
            System.out.println(num1 * num2);
        }
        if (arithmeticOperation == '/') {
            System.out.println(num1 + num2);
        }
    }

    //Task5
    /*
    Login.

    Create 2 String variables for your username and password.

    Write a program that asks from the user to enter the username.
    If username matches then ask for password. If password matches too, then print "Login successfull!".
    If username is true but password is not true, print "wrong password"
    if username doesn't match, print "invalid username."
     */

    public static void login() {
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        if (userName.equalsIgnoreCase("Andrii")) {
            System.out.println("Enter password: ");
            String userPassword = scanner.nextLine();
            if (userPassword.equals("Andrii")) {
                System.out.println("Login successfully");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Wrong username");
        }
    }

    //Task6
    /*
    Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
    > Campus is open from 8 am to 11 pm (23)
    > If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
    > If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”
     */

    public static void campusTime() {
        System.out.println("What time is that now?");
        double time = scanner.nextDouble();

        if (time >= 8 && time < 23) {
            System.out.println("Open");
        }
        if (time < 8 && time >= 0 || time >= 23 && time < 24) {
            System.out.println("Closed");
        }
        if (time < 0 || time >= 24) {
            System.out.println("Error");
        }
    }

    //Task7

    /*
    BMI: Program will ask user to enter their mass (kilogram) and their height (meters). Calculate their BMI and then print the appropriate message based on the provided values: All numbers taken as doubles
    —> BMI Formula: BMI = mass / (height * height)
    —> Values:
    Less than 18.5 — Underweight
    From 18.5 to 25 — Normal weight
    From 25 to 30 — Overweight
    More than or equal to 30 — Obese
     */

    public static void bmi() {
        System.out.println("Enter your weight in kilograms");
        int mass = scanner.nextInt();
        System.out.println("Enter your height in centimeters");
        double height = Double.valueOf(scanner.nextInt()) / 100;

        double bmi = mass / (height * height);


        if (bmi < 18.5) {
            System.out.println("Under weight");
        }
        if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        }
        if (bmi >= 30) {
            System.out.println("Obese");
        }
    }


}
