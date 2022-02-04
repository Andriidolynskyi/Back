package begin;

import java.util.*;

public class ArrayPractis {

    static Scanner scanner = new Scanner(System.in);


    //Task1
    /*
    Create String array size of 4;
    Store 4 names in that array. Give a proper name for your array variable.
    Make sure to assign value for every single index. Print out second and third names on separate lines.
     */

    public static void task1() {
        String[] arr = new String[4];


        for (int i = 0; i < arr.length; i++) {
            String str = scanner.nextLine();
            arr[i] = str;
        }
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    //Task2
    /*
    Declare and initialize double array for prices.
    Store following prices:
    45.99, 23.5, 11.50, 33.33, 99.99.
    Print the values then change the last element to 112.89.
    Print all values again
     */

    public static void task2() {
        Double[] arr = {45.99, 23.5, 11.50, 33.33, 99.99};

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

    public static void task3() {
        String[] arr = {"green", "white", "black", "yellow"};

        for (String s : arr) {
            System.out.println(s);
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

    public static void task4() {
        String[] student = {"James", "Sam", "Adams", "Elize", "Jamie", "Benzema", "Sandy"};

//        for (String s : student) {
//            System.out.println(s.charAt(s.length() - 1));
//        }

//        for (String s : student) {
//            if (s.charAt(s.length() - 1) == 115) {
//
//                System.out.println(s);
//            }
//        }

        for (String s : student) {
            if (s.contains("s")) {
                System.out.println(s);
            }
        }

    }

    //Task5
    /*
    Write a program that will ask user to enter 5 names. Take each name and store all the names into an array. Print the array

    Part 2
    Modify the above program to first ask the user how many names they want to enter, then allow them to enter those names
     */

    public static void task5() {
        System.out.println("How many name do you wanna entering");
        int count = scanner.nextInt();
        String[] arr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name: ");
            arr[i] = scanner.next();
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task6
    /*
    Create an array with 50 random numbers in the range of 1-100. Then print the array
     */

    public static void task6() {
        Random random = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Task7
    /*
    Given an array with values of: 1,2,-3,4,-34,55,78,90,33,10
    Take our all the even numbers from the array and put them into a new array. Print the new array
     */

    public static void task7() {
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

    public static void task8() {
        int[] arr = {3, 30, 14, 6, 50, 20};
        int biggestNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggestNumber) {
                biggestNumber = arr[i];
            }
        }
        System.out.println(biggestNumber);
    }

    //Task9
    /*
    Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
    Go through the array and print the value if there is multiple words.
     */

    public static void task9() {
        String[] arr = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};
        for (int i = 0; i < arr.length; i++) {
            String[] temp = arr[i].split(" ");
            if (temp.length >= 2) {
                System.out.println(arr[i]);
            }
        }
    }

    //Task10
    /*
    Given a Strings of "Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", “Fran2113gmailcom", “JamieM@yahoo.com"
    Print all the emails that are valid. A valid email has the ‘@‘ sign that comes before the ‘.’
     */

    public static void task10() {
        String[] arr = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com"};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("@") && arr[i].endsWith(".com") && arr[i].substring(arr[i].indexOf("@"), arr[i].indexOf(".") - 1).length() > 1) {
                System.out.println(arr[i]);
            }
        }
    }

    //Task11
    /*
    Write a program and create String array called cities. Initialize the cities with cities below:
    Chicago, New York, Madison, Miami, Washington
    Iterate through each city and check if Chicago is inside the cities.
    Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.

    Part 2:
    Print the number of times Chicago was found in the cities
     */

    public static void task11() {
        String[] cities = {"Chicago", "New York", "Madison", "Miami", "Washington"};
        boolean check = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase("Chicago")) {
                check = true;
            }
        }
        if (check) {
            System.out.println("Windy cities founded");
        } else {
            System.out.println("Windy cities not founded");
        }
    }

    //Task12
    /*
    Given a String array with value of:
    "Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
    Print out how many of the words begin with uppercase letters
     */

    public static void task12() {
        String[] arr = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        int count = 0;
        for (String str : arr) {
            if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
                count++;
            }
        }
        System.out.println(count);
    }

    //Task13
    /*
    Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
    Print out the biggest and smallest values in the array
     */

    public static void task13() {
        int[] arr = {31, 20, 25, 20, 3, 48, 26, 12};

        int biggerNumber = arr[0];
        int smollerNumber = arr[0];

        for (int i : arr) {
            if (i > biggerNumber) {
                biggerNumber = i;
            }
            if (i < smollerNumber) {
                smollerNumber = i;
            }
        }
        System.out.println("Smoller number: " + smollerNumber);
        System.out.println("Bigger number: " + biggerNumber);
    }

    //Task14
    /*
    Given an array of values: 23, 1, 34, 3, 54, 54, 51, 54
    Print the biggest two values. Only Unique values
    > The result here should be:
    54
    51
     */

    public static void task14() {
        int[] arr = {75, 75, 23, 1, 34, 3, 54, 54, 51, 54};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int firstBigger = arr[arr.length - 1];
//        int secondBigger = arr[arr.length - 1];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] < firstBigger) {
//                secondBigger = arr[i];
//                break;
//            }
//        }

        int firstBigger = arr[0];
        int secondBigger = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (firstBigger < arr[i]) {
                firstBigger = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondBigger) {
                secondBigger = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondBigger < arr[i] && arr[i] < firstBigger) {
                secondBigger = arr[i];
            }
        }
        System.out.println("First biggest number: " + firstBigger);
        System.out.println("Second biggest number: " + secondBigger);
    }

    //Task15
    /*
    1. declare array and store elements
    {45,23,6,-3,66}
    2. print out the index of -3 if it exists in the array.
     */

    public static void task15() {
        int[] arr = {45, 23, 6, -3, 66};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, -3));
    }

    //Task16
    /*
    Given you have a library of 5 books. Write a program that will ask user to enter the name of one of the books.
    If the book is in the library, ask the user what book they replace the original book with.
    If the book the user enters is not in the library, print “library not changed”.
    In both cases print out the library for the user to see.

    String [] books = {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};
     */

    public static void task16() {
        String[] books = {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};

        System.out.println("What kind of book are you looking for?");
        String book = scanner.nextLine();
//
//        List<String> intList = new ArrayList<>(Arrays.asList(books));
//        boolean containsSearchStr = intList.stream().anyMatch(book::equalsIgnoreCase);
//        if (containsSearchStr) {
//            for (int i = 0; i < books.length; i++) {
//                if (books[i].equalsIgnoreCase(book)) {
//                    books[i] = book;
//                }
//            }
//        } else {
//            System.out.println("Not contain");
//        }
//        System.out.println(Arrays.toString(books));

        Arrays.sort(books);
        int index = Arrays.binarySearch(books, book);

        if (index >= 0) {
            System.out.println("Found");
            System.out.println("What book are you back?");
            books[index] = scanner.nextLine();
            System.out.println(Arrays.toString(books));
        } else {
            System.out.println("Not found");
            System.out.println(Arrays.toString(books));
        }
    }

    //Task17
    /*
    Given the String:
    "Write a program that creates a group of given size thisisabigword”
    Find the biggest word in your String and print it.
     */

    public static void task17() {

    }

    //Task18
    /*
     Given the String: “It started to snow in Chicago”
    Reverse each individual word and print the result
    > expected output:
    tI detrats ot wons ni ogacihC
     */

    public static void task18() {
//        String str = "It started to snow in Chicago";
//        String newStr = "";
//
//        String[] arrStr = str.split(" ");
//
//        for (int i = 0; i < arrStr.length; i++) {
//            for (int j = arrStr[i].length() - 1; j >= 0; j--) {
//                newStr += arrStr[i].charAt(j);
//            }
//            newStr += " ";
//        }
//        System.out.println(newStr.trim());
    }


    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
//        task16();


//        task18();

    }


}
