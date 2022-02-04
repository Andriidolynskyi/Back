package begin;

import java.util.Scanner;

public class BunchOfTasks {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        informationAboutTheUser();
//        twoNumbers();
//        trueOrFalse();
//        oppositeTrue();
//        twoCharacters();
//        twoNumbersBoolean();
//        mathematicalOperation();
//        vendingMachine();
        rangeNumber();
    }

    // Task1
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

    public static void informationAboutTheUser() {
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Whats your gander?");
        char gender = scanner.next().charAt(0);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Whats your phone number");
        long phoneNumber = scanner.nextLong();
        System.out.println("Whats your gpa");
        double gpa = scanner.nextDouble();

        System.out.println("Name: " + name + "\n"
                + "Gender: " + gender + "\n"
                + "Age: " + age + "\n"
                + "Phone number: " + phoneNumber + "\n"
                + "GPA: " + gpa
        );
    }

    // Task2

    /*
    Write a program that will ask user to enter two whole numbers. Increment the first number by the second number 3 times.
    Print the information in this format: Your number is: firstNumber after being incremented by secondNum counter times
     */

    public static void twoNumbers() {
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        int afterIncremential = firstNumber + secondNumber * 3;

        System.out.println("Your number is: " + afterIncremential + " after being incremented by secondNum counter times");
    }

    //Task3
    /*
    Write a program that will ask user to enter two numbers.
    Declare a boolean with the following value: numberOne >
    numberTwo. Print the resulting boolean.
     */

    public static void trueOrFalse() {
        System.out.println("Enter two numbers number");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        boolean yes = firstNumber > secondNumber;

        System.out.println(yes);
    }

    //Task4
    /*
    Write a program that will ask user to enter a boolean: true or
    false.
    Print the opposite of the boolean they gave.
    > input: true
    > output: false
     */
    public static void oppositeTrue() {
        System.out.println("Enter boolean");
        boolean b = scanner.nextBoolean();

        System.out.println(!b);
    }

    //Task5
    /*
    Write a program that will ask user to enter two characters.
    Declare a boolean with the following value: charOne > charTwo.
    Print the resulting boolean
     */

    public static void twoCharacters() {
        System.out.println("Enter first character");
        char firstCharacter = scanner.next().charAt(0);
        System.out.println("Enter second character");
        char secondCharacter = scanner.next().charAt(0);

        System.out.println(firstCharacter > secondCharacter);
    }

    //Task6
    /*
    Write a program that will ask user to enter two numbers.
    Declare a boolean with the following value: numberOne ==
    numberTwo. Print the resulting boolean.
    > input: 4, 5
    >output: false
     */

    public static void twoNumbersBoolean() {
        System.out.println("Enter two numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        System.out.println(numberOne == numberTwo);
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

    public static void mathematicalOperation() {
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Minus: " + (firstNumber - secondNumber));
        System.out.println("Multiply: " + (firstNumber * secondNumber));
        System.out.println("Divide: " + (firstNumber + secondNumber));
        System.out.println("Module: " + (firstNumber % secondNumber));
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
     */

    public static void vendingMachine() {
        System.out.println("Enter the whole number: ");
        int number = scanner.nextInt();

        int quarters = number / 25;
        number = number % 25;

        int dimes = number / 10;
        number = number % 10;

        int nickels = number / 5;
        number = number % 5;

        int pennies = number / 1;

        System.out.println("Quarters: " + quarters + "\n" +
                "Dimes: " + dimes + "\n" +
                "Nickels: " + nickels + "\n" +
                "Pennies: " + pennies);
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

    public static void rangeNumber(){
        System.out.println("Enter the number between 1 and 100");
        int number = scanner.nextInt();

        boolean b = 0 < number && 101 > number;

        System.out.println(b);

    }


}
