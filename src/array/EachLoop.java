package array;

import java.util.Arrays;
import java.util.Scanner;

public class EachLoop {

    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Write a program and create String array called cities. Initialize the cities with cities below:
    Chicago, New York, Madison, Miami, Washington
    Iterate through each city and check if Chicago is inside the cities.
    Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.

    Part 2:
    Print the number of times Chicago was found in the cities
     */
    public static void windyCities() {

        String[] cities = {"Chicago", "New York", "Madison", "Miami", "Washington"};

        if (Arrays.toString(cities).contains("Chicago")) {
            System.out.println("Windy city is here");
        } else {
            System.out.println("Windy city not here");
        }

//        boolean check = false;
//
//        for (String s : cities) {
//            if (s.equalsIgnoreCase("Chicago")) {
//                check = true;
//                break;
//            }
//        }
//        if (check) {
//            System.out.println("Windy city is here");
//        } else {
//            System.out.println("Not found windy city");
//        }
    }

    //Task2
    /*
    Given a String array with value of:
    "Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
    Print out how many of the words begin with uppercase letters
     */
    public static void upperCases() {
        String[] words = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};

        int count = 0;
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }
        System.out.println(count);
    }

    //Task3
    /*
    Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
    Print out the biggest and smallest values in the array
     */
    public static void smallestAndBigger() {
        int[] nums = {31, 20, 25, 20, 3, 48, 26, 12};

        int smallest = nums[0];
        int biggest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest) {
                biggest = nums[i];
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println(biggest);
        System.out.println(smallest);
    }

    //Task4
    /*
    Given an array of values: 23, 1, 34, 3, 54, 54, 51, 54
    Print the biggest two values. Only Unique values
    > The result here should be:
    54
    51
     */
    public static void twoBiggest() {
        int[] nums = {256, 1, 34, 3, 54, 54, 51, 54};

        int biggest = nums[0];
        int secondBiggest = nums[1];

        for (int num : nums) {
            if (num > biggest) {
                biggest = num;
            }
            if (num > secondBiggest && num < biggest) {
                secondBiggest = num;
            }
        }
        System.out.println(biggest);
        System.out.println(secondBiggest);
    }

    //Task5
    /*
    1. declare array and store elements
    {45,23,6,-3,66}
    2. print out the index of -3 if it exists in the array.
     */
    public static void task5() {
        int[] nums = {45, 23, 6, -3, 66};

        Arrays.sort(nums);

        System.out.println(Arrays.binarySearch(nums, -3));
    }

    //Task6
    /*
    Given you have a library of 5 books. Write a program that will ask user to enter the name of one of the books.
    If the book is in the library, ask the user what book they replace the original book with.
    If the book the user enters is not in the library, print “library not changed”. In both cases print out the library for the user to see.

    String [] books = {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};
     */
    public static void task6() {
        String[] books = {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};
        System.out.println("What book are you looking for?");
        String bookLooking = scanner.nextLine();
        System.out.println("To what book exchange?");
        String bookExchange = scanner.nextLine();

        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

        int index = Arrays.binarySearch(books, bookLooking);

        if (index >= 0) {
            books[index] = bookExchange;
            System.out.println(Arrays.toString(books));
        } else {
            System.out.println("library not changed");
        }

    }

    //Task7
    /*
    Given the String:
    "Write a program that creates a group of given size thisisabigword”
    Find the biggest word in your String and print it.
     */
    public static void task7() {
        String str = "Write a program that creates a group of given size thisisabigword";

        String[] strArr = str.split(" ");

        String biggestWord = "";

        for (int i = 0; i < strArr.length; i++) {
            if (biggestWord.length() < strArr[i].length()) {
                biggestWord = strArr[i];
            }
        }
        System.out.println(biggestWord);
    }

    //Task8
    /*
    Given the String: “It started to snow in Chicago”
    Reverse each individual word and print the result
    > expected output:
    tI detrats ot wons ni ogacihC
     */
    public static void task8() {
        String str = "It started to snow in Chicago";
        String[] arrStr = str.split(" ");
        String rev = "";

        for (int i = 0; i < arrStr.length; i++) {
            for (int j = arrStr[i].length() - 1; j >= 0; j--) {
                rev += arrStr[i].charAt(j);
            }
            rev += " ";
        }
        System.out.println(rev.trim());
    }

    public static void main(String[] args) {
//        windyCities();
//        upperCases();
//        smallestAndBigger();
//        twoBiggest();
//        task5();
//        task6();
//        task7();
        task8();

    }
}
