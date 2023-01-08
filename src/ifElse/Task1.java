package ifElse;

import java.util.Scanner;

public class Task1 {

    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Write a program that asks 3 integers from user and finds maximum value among those 3 entered integers. Print “All 3 integers are equal”
    if they are all equal to each other.
    Note: Use if-else statement
    Note: Consider logical operators

    Flow:
    Please enter 3 integers:
    > 3
    > 32
    > 21
    Maximum value of 3, 32, and 21 is: 32
     */
    public static void threeIntegers() {
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " biggest number");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " biggest number");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " biggest number");
        }
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers equal");
        }
    }

    //Task2
    /*
    Write a program that asks two double values and allows user to choose arithmetic operation to apply. Then program should calculate based on the chosen arithmetic operator by user.
    Note: Use if-else statement\
    Note: User String when reading operators.
    You can compare String using .equals() method.

    Flow:
    Please enter two double values:
    > 23.5
    > 11.3
    Please choose operator from below options: +, -, *, /
    >
    Result of 23.5 - 11.3 is 12.2
     */
    public static void calculation() {
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose mathematics operation: +, -, *, /");
        String operation = scanner.next();

        if (operation.equals("+")) {
            System.out.println(num1 + num2);
        }
        if (operation.equals("-")) {
            System.out.println(num1 - num2);
        }
        if (operation.equals("*")) {
            System.out.println(num1 * num2);
        }
        if (operation.equals("/")) {
            System.out.println(num1 / num2);
        }
    }

    //Task3
    /*
    Login.

    Create 2 String variables for your username and password.

    Write a program that asks from the user to enter the username.
    If username matches then ask for password. If password matches too, then print "Login successfull!".
    If username is true but password is not true, print "wrong password"
    if username doesn't match, print "invalid username."
     */
    public static void login() {
        String username = "login";
        String password = "Login";

        System.out.println("Enter login credentials: ");
        String user = scanner.next();
        System.out.println("Enter password credentials: ");
        String pass = scanner.next();

        if (username.equalsIgnoreCase(user) && password.equals(pass)) {
            System.out.println("Login successfull!");
        }
        if (!username.equalsIgnoreCase(user) && password.equals(pass)) {
            System.out.println("invalid username");
        }
        if (username.equalsIgnoreCase(user) && !password.equals(pass)) {
            System.out.println("wrong password");
        }
        if (!username.equalsIgnoreCase(user) && !password.equals(pass)) {
            System.out.println("wrong credentials");
        }
    }

    public static void main(String[] args) {

//        threeIntegers();
//        calculation();
        login();
    }
}
