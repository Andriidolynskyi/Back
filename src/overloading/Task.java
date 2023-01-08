package overloading;

import java.util.Locale;

public class Task {

    //Task1
    /*
    We have a method that reverses a String, overload it to accept an int array and reverse the elements in the array.
    Return the reversed array. Also over load the method to accept a String array and reverse the elements in that array.
    Return the reserved array.
     */
    public static void task1() {

    }

    //Task2
    /*
    Create a method that takes a String, it will print the first characters
    Then overload the method to take a String, and an index. And print the character found at that index
    Then overload the method to take a String and two numbers. Take the substring of the String based on the two numbers provided. Return the length of the substring String
     */
    public static String task2(String str) {
        return str.charAt(0) + "";
    }

    public static String task2(String str, int index) {
        return str.charAt(index) + "";
    }

    //Task3
    /*
    Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and then the firstWord again
    > input: “day”, “name”
    > output: “daynameday”

    Overload the method above to now accept the two Strings and an integer.
    The integer given tells you how many times your first word should show up in your new String.
    Your first words need to always be separated by the second word.

    > input: “day”, “name”, 0
    > output: ""

    > input: "day", "name", 1
    > output: "day"

    > input: “day”, “name”, 3
    > output: “daynamedaynameday”
     */
    public static String task3(String firstWord, String secondWord) {
        return firstWord.concat(secondWord);
    }

    public static String task3(String firstWord, int times) {
        String empty = "";
        for (int i = 0; i < times; i++) {
            empty += firstWord;
        }
        return empty;
    }

    //Task4
    /*
    Create a method that will accept two Strings. Return true if the first string begins with the second String. Return false if it does not.

    Overload the method to accept a two Strings and a number. Return true if the second String is found inside of your first String the amount of times equal to your number parameter.
    input: “Djamesjajl”,”ja", 2
    output: true

    input: “jamesjajl”,”ja", 3
    output: false
     */
    public static boolean task4(String str1, String str2) {
        if (String.valueOf(str1.charAt(0)).equalsIgnoreCase(String.valueOf(str2.charAt(0)))) {
            return true;
        }
        return false;

    }

    public static boolean task4(String str1, String str2, int times) {
        int count = 0;

        for (int i = 0; i < str1.length() - str2.length() - 1; i++) {
            if (str1.substring(i, i + str2.length()).equalsIgnoreCase(str2)) {
                count++;
            }
        }
        if (count == times) {
            return true;
        }
        return false;
    }

    //Task5
    /*
    Create a method that will accept an int array. Add up all the numbers in your array, except for numbers that end with 5. Return the sum
    Overload your method to take an int array and a number. Now return the sum of all the numbers, except for the numbers that end with the given number. Return the sum
     */
    public static int task5(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 != 5) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int task5(int[] nums, int a) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 != a) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(task2("Blabla"));
//        System.out.println(task2("Bla"));

//        System.out.println(task3("day", "name"));
//        System.out.println(task3("day", 3));

//        System.out.println(task4("name", "Nick"));
//        System.out.println(task4("Djamesjajl", "ja", 2));

        int[] nums = {12, 34, 50, 25, 15, 84, 55};
        System.out.println(task5(nums));
        System.out.println(task5(nums,4));


    }
}
