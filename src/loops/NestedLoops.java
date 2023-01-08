package loops;

import java.util.Random;
import java.util.Scanner;

public class NestedLoops {
    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Write a program that asks the user to enter a number. The number will be how big your square will be. Square made of ‘#’ sign
    > input: 5
    > output:
    # # # # #
    # # # # #
    # # # # #
    # # # # #
    # # # # #
     */
    public static void cube() {
        System.out.println("How many iteration");
        int iteration = scanner.nextInt();
        for (int i = 0; i < iteration; i++) {
            for (int j = 0; j < iteration; j++) {
                System.out.print("#");
                if (j != iteration - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    //Task2
    /*
    Create a multiplication table to print in the following format including all the multiples of 1-10 all the way through the multiples of 10:
     */
    public static void calculation() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j));
                System.out.println();
            }
            System.out.println("____________");
        }

    }

    //Task3
    /*
    Ask user to enter their number (Take it as a String).
    A number can only be valid if it is 10 characters long or is 12 characters with the “(“ and “)” characters in the 1st or 5th characters.
    Then make sure the number provided contains only numbers and not any other characters.
    If the number meets the length requirements and has all valid characters print “Valid phone number” If the length requirement is not met or the number contains invalid characters then print “Invalid phone number”

    (800)4333333

    > Character.isDigit(char c);
     */
    public static void validNumber() {
        System.out.println("Enter the phone number: ");
        String number = scanner.nextLine();

        if (number.length() == 10 || number.length() == 12) {
            if (number.length() == 10) {
                for (int i = 0; i < number.length(); i++) {
                    char ch = number.charAt(i);
                    if (!Character.isDigit(ch)) {
                        System.out.println("Not valid phone number");
                    }
                }
                System.out.println("Valid 10 digit number");
            }
            if (number.length() == 12 && String.valueOf(number.charAt(0)).equals("(") && String.valueOf(number.charAt(4)).equals(")")) {
                for (int i = 0; i < number.length(); i++) {
                    if (i == 0 || i == 4) {
                        continue;
                    }
                    char ch = number.charAt(i);
                    if (!Character.isDigit(ch)) {
                        System.out.println("Not valid phone number");
                    }
                }
                System.out.println("Valid 12 digit number");
            } else {
                System.out.println("Not valid phone number");
            }
        } else {
            System.out.println("Not valid phone number");
        }

    }

    //Task4
    /*
    Generate a random number that is six digits long. Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers that make it up.
    Print the number.

    >764235
     */
    public static void sixUniqueDigit() {
        String numbers = "";

        while (numbers.length() != 6) {
            Random random = new Random();
            int temp = random.nextInt(10);
            boolean check = true;

            for (int i = 0; i < numbers.length(); i++) {
                if (String.valueOf(numbers.charAt(i)).equals(String.valueOf(temp))) {
                    check = false;
                }
            }
            if (check) {
                numbers += temp;
            }
        }
        System.out.println(numbers);
    }

    //Task5
    /*
    Write a program that will ask the user to enter two numbers. The first number will be the starting value for your range. The second number will be the ending number of your range.
    Add up the sum of all the numbers in your range and print
    “The some of num1 to num2 is: sumAllValue”
    > input: 1, 100
    > output: “The sum of 1 to 100 is: 5050”

    Part 2:
    For the same range also print the average of the numbers.
    Print: “The average is: avgNumber“
    > The average is: 50.5
     */
    public static void sumAllValue() {
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = 0;
        int avg = 0;

        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("Sum of: " + sum);
    }

    //Task6
    /*
    Palindrome: A word that is the same read forwards and backwards.
    User takes a word from the console. Print true if the word is a palindrome.
    Print false if the word is not palindrome.
    > input: civic
    > output: true
     */
    public static void palindrome() {
        //1 - reverse
        System.out.println("Enter the word");
        String str = scanner.nextLine();
//        String pal = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            pal += str.charAt(i);
//        }
//        if (pal.equalsIgnoreCase(str)) {
//            System.out.println("Word is palindrome");
//        } else {
//            System.out.println("Not palindrome");
//        }

        //2 - String buffer
        //3

        boolean check = true;

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    //Task7
    /*
    Write a program that asks the user to enter a word. Print out how many times a character is in the given word.
    > input: apple
    > output:
    apple has 1 a
    apple has 2 p
    apple has 1 l
    apple has 1 e
     */
    public static void countWords() {
        String strCons = scanner.nextLine();
        String empty = "";

        for (int i = 0; i < strCons.length(); i++) {
            int count = 0;
            char temp = strCons.charAt(i);
            if (empty.contains(String.valueOf(temp))){
                continue;
            }
            empty += temp;
            for (int j = 0; j < strCons.length(); j++) {
                if (String.valueOf(temp).equals(String.valueOf(strCons.charAt(j)))) {
                    count++;
                }
            }
            System.out.println(strCons + " has " + count + " " + temp);
        }
    }


    public static void main(String[] args) {
//        cube();
//        calculation();
//        validNumber();
//        sixUniqueDigit();
//        sumAllValue();
//        palindrome();
        countWords();

    }
}
