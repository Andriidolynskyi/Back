package begin;

import java.util.Random;
import java.util.Scanner;

public class LoopsPractis2 {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        task7();

    }

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

    public static void task1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    //task2
    /*
    Create a multiplication table to print in the following format including all the multiples of 1-10 all the way through the multiples of 10:
    1 x 1 = 1
    1 x 2 = 2
    1 x 3 = 3
    1 x 4 = 4
    1 x 5 = 5
    1 x 6 = 6
    1 x 7 = 7
    1 x 8 = 8
    1 x 9 = 9
    1 x 10 = 10
     */

    public static void task2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    //Task3
    /*
    Generate a random number that is six digits long.
    Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers that make it up.
    Print the number.

    >764235
     */

    public static void task3() {
        String str = "";
        int num;
        for (int i = 0; i < 6; i++) {
            for (; ; ) {
                num = random.nextInt(9) + 1;
                if (!str.contains(num + "")) {
                    str += num;
                    break;
                }
            }
        }
        System.out.println(str);
    }

    //Task4
    /*
    Ask user to enter their number (Take it as a String).
    A number can only be valid if it is 10 characters long or is 12 characters with the “(“ and “)” characters in the 1st or 5th characters.
    Then make sure the number provided contains only numbers and not any other characters.
    If the number meets the length requirements and has all valid characters print “Valid phone number”
    If the length requirement is not met or the number contains invalid characters then print “Invalid phone number”

    (800)4333333

    > Character.isDigit(char c);
     */

    public static void task4() {
        System.out.println("Enter your phone number");
        String phoneNumber = scanner.nextLine();

        if (phoneNumber.length() == 10 || phoneNumber.length() == 12) {
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (i == 0 && phoneNumber.charAt(i) == 40 || i == 4 && phoneNumber.charAt(i) == 41) {
                    continue;
                }
                if (!Character.isDigit(phoneNumber.charAt(i))) {
                    System.out.println("Invalid phone number1");
                    break;
                }
            }
            System.out.println(phoneNumber);
        } else {
            System.out.println("Invalid phone number2");
        }

    }

    //Task5
    /*
    Write a program that will ask the user to enter two numbers. The first number will be the starting value for your range.
    The second number will be the ending number of your range. Add up the sum of all the numbers in your range and print
    “The some of num1 to num2 is: sumAllValue”
    > input: 1, 100
    > output: “The sum of 1 to 100 is: 5050”

    Part 2:
    For the same range also print the average of the numbers.
    Print: “The average is: avgNumber“
    > The average is: 50.5
     */

    public static void task5() {
        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();
        int sumOfValue = 0;
        double avgValue = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sumOfValue += i;
//            avgValue = sumOfValue / 2;
//            System.out.println("The average is: " + avgValue);
        }
        System.out.println(sumOfValue);
    }

    //Task6
    /*
    A word that is the same read forwards and backwards. User takes a word from the console. Print true if the word is a palindrome.
    Print false if the word is not palindrome.
    > input: civic
    > output: true
     */

    public static void task6() {
        System.out.println("Enter your word");
        String str = scanner.nextLine();

        //first way
//        StringBuilder stringBuilder = new StringBuilder(str);
//        if(str.equalsIgnoreCase(stringBuilder.reverse().toString())){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not Palindrome");
//        }

        boolean check = true;

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                check = false;
            }
        }
        if (check) {
            System.out.println("Palindome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    //Task 7
    /*
    Write a program that asks the user to enter a word. Print out how many times a character is in the given word.
    > input: apple
    > output:
    apple has 1 a
    apple has 2 p
    apple has 1 l
    apple has 1 e
     */

    public static void task7() {
        System.out.println("Enter the word");
        String str = scanner.nextLine();

        String second = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char c = str.charAt(i);

            if (!second.contains(c + "")) {
                for (int j = 0; j < str.length(); j++) {
                    if (c == str.charAt(j)) {
                        count++;
                    }
                }
            } else {
                continue;
            }
            System.out.println(str + " has " + count + " " + c);
            second += c;
        }
    }



}
