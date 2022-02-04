package begin;

import java.util.Arrays;

public class MethodPracticeVoid {

    //Task1
    /*
    Create a void method name countWords that will accept a String as an argument. Print the following:
    “The number of words in the sentence is: numberOfWords”
     */

    public static void countWords(String arg) {
        System.out.println(arg);
    }

    //Task2
    /*
    Create a method that accepts String and int.
    Check if string length is same as given integer.
    Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
     */

    public static void task2(String string, int i) {
        if (string.length() == i) {
            System.out.println("They are equal");
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

    public static void task4(int[] intArr) {
        int count = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        for (int i = 0, j = 0; i < intArr.length; i++) {
            if (intArr[i] >= 0) {
                newArr[j] = intArr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    //Task5
    /*
    Write a method that accepts an int array. Print out the array using the same format as Arrays.toString method. DO NOT USE THE toString() METHOD.
    [element, element, element]
     */

    public static void task5(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str += arr[i] + ", ";
            } else {
                str += arr[i] + "]";
            }
        }
        System.out.println(str);
    }

    //Task6
    /*
    Write a method that will take a String of numbers (9843263 for example) and an int.
    Add that second given number to each other number and show each operation result as separate elements of an int array

    input: 9843263, 1
    output: [10,9,5,4,3,7,4]

    -or-

    input: 29237347, 2
    output: [4,11,4,5,9,5,6,9]
     */

    public static void task6(String str, int num) {
        int[] arrInt = new int[str.length()];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(str.charAt(i) + "") + num;
        }
        System.out.println(Arrays.toString(arrInt));
    }

    //Task7
    /*
    Write a method that will take three arguments: the hour, the minutes, and a boolean ( AM will be true, PM will be false)
    Use the given information to print out the time in this format:
    Hours : minutes amOrPM

    — Hours should be in the range 1-12, minutes should be in the range from 1 to 59.
    If either of those information provided is not valid, do not continue your program, just print “Invalid time information given

    input: 4, 39, true
    Output: 4 : 39 AM
     */

    public static void task7(int hours, int minutes, boolean dayTime) {
        if (hours >= 1 && hours <= 12 && minutes >= 1 && minutes <= 59) {
            if (dayTime == true){
                System.out.println(hours + " : " + minutes + " AM");
            }else {
                System.out.println(hours + " : " + minutes + " PM");
            }
        } else {
            System.out.println("Invalid time information given");
        }
    }

    public static void main(String[] args) {

        int[] arr = {-243, 1, -25, 523, 253, -142, 3, -4};

//        countWords("The number of words in the sentence is: numberOfWords");
//        task2("Not", 3);
//        task3(arr);
//        task4(arr);
//        task5(arr);
//        task6("29237347", 2);
//        task7(2,59,false);
    }

}
