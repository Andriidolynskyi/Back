package methods;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {

    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Create a void method name countWords that will accept a String as an argument. Print the following:
    “The number of words in the sentence is: numberOfWords”
     */
    public static void countWords(String str) {
        System.out.println("The number of words in the sentence is: " + str.length());
    }

    //Task2
    /*
    Create a method that accepts String and int.
    Check if string length is same as given integer.
    Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
     */
    public static void task2(String str, int length) {
        if (str.length() == length) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    //Task3
    /*
    Create a method that will print negative numbers from a given int array
    public static void m(int [] arr)
     */
    public static void task3(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < 0) {
                System.out.println(intArr[i]);
            }
        }
    }

    //Task4
    /*
    Write a method accepts an int array and a number. Replace any negative numbers in your array with the given number. Print the array
     */
    public static void task4(int[] arr, int change) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = change;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task5
    /*
    Write a method that accepts an int array. Print out the array using the same format as Arrays.toString method. DO NOT USE THE toString() METHOD.
    [element, element, element]
     */
    public static void task5(int[] nums) {
        String empty = "[";

        for (int i = 0; i < nums.length; i++) {
            empty += nums[i];
            if (i + 1 != nums.length) {
                empty += ", ";
            }
        }
        System.out.println(empty + "]");
    }

    //Task6
    /*
    Write a method that will take a String of numbers (9843263 for example) and an int. Add that second given number to each other number and show each operation result as separate elements of an int array
    input: 9843263, 1
    output: [10,9,5,4,3,7,4]

    -or-

    input: 29237347, 2
    output: [4,11,4,5,9,5,6,9]
     */
    public static void task6(String num1, int num2) {
        String[] nums = num1.split("");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(nums[i]) + num2 + "";
        }
        System.out.println(Arrays.toString(nums));
    }

    //Task7
    /*
        Write a method that will take three arguments: the hour, the minutes, and a boolean ( AM will be true, PM will be false) Use the given information to print out the time in this format:
    Hours : minutes amOrPM

    — Hours should be in the range 1-12, minutes should be in the range from 1 to 59.
    If either of those information provided is not valid, do not continue your program, just print “Invalid time information given

    input: 4, 39, true
    Output: 4 : 39 AM
     */
    public static void task7(int hour, int minutes, boolean dayTime){
        if (hour > 0 && hour <= 12 && minutes > 0 && minutes <= 59){
            if (dayTime){
                System.out.println(hour + " : " + minutes + " AM");
            }else {
                System.out.println(hour + " : " + minutes + " PM");
            }
        }else {
            System.out.println("Invalid day time");
        }
    }

    //Task8
    /*
    Write a method that takes two Strings. Check if the second String is found inside of the first String.
    If it does, remove that part from the String, but if the second String is not in the first String ask the user to enter another String to try again.
     */


    public static void main(String[] args) {
//        countWords("bla");
//        task2("bla", 3);
        int[] nums = {3, 56, 12, -34, -1, 80};
//        task3(nums);
//        task4(nums, 0);
//        task5(nums);
//        System.out.println("Enter the number: ");
//        String num1 = scanner.nextLine();
//        System.out.println("Enter the second number: ");
//        int num2 = scanner.nextInt();
//        task6(num1, num2);
        task7(1,39,true);


    }
}
