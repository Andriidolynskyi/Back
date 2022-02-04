package begin;

import java.util.Random;
import java.util.Scanner;

public class SwitchStatements {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        rangeNumber();
//        winnerNumber();
//        weekDay();
//        calculator();
//        randomUpperLetter();
        userAge();
    }

    //Task1
    /*
    Write a program that will ask the user to enter a number from 1 to 9. They should see the number they entered in word format.
    If the number is not in the range print: “Invalid number”
    > input: 5
    > output: five
     */

    public static void rangeNumber() {
        System.out.println("Enter the number");
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
                break;
            default:
                System.out.println("Invalid value");
        }
    }

    //Task2
    /*
    Guess Number: User is asked to guess a number from 1 to 10
    Write a program that generates a random number and takes a guess from the user.
    > If user guesses correct number they should see “ Congrats you guessed right”
    > If user guess is more than the random number they should see: “your guess is too high”
    > If user guess is less than the random number they should see “your guess it too low”
     */

    public static void winnerNumber() {
        System.out.println("Enter your winner number");
        int num = scanner.nextInt();
        Random random = new Random();
        int ran = random.nextInt(10) + 1;
        System.out.println(ran);

        if (num == ran) {
            System.out.println("Congrats");
        }
        if (num > ran) {
            System.out.println("Your number is too high");
        }
        if (num < ran) {
            System.out.println("Your number is too low");
        }
    }

    //Task3
    /*
    Write a program that asks a user to enter a number corresponding to the day of the week starting from 1 being Sunday, 2 being Monday, etc…
    If the number is not between 1 and 7 print “invalid day”
    > input: 7
    > output: Saturday
     */

    public static void weekDay() {
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
                System.out.println("Invalid value");
        }
    }

    //Task4
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
        System.out.println("Enter calculator sight");
        char sight = scanner.next().charAt(0);

        switch (sight) {
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

    //Task5
    /*
    Write a program that will generate a random uppercase letter. Print the letter.
     */

    public static void randomUpperLetter() {
        Random random = new Random();

        int randomNumber = random.nextInt(26) + 65;
        char letter = (char) (randomNumber);

        System.out.println(letter);

//        System.out.printf("%c",randomNumber);
    }

    //Task6
    /*
    Write a program that will take ask the user for their age.
    Let the user know if they have access to the building.
    They must be 30 years old to have access to the building.
    If the user enters an age above 100 or age less than 0, print “Not a valid age”.
    If they are old enough print “Welcome to the building” but if they are too young print “Sorry try again when you’re 30”
     */

    public static void userAge() {
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age >= 30 && age < 100) {
            System.out.println("Welcome to the building");
        }
        else if (age < 30 && age > 0) {
            System.out.println("You are too young");
        }
        else {
            System.out.println("Invalid age");
        }

    }

    //Task7
    /*
    Write a program that will ask the user to enter three numbers.
    If the numbers are the same print “All integers are the same”
    If they are not equal, print which is the biggest value of the three numbers
    —> If there is two numbers which are the largest print the one that came first
    > Input: 3,2,6
    > Output: The biggest number from 3, 2 and 6 is: 6
     */


}
