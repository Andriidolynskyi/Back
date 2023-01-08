package loops;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Please write a program that asks the name from user using Scanner and print "Welcome, name" for 15 times.

    Part 2:
    Print character on the new line
     */
    public static void printName() {
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < 15; i++) {
            System.out.println(i + 1 + ": " + name);
        }

    }

    //Task2
    /*
    Write a program that prints only odd numbers
    from 0 - 50.
    Flow:
    1
    3
    5
    7
    ...
     */
    public static void oddsNumber() {
        for (int i = 0; i < 50; i++) {
            if ((i + 1) % 2 != 0) {
                System.out.println(i + 1);
            } else {
                System.out.println("Even number here");
            }
        }
    }

    //Task3
    /*
    Write a program that asks from 5 names from the user and print each name.
    Flow:
    Please enter name1:
    > Adam
    Adam
    Please enter name2:
    > Jamie
    Jamie
    Please enter name3:
    > John
    John
     */
    public static void printNames() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name: ");
            System.out.println(new String(scanner.nextLine()));
        }
    }

    //Task4
    /*
    Write a program that asks from the user infinitely:
    if user enters "hi" your program answers "hello", if user enters anything besides "hi" your program says "good bye"
    Flow:
    > hi
    Hello
    > bye
    Good bye
    > james
    Good bye
     */
    public static void besides() {
        System.out.println("Enter something: ");
        for (; ; ) {
            if (new String(scanner.nextLine()).equalsIgnoreCase("hi")) {
                System.out.println("hello");
                System.out.println("repeat");
            } else {
                System.out.println("good bye");
                break;
            }
        }
    }

    //Task5
    /*
    Write a program for the login to application.
    Program should ask for the password until user hits right password.
    password is "secret478". If user enters right password print "Welcome to your profile!" and exits the infinite loop.
    Flow:
    Please enter your password:
    > james
    Please enter your password:
    > adam
    Please enter your password:
    > secret478
    Welcome to your profile!

    Part 2:
    Modify the above task:
    Give 3 attempts to login.
    If user fails to enter right password within 3 attempts print "Sorry. You account is locked. Try after 5 hours" and end the program.
     */
    public static void loginPassword() {
        int count = 1;
        for (; ; ) {
            System.out.println("Enter the password");
            if (new String(scanner.nextLine()).equals("secret478")) {
                System.out.println("Welcome to your profile!");
                break;
            } else {
                if (count == 3) {
                    System.out.println("Your account locked");
                    break;
                }
                System.out.println("try one more time");
                count++;
            }
        }
    }

    //Task6
    /*
    Write a program that prints every single number from 0 - 50. Skip the numbers that ends with 3.
    3,13,23,33,43
     */
    public static void print3() {
        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 3) {
                System.out.println(i);
            }
        }
    }

    //Task7
    /*
    Write a program that reverses the String. Ask for a word from the user and reverse the word.
    Flow:
    Please enter the word:
    James
    semaJ
    Please enter the word:
    hello
    olleh
    Hint: use charAt, length
     */
    public static void reverseString() {
        System.out.println("Enter the string for reverse: ");
        String str = scanner.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    //Task8
    /*
    Write a program that asks the user to enter a number more than 0. Print the all the numbers from 0 to the entered number.
     */
    public static void printWhile() {
        System.out.println("Enter the range: ");
        int range = scanner.nextInt();

        for (int i = 0; i < range; i++) {
            System.out.println(i);
        }
    }

    //Task9
    /*
    2) You have a bank account balance of 1500. You can continue to spend as long as you have money in your account.
    Write a program that will ask the user to enter the cost of an item. If your balance has enough money for that item complete the purchase and take the money out of the account.
    If there is not enough money in your account for that item print “Card Declined” and end the ability to buy. Allow continuous purchasing until the account becomes 0.
    When your account has a balance of 0 print “You are broke”
    Flow: (balance of 600)
    Please enter transaction amount:
    > 200
    Item Purchased
    Please enter transaction amount:
    > 300
    Item Purchased
    Please enter transaction amount:
    > 100
    Item Purchased
    Please enter transaction amount:
    >5
    You are broke.
     */
    public static void bankTransaction() {
        int balance = 1500;

        while (balance > 0) {
            System.out.println("Enter the cost of the item");
            int item = scanner.nextInt();

            if (balance >= item) {
                balance -= item;
                System.out.println("Item purchased");
                System.out.println("Your balance: " + balance);
            }
            if (balance == 0) {
                System.out.println("You are broke");
                break;
            }
            if (balance < item) {
                System.out.println("Card declined");
            }
        }


    }

    //Task10
    /*
    Create a program that will continue to add 1 to a number if the user keeps entering “y” or “yes” Number will start at 0. When the user enters “n” or “no” Print out the final number.
    Flow:
    Would you like to add 1?
    > y
    Would you like to add 1?
    > y
    Would you like to add 1?
    > y
    Would you like to add 1?
    > n
    Your number is: 3
     */
    public static void addOne() {
        int count = 0;
        String temp = "y";
        while (temp.equalsIgnoreCase("Y")) {
            System.out.println("Would you like add one?");
            temp = scanner.nextLine();
            if (!temp.equalsIgnoreCase("Y")) {
                break;
            }
            count++;
        }
        System.out.println("Your number: " + count);
    }

    //Task11
    /*
    Generate a random number from 1 to 100. Ask the user to guess the number.
    If the guess is too high print “Too high” If the guess is too low print “Too low”.
    They continue to guess until they guess the correct number. Count how many guesses were taken and when the number is guessed correctly print
    “You guessed right after guessValue tries !
     */
    public static void luckyNumber() {
        Random random = new Random();
        int ranNumber = random.nextInt(100) + 1;
        int count = 0;
        int yourNumber = 0;

        do {
            System.out.println(ranNumber);
            System.out.println("Enter your number");
            yourNumber = scanner.nextInt();
            count++;
            if (ranNumber == yourNumber) {
                System.out.println("Good work");
                break;
            }
        } while (ranNumber != yourNumber);
        System.out.println("You won after " + count + " times");
    }

    //Task12
    /*
    Write a program that will ask user to enter a letter. We will work with uppercase letters only.
    If the given information is not a letter from A to Z then print “invalid data”. But if a correct letter was given print the rest of the characters up to Z.
     */
    public static void letter() {
        int ch = 0;
        do {
            System.out.println("Enter the uppercase character");
            ch = scanner.next().charAt(0);
            if (ch >= 65 && ch <= 90) {
            }else {
                System.out.println("invalid character");
                break;
            }
        } while (ch >= 65 && ch <= 90);
    }


    public static void main(String[] args) {
//        printName();
//        oddsNumber();
//        printNames();
//        besides();
//        loginPassword();
//        print3();
//        reverseString();
//        printWhile();
//        bankTransaction();
//        addOne();
//        luckyNumber();
        letter();


    }
}
