package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tasks {

    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Create String array size of 4;
    Store 4 names in that array. Give a proper name for your array variable.
    Make sure to assign value for every single index. Print out second and third names on separate lines.
     */
    public static void printFromArray() {
        String[] names = new String[4];

        names[0] = "John";
        names[1] = "William";
        names[2] = "Patrick";
        names[3] = "Loh";

        System.out.println(names[1]);
        System.out.println(names[2]);

    }

    //Task2
    /*
    Declare and initialize double array for prices.
    Store following prices:
    45.99, 23.5, 11.50, 33.33, 99.99.
    Print the values then change the last element to 112.89.
    Print all values again
     */
    public static void printAndChange() {
        double[] arr = {45.99, 23.5, 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(arr));
        arr[arr.length - 1] = 112.89;
        System.out.println(Arrays.toString(arr));
    }

    //Task3
    /*
    Create String array for the colors.
    Initialize 4 colors.
    Loop through each element using for loop and print each color names.

    Part II
    Print the color names if the length of the color is 4 or more.
     */
    public static void color() {
        String[] colors = {"Blue", "Black", "Orange", "White"};
        for (String color : colors) {
            System.out.println(color);
        }
    }

    //Task4
    /*
    Create String array for students. Initialize with students below: James, Sam, Adam, Elize, Jamie, Benzema, Sandy
    Loop through each elements of students.
    - print last character of each name on each line.

    - Part II
    * Modify the loop and print the student names whose name ends with "s";

    - Part III
    * Modify and print the student if it contains "s"

    Part IV
    * Read the String from the user using Scanner and print out the students that contains the entered String keyword by user.
     */
    public static void lastCharachterOfEach() {
        String[] names = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy"};
        System.out.println("Enter content");
        String str = scanner.nextLine().toLowerCase();

        for (int i = 0; i < names.length; i++) {
            if (String.valueOf(names[i].charAt(names[i].length() - 1)).equals("s")) {
                System.out.println(names[i]);
            }
            if (names[i].contains("s") || names[i].contains("S")) {
                System.out.println(names[i]);
            }
            if (names[i].toLowerCase().contains(str)) {
                System.out.println(names[i]);
            }
            System.out.println(names[i].charAt(names[i].length() - 1));
        }
    }

    //Task5
    /*
    Write a program that will ask user to enter 5 names. Take each name and store all the names into an array. Print the array

    Part 2
    Modify the above program to first ask the user how many names they want to enter, then allow them to enter those names
     */
    public static void fiveNames() {
        System.out.println("How many names do you wanna enter?");
        String[] names = new String[scanner.nextInt()];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name # " + (i + 1));
            names[i] = scanner.next();
        }
        System.out.println(Arrays.toString(names));
    }

    //Task6
    /*
    Create an array with 50 random numbers in the range of 1-100. Then print the array
     */
    public static void fiftyNumbers() {
        Random random = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task7
    /*
    Given an array with values of: 1,2,-3,4,-34,55,78,90,33,10
    Take our all the even numbers from the array and put them into a new array. Print the new array
     */
    public static void removeAllEven() {
        int[] arr = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] newArr = new int[count];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    //Task8
    /*
    Given numbers of 3,30,14,6,50,20
    Find and print the biggest number
     */
    public static void biggestNumber() {
        int[] nums = {3, 30, 14, 6, 50, 20};
        int biggestNumber = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggestNumber) {
                biggestNumber = nums[i];
            }
        }
        System.out.println(biggestNumber);
    }

    //Task9
    /*
    Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
    Go through the array and print the value if there is multiple words.
     */
    public static void multipleWords() {
        String[] words = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};

        for (int i = 0; i < words.length; i++) {
            if (words[i].trim().contains(" ")) {
                System.out.println(words[i]);
            }
        }
    }

    //Task10
    /*
    Given a Strings of "Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", “Fran2113gmailcom", “JamieM@yahoo.com"
    Print all the emails that are valid. A valid email has the ‘@‘ sign that comes before the ‘.’
     */
    public static void allValidEmails() {
        String[] emails = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com"};

        for (int i = 0; i < emails.length; i++) {
            System.out.println(i);
            if (emails[i].contains("@") &&
                    emails[i].substring(0, emails[i].indexOf("@")).length() >= 1 &&
                    emails[i].substring(emails[i].indexOf("@") + 1, emails[i].indexOf(".")).length() >= 1 &&
                    emails[i].endsWith(".com")) {
                System.out.println("good" + i);
            }
        }

    }

    //Task11
    /*
    Given you have two arrays with values of:
    3,2,6,43,7,20 and
    2,7,-10,10,-5,2
    Write a program that adds the two values and stores them into a new array. Print the final array
     */
    public static void bigArr() {
        int[] nums1 = {3, 2, 6, 43, 7, 20};
        int[] nums2 = {2, 7, -10, 10, -5, 2};
        int[] newArr = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            newArr[i] = nums1[i];
        }
        for (int i = nums1.length, j = 0; i < newArr.length; i++) {
            newArr[i] = nums2[j];
            j++;
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
//        printFromArray();
//        printAndChange();
//        color();
//        lastCharachterOfEach();
//        fiveNames();
//        fiftyNumbers();
//        removeAllEven();
//        biggestNumber();
//        multipleWords();
//        allValidEmails();
        bigArr();

    }
}
