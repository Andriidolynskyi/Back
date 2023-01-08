package methods;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnTasks {

    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    Create a method for logging in. User passes the username and password as parameters.
    If the passed values are the same as the given username and password return true, but if either the username or password is invalid return false
    Username: james123
    Password: password
     */
    public static boolean task1(String username, String password) {
        String uName = "james123";
        String uPassword = "password";

        if (uName.equalsIgnoreCase(username) && uPassword.equals(password)) {
            return true;
        }
        return false;
    }

    //Task2
    /*
    Create a method that will accept a String and will reverse your String. Return the reversed String.
     */
    public static String task2(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    //Task3
    /*
    Create a method that will take a String as a parameter and return if the String is palindrome or not
     */
    public static String task3(String str) {
        boolean check = true;

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                check = false;
                break;
            }
        }
        if (check) {
            return "Palindrome";
        }
        return "Not Palindrome";
    }

    //Task4
    /*
    Write a method that will tell you if it is the weekday or not. The method takes a String, Saturday and Sunday are the only weekend days
     */
    public static String task4(String str) {
        if (str.equalsIgnoreCase("monday") ||
                str.equalsIgnoreCase("tuesday") ||
                str.equalsIgnoreCase("wednesday") ||
                str.equalsIgnoreCase("thursday") ||
                str.equalsIgnoreCase("friday")) {
            return "weekday";
        }
        if (str.equalsIgnoreCase("saturday") ||
                str.equalsIgnoreCase("sunday")) {
            return "weekend day";
        }
        return "invalid day";
    }

    //Task5
    /*
    Create a method that will count how many even numbers there is from the given int array and return the counted amount
     */
    public static int task5(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Task6
    /*
    Create a method that will take a String array and a String. Increase your array capacity and add the given String as the last element of the new array. Return the new array
     */
    public static String[] task6(String[] str, String additionStr) {
        String[] newStr = Arrays.copyOf(str, str.length + 1);
        newStr[newStr.length - 1] = additionStr;
        return newStr;
    }


    public static void main(String[] args) {
//        System.out.println(task1("james123", "password"));
//        System.out.println(task2("blablacar"));
//        System.out.println(task3("civic"));
//        System.out.println(task5("Monday"));
//        System.out.println(task4("saturday"));
//        int[] nums = {243,34,5243,132,123,255,534,243,456};
//        System.out.println(task5(nums));
        String[] str = {"Adam", "John", "Willis"};
        System.out.println(Arrays.toString(task6(str, "Blabla")));


    }
}
