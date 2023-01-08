package string;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    static Scanner scanner = new Scanner(System.in);

    //Task2
    /*
    Write a program that will generate a random uppercase letter. Print the letter.
    Hint: ascii table
     */
    public static void printLetter() {
        Random random = new Random();
        int num = random.nextInt(26) + 65;

        System.out.println((char) num);
    }

    //Task3
    /*
    Write a program that will take ask the user for their age. Let the user know if they have access to the building. They must be 30 years old to have access to the building.
    If the user enters an age above 100 or age less than 0, print “Not a valid age”.
    If they are old enough print “Welcome to the building” but if they are too young print “Sorry try again when you’re 30”
     */
    public static void accessToTheBuilding() {
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 0 || age >= 100) {
            System.out.println("Not valid");
        }
        if (age < 30 && age > 0) {
            System.out.println("Too young");
        }
        if (age >= 30 && age < 100) {
            System.out.println("you good");
        }
    }

    //Task4
    /*
    Send Message: User will enter a message, if message is valid it will be sent, there is a chance the message will not be delivered due to internet
    > User takes a message that needs to be at least 15 characters
    > If the message is valid user will see message: “sent” and “not sent” if the message was not valid
    > If message was sent there is a 50 % chance the message will not be delivered. >> If the message is delivered user will see message: “ delivered”
    HINT: use random number for random chance to send
     */
    public static void sendMessage() {
        String str = scanner.next();
        Random random = new Random();
        int num = random.nextInt(2) + 1;

        if (str.length() >= 15) {
            System.out.println("Sent");
            if (num % 2 == 0) {
                System.out.println("Delivered");
            } else {
                System.out.println("not Delivered");
            }
        } else {
            System.out.println("Not sent");
        }

    }

    //Task5
    /*
    User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
    > input: “Java is a fun language”
    > output: “is a fun language Java”
    hint: you know the first space will be the end of the first word
     */
    public static void sentence() {
        String str = "Java is a fun language";
        System.out.println(str.substring(str.indexOf(" ") + 1) + " " + str.substring(0, str.indexOf(" ")));

        for (int i = 0; i < 3; i++) {
            
        }


    }

    //Task6
    /*
    User is asked to enter an account number. You will check if these account numbers are valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “ Invalid account number”
     */
    public static void checkAccountNumber() {
        System.out.println("Enter your account number");
        String accNumber = scanner.next();

        if (accNumber.startsWith("2") && accNumber.length() == 7 ||
                accNumber.startsWith("5") && accNumber.length() == 10) {
            System.out.println("valid number");
        } else {
            System.out.println("not valid");
        }
    }


    public static void main(String[] args) {
//        printLetter();
//        accessToTheBuilding();
//        sendMessage();
//        sentence();
        checkAccountNumber();

    }
}
