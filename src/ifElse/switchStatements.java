package ifElse;

import java.util.Random;
import java.util.Scanner;

public class switchStatements {
    static Scanner scanner = new Scanner(System.in);

    //Task2
    /*
    Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
    > Campus is open from 8 am to 11 pm (23)
    > If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
    > If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”
     */
    public static void campus() {
        System.out.println("Enter the time to check: ");
        int time = scanner.nextInt();

        if (time >= 0 && time < 8 || time >= 23 && time < 24) {
            System.out.println("Closed");
        }
        if (time < 0 || time >= 24) {
            System.out.println("Invalid");
        }
        if (time >= 8 && time < 23) {
            System.out.println("Open");
        }

    }

    //Task3
    /*
    Guess Number: User is asked to guess a number from 1 to 10
    Write a program that generates a random number and takes a guess from the user.
    > If user guesses correct number they should see “ Congrats you guessed right”
    > If user guess is more than the random number they should see: “your guess is too high”
    > If user guess is less than the random number they should see “your guess it too low”
     */
    public static void lucky() {
        System.out.println("Enter your lucky number: ");
        int num = scanner.nextInt();

        Random random = new Random();
        int ranNum = random.nextInt(9) + 1;

        if (num == ranNum) {
            System.out.println("You lucky");
        }
        if (num < ranNum) {
            System.out.println("your guess is too low");
        }
        if (num > ranNum) {
            System.out.println("your guess is to high");
        }


    }

    //Task4
    /*
    BMI: Program will ask user to enter their mass (kilogram) and their height (meters). Calculate their BMI and then print the appropriate message based on the provided values:
    All numbers taken as doubles
    —> BMI Formula: BMI = mass / (height * height)
    —> Values:
    Less than 18.5 — Underweight
    From 18.5 to 25 — Normal weight
    From 25 to 30 — Overweight
    More than or equal to 30 — Obese
     */
    public static void converter() {
        System.out.println("Enter your weight");
        int weight = scanner.nextInt();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();

        double bmi = Double.valueOf(weight) / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
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

    //Task5
    /*
    char c = input.nextLine().charAt(0);

    Ask user to enter their letter grade, take it as a character. Give them back some result based on their letter grade.
    a --> Excellent!
    b --> Great!
    c --> Okay
    d --> You can do better
    f --> Something needs to change
    if none of these letter --> Not a valid letter grade
    --> Bonus: Take into consideration if the user puts a capital or lower case letter. The results for a and A should be the same
     */
    public static void letter() {
        char letter = scanner.next().charAt(0);

        switch (letter) {
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Okay");
                break;
            case 'D':
                System.out.println("You can better");
                break;
            case 'F':
                System.out.println("Something needs to change");
                break;
        }


    }

    //Task1
    /*
    Write a program that will ask the user to enter a number from 1 to 9. They should see the number they entered in word format.
    If the number is not in the range print: “Invalid number”
    > input: 5
    > output: five
     */
    public static void converterToLetter() {
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        switch (num) {

            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
            default:
                System.out.println("invalid number");
                break;

        }

    }

    //Task5
    /*
    Create a calculator using a switch statement
    > User enters two numbers (double) and an operator(String of [+ , - , * , / ] )
    >Ex: 3,4,”+” output: = 7 ( this whole statement should be shown)
    > If operator provided isn’t one of the options, user should see message: “invalid operator”
     */
    public static void calculator() {
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }

    //Task6
    /*
    Write a program that asks a user to enter a number corresponding to the day of the week starting from 1 being Sunday, 2 being Monday, etc…
    If the number is not between 1 and 7 print “invalid day”
    > input: 7
    > output: Saturday
     */
    public static void day() {
        System.out.println("Enter the number of day");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }

    public static void main(String[] args) {
//        campus();
//        converter();
//        lucky();
//        letter();
//        converterToLetter();
//        calculator();
//        day();

    }
}
