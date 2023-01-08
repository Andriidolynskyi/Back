package scanner;

import java.util.Scanner;

public class Task2 {

    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Ask user to enter their information using the following
    datatypes:
    name - string
    gender - char
    age - int
    phone number - long
    gpa - double
    —> After getting the information print the information in this
    format:
    Name: givenName
    Gender: givenGender
    etc....
     */
    public static void information() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = scanner.nextLine();

        System.out.println("Your gender: ");
        char gender = scanner.next().charAt(0);

        System.out.println("Your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();

        System.out.println("Your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Name: " + name +
                "\nGender: " + gender +
                "\nAge: " + age +
                "\nPhone number: " + phoneNumber +
                "\nGPA: " + gpa);

    }

    //Task2
    /*
    Write a program that will ask user to enter two whole numbers.
    Increment the first number by the second number 3 times. Print
    the information in this format:
    Your number is: firstNumber after being incremented by
    secondNum counter times
     */
    public static void increment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Your number is: " + firstNumber + " after being incremented by " + secondNumber + " counter times: " + (firstNumber + secondNumber * 3));
    }

    //Task3
    /*
    Write a program that will ask user to enter two numbers.
    Declare a boolean with the following value: numberOne >
    numberTwo. Print the resulting boolean.
     */
    public static void twoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber > secondNumber);

    }

    //Task4
    /*
    Write a program that will ask user to enter a boolean: true or
    false.
    Print the opposite of the boolean they gave.
    > input: true
    > output: false
     */
    public static void askBoolean() {
        System.out.println("Enter True or False");
        boolean opposite = scanner.nextBoolean();

        System.out.println(!opposite);
    }

    //Task5
    /*
    Write a program that will ask user to enter two characters.
    Declare a boolean with the following value: charOne > charTwo.
    Print the resulting boolean.
     */
    public static void twoChar() {
        System.out.println("Enter first char: ");
        char firstChar = scanner.next().charAt(0);

        System.out.println("Enter second char: ");
        char secondChar = scanner.next().charAt(0);

        System.out.println(firstChar > secondChar);
    }

    //Task6
    /*
    Write a program that will ask user to enter two numbers.
    Declare a boolean with the following value: numberOne ==
    numberTwo. Print the resulting boolean.
    > input: 4, 5
    >output: false
     */
    public static void numbers() {
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber == secondNumber);
    }

    //Task7
    /*
    Write a program what asks the user to enter two decimal
    numbers. Take these two numbers and perform all the
    mathematical operations (+,-, *, /, %) on them. Print all the
    results.
    > input 3.5, 6
    > output: Addition: 9.5
    etc for Subtraction, Multiplication, Division, Remainder
     */
    public static void calculation() {
        System.out.println("Enter first decimal number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second decimal number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
        System.out.println("Remainder: " + (firstNumber % secondNumber));
    }

    //Task8
    /*
    Vending machine change. Write a program that will ask used to
    enter a whole number from 1 to 99. User will get back the
    amount of quarters, dimes, nickels, and pennies that are needed
    to equal to the provided number.
    > input
    Enter your change
    68
    > output
    Your change of 68 was converted to:
    quarters: 2
    dimes: 1
    nickels: 1
    pennies: 3
     */
    public static void changes() {
        System.out.println("Enter the number from 1 to 99");
        int number = scanner.nextInt();

        int quarters = number / 25;
        number %= 25;

        int dimes = number / 10;
        number %= 10;

        int nickels = number / 5;
        number %= 5;

        int pennies = number / 1;

        System.out.println("quarters: " + quarters +
                "\ndimes: " + dimes +
                "\nnickels: " + nickels +
                "\npennies: " + pennies);

    }

    //Task9
    /*
    Write a program that asks the user to enter a number between
    1 -100
    Declare a boolean that will check if the entered number is
    actually within the given range. Make sure the number is more
    than 0 and less than 101. If the number meets both of those
    requirements the resulting boolean should be printed as true
    otherwise if either of them is not meet the result should be false.
    > input: 200
    > output: false
    */
    public static void numberBetween(){
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        System.out.println(1 < number && number < 100);

    }


    public static void main(String[] args) {

//        information();
//        increment();
//        twoNumbers();
//        askBoolean();
//        twoChar();
//        numbers();
//        calculation();
//        changes();
        numberBetween();

    }
}
