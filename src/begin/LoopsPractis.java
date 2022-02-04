package begin;

import java.util.*;

public class LoopsPractis {

    /*
    We have 4 types of loops
    1 - for loop
    2 - while loop
    3 - do while loop
    4 - for each loop
     */

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

//        onlyOddNumbers();
//        printName();
//        hiWorld();
//        loginApplication();
//        loginApplication2();
//        skipNumberThree();
//        reverseString();
//        fromTo();
//        bankAccount();
//        addNumber();
        randomGuessing();

    }

    //Task1
    /*
    Write the program that prints only odd numbers from 0 to 50
     */

    public static void onlyOddNumbers() {
        for (int i = 1; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Task2
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

    public static void printName() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the name number " + i + ": ");
            String name = scanner.nextLine();
            System.out.println(name);
        }
    }

    //Task3
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

    public static void hiWorld() {
//        System.out.println("Say something");
//        String str = scanner.nextLine();
//
//        while (str.equals("hi")) {
//            System.out.println("Hello");
//            System.out.println("Say something");
//            str = scanner.nextLine();
//        }
//
//        if (!str.equals("hi")) {
//            System.out.println("goodbye");
//        }
        System.out.println("Say something");
        String str = scanner.nextLine();

        for (; ; ) {

            if (str.equals("hi")) {
                System.out.println("Hello");
                System.out.println("Say again");
                str = scanner.nextLine();
            } else {
                System.out.println("goodbye");
                break;
            }
        }

    }

    //Task3
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
     */

    public static void loginApplication() {

        for (; ; ) {
            System.out.println("Enter your password");
            String str = scanner.nextLine();
            if (str.equals("secret478")) {
                System.out.println("Welcome to your profile");
                break;
            }
        }
    }

    //Part2
    /*
    Modify the above task:
    Give 3 attempts to login.
    If user fails to enter right password within 3 attempts print "Sorry.
    You account is locked. Try after 5 hours" and end the program.
     */

    public static void loginApplication2() {

        int count = 0;
        for (; ; ) {
            count++;
            if (count == 4) {
                System.out.println("Your acc locked");
                break;
            }
            System.out.println("Enter your password");
            String str = scanner.nextLine();
            if (str.equals("secret478")) {
                System.out.println("Welcome to your profile");
                break;
            }
        }
    }

    //Task3
    /*
    [IQ] Write a program that prints every single number from 0 - 50. Skip the numbers that ends with 3.
    3,13,23,33,43
     */

    public static void skipNumberThree() {
        for (int i = 1; i <= 50; i++) {
            if (i % 10 != 3) {
                System.out.println(i);
            }
        }
    }

    //Task4
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
//        System.out.println("Enter your string");
//        String str = scanner.nextLine();
//        String reverse = "";
//        for (int i = str.length()-1; i >= 0; i--) {
//            reverse += str.charAt(i);
//        }
//        System.out.println(reverse);

//        String str = scanner.nextLine();
//        StringBuilder i = new StringBuilder(str);
//        System.out.println(i.reverse());

//        String[] str = scanner.nextLine().split("");
//        String reverse = "";
//        System.out.println(Arrays.toString(str));
//
//        for (int i = str.length - 1; i >= 0; i--) {
//            reverse += str[i];
//        }
//        System.out.println(reverse);

//        char[] str = scanner.nextLine().toCharArray();
//        List<Character> list = new ArrayList<>();
//
//        for (char c : str){
//            list.add(c);
//        }
//
//        Collections.reverse(list);
//
//        String rev = "";
//
//        for (int i = 0; i < list.size(); i++) {
//            rev+=list.get(i);
//        }
//
//        System.out.println(rev);
    }

    //Task5
    /*
    Write a program that asks the user to enter a number more than 0. Print the all the numbers from 0 to the entered number
     */

    public static void fromTo() {
        System.out.println("Enter your number");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    //Task6
    /*
    You have a bank account balance of 1500. You can continue to spend as long as you have money in your account.
    Write a program that will ask the user to enter the cost of an item.
    If your balance has enough money for that item complete the purchase and take the money out of the account.
    If there is not enough money in your account for that item print “Card Declined” and end the ability to buy.
    Allow continuous purchasing until the account becomes 0. When your account has a balance of 0 print “You are broke”
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

    public static void bankAccount() {
        double balance = 1500;

        while (balance > 0) {
            System.out.println("Please enter transaction amount:");
            double cost = scanner.nextDouble();
            if (cost <= balance) {
                balance -= cost;
                System.out.println("Transaction complete" + "\n"
                        + "Your balance is: " + balance);
            } else {
                System.out.println("Card decline");
            }

        }
        System.out.println("Your are broke");
    }

    //Task7
    /*
    Create a program that will continue to add 1 to a number if the user keeps entering “y” or “yes” Number will start at 0.
    When the user enters “n” or “no” Print out the final number.
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

    public static void addNumber() {
        System.out.println("Would you like to add 1?");
        String answer = scanner.nextLine();
        int num = 0;

        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                num += 1;
                System.out.println("Would you like to add 1?");
                answer = scanner.nextLine();
            }
            System.out.println("Your number is: " + num);
        } else {
            System.out.println("Your number is: " + num);
        }
    }

    //Task8
    /*
    Generate a random number from 1 to 100. Ask the user to guess the number.
    If the guess is too high print “Too high” If the guess is too low print “Too low”.
    They continue to guess until they guess the correct number. Count how many guesses were taken and when the number is guessed correctly print
    “You guessed right after guessValue tries !
     */

    public static void randomGuessing() {
        Random random = new Random();
        int count = 0;
        int randomNumber = random.nextInt(100) + 1;
        int num;

        do {
            System.out.println("Enter your guess number");
            num = scanner.nextInt();
            count++;
            if (num < randomNumber) {
                System.out.println("Your number less then random number");
            }
            if (num > randomNumber) {
                System.out.println("Your number bigger then random number");
            }
            if (num == randomNumber) {
                System.out.println("You guessed right after " + count + " guessValue tries !");
            }

        } while (num != randomNumber);

    }

    //Task9
    /*
    Write a program that will ask user to enter a letter. We will work with uppercase letters only.
    If the given information is not a letter from A to Z then print “invalid data”. But if a correct letter was given print the rest of the characters up to Z.
     */



}
