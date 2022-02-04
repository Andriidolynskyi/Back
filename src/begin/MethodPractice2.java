package begin;

import java.util.Arrays;
import java.util.Random;

public class MethodPractice2 {

    static Random random = new Random();

    //Task1
    /*
    Create a method for logging in. User passes the username and password as parameters.
    If the passed values are the same as the given username and password return true, but if either the username or password is invalid return false
    Username: james123
    Password: password
     */

    public static boolean task1(String username, String password) {
        String user = "Andrii";
        String pass = "andrii";
        if (username.equalsIgnoreCase(user) && password.equals(pass)) {
            return true;
        }
        return false;
    }

    //Task2
    /*
    Create a method that will accept a String and will reverse your String. Return the reversed String.
     */

    public static String task2(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
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

    public static String task4(String day) {
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            return "Weekday";
        }
        return "Not";
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
    Create a method that will take a String array and a String.
    Increase your array capacity and add the given String as the last element of the new array. Return the new array
     */

    public static String[] task6(String[] arrStr, String str) {
        String[] newArrStr = new String[arrStr.length + 1];
        for (int i = 0; i < arrStr.length; i++) {
            newArrStr[i] = arrStr[i];
        }
        newArrStr[newArrStr.length - 1] = str;
        return newArrStr;
    }

    //Task7
    /*
    Create a method that will generate a random int array. The method takes the size of the array and the bound of the random numbers. Return the random array
     */

    public static int[] task7(int size, int bound) {
        int[] arrInt = new int[size];
        for (int i = 0; i < size; i++) {
            arrInt[i] = random.nextInt(bound + 1);
        }
        return arrInt;
    }

    //Task8
    /*
    Given a String of numbers. Return the difference between the biggest and smallest number
    input: "8323234"
    output: 6
     */

    public static int task8(String numbers) {
        String[] arrNumbers = numbers.split("");
        int biggestNumber = Integer.parseInt(arrNumbers[0]);
        int smallerNumber = Integer.parseInt(arrNumbers[0]);

        for (int i = 0; i < arrNumbers.length; i++) {
            if (biggestNumber < Integer.parseInt(arrNumbers[i])) {
                biggestNumber = Integer.parseInt(arrNumbers[i]);
            }
            if (smallerNumber > Integer.parseInt(arrNumbers[i])) {
                smallerNumber = Integer.parseInt(arrNumbers[i]);
            }
        }
        return biggestNumber - smallerNumber;
    }

    //Task9
    /*
    Create a calculator method that will take three arguments: an operator ( +, -, *, /, %) and two numbers.
    Perform that operation between the two numbers and return the result
     */

    public static double task9(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
        }
        return 0.00;
    }

    //Task10
    /*
    About 293,329,202 results (0.78 seconds)

    Write a method that extracts the result number and returns it as only numbers
    output: 293329202

    Write a method that takes the extracts the result time and returns it as a number and the seconds
    output: 0.78
     */

    public static int task10(String str){
        String newStr = "";
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {-243, 1, -25, 523, 253, -142, 3, -4};
        String[] books = {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};
//        System.out.println(task1("Andrii", "andrii"));
//        System.out.println(task2("reverse"));
//        System.out.println(task3("civids"));
//        System.out.println(task4("Saturday"));
//        System.out.println(task5(arr));
//        System.out.println(Arrays.toString(task6(books,"Book")));
//        System.out.println(Arrays.toString(task7(5, 25)));
//        System.out.println(task8("8323234"));
        System.out.println(task9(23,10,'+'));

    }


}
