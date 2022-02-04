package begin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArray {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Create a 2D int array that has 3 inner arrays with some initial values. Print out the length of each inner array.
    > Given int array of [[4,2,3], [3232,11,13, 4, 2], [23,13]]
    Length of row 1: 3
    Length of row 2: 5
    Length of row 3: 2
     */

    public static void task1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Length of row: " + (i + 1) + " " + arr[i].length);
        }
    }

    //Task2
    /*
    Create a 2D String array that will hold 3 groups. Create three 1D arrays and initialize them with some group members names.
    Store each 1D array into your 2D and print the 2D array at the end
    > group one should have 4 names, group two should have 2 names, and group three should have 3 names
     */

    public static void task2() {
        int[][] arr = new int[3][0];
        int[] d1Arr1 = {3, 5, 2, 342, 4, 23};
        int[] d1Arr2 = {43, 32, 4032, 32, 43};
        int[] d1Arr3 = {43, 43, 23, 23};

        arr[0] = d1Arr1;
        arr[1] = d1Arr2;
        arr[2] = d1Arr3;

        System.out.println(Arrays.deepToString(arr));
    }

    //Task3
    /*
    Create a method that will return the biggest numbers from a 2D array
    parameters: m(int [][] 2dArr)
     */

    public static void task3() {
        int[][] arr = {{4, 2, 3}, {3232, 11, 13}, {4, 2}, {23, 13}};
        int biggestNumber = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > biggestNumber) {
                    biggestNumber = arr[i][j];
                }
            }
        }
        System.out.println(biggestNumber);
    }

    //Task4
    /*
    Create a method that takes a 2D array and return the index of the inner array which has the biggest sum of its elements
     */

    public static void task4() {
        int[][] arr = {{4, 2, 3}, {32, 11, 13}, {4, 2}, {23, 13}};
        int index = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[i].length; j++) {
                temp += arr[i][j];
            }
            if (temp > sum) {
                sum = temp;
                index = i;
            }
        }
        System.out.println(index);
    }

    //Task5
    /*
    Create a method that will generate a random 2D int array.
    Take two parameters.
    The first one for how many 1D arrays you want, and second how many elements each 1D array should have

    public static int [][] methodName(int num, int num2)
     */

    public static void task5(int howManyArrays, int howManyElements) {
        int[][] arr = new int[howManyArrays][howManyElements];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }

    //Task6
    /*
    Create a method that will take 2d array and return the difference between the sum of the diagonals
     */

    public static void task6() {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }

    //Task7
    /*
    Create a program that will ask the user to enter how many groups they have. Then ask the user to enter how many students are in each group. 
    Allow the user to enter each name of the people in each group. Print the 2D array of all the groups at the end
     */

    public static void task7() {
        System.out.println("How many groups");
        int groups = scanner.nextInt();
        System.out.println("How many students in each groups");
        int students = scanner.nextInt();

        String[][] arr = new String[groups][students];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter student name");
                arr[i][j] = scanner.next();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String[] args) {
        int[][] arr = {{4, 2, 3}, {3232, 11, 13}, {4, 2}, {23, 13}};

//        task1(arr);
//        task2();
//        task3();
//        task4();
//        task5(4, 5);
//        task6();
        task7();


    }

}
