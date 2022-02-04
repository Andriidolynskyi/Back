package begin;

import java.util.Arrays;

public class OverloadingMethods {

    //Task1
    /*
    Create a method that will take a String array and a String.
    Increase your array capacity and add the given String as the last element of the new array. Return the new array

    New task: Overload the previous method to take a String array, a String to add to the array, and number position where the new element should be added

    ["james", "adam" , "joe"]
    method(arr, "bond", 1)
    before: ["james", "adam" , "joe", "bond"]
    after: ["james", "bond", adam" , "joe"]
     */

    public static String[] task1(String[] strArr, String str) {
        String[] newArr = Arrays.copyOf(strArr, strArr.length + 1);
        newArr[newArr.length - 1] = str;
        return newArr;
    }

    public static String[] task1(String[] strArr, String str, int position) {
        String[] newArr = new String[strArr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = str;
                continue;
            }
            newArr[i] = strArr[j];
            j++;
        }
        return newArr;
    }

    //Task2
    /*
    We have a method that reverses a String, overload it to accept an int array and reverse the elements in the array.
    Return the reversed array. Also over load the method to accept a String array and reverse the elements in that array.
    Return the reserved array.
     */

    public static int[] task2(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }

    public static String[] task2(String[] arr) {
        String[] newArr = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }

    //Task3
    /*
    Create a method that takes a String, it will print the first characters

    Then overload the method to take a String, and an index. And print the character found at that index

    Then overload the method to take a String and two numbers.
    Take the substring of the String based on the two numbers provided.
    Return the length of the substring String
     */

    public static String task3(String str){
        return str.charAt(0)+"";
    }

    public static String task3(String str,int position){
        return str.charAt(position)+"";
    }

    public static int task3(String str, int position1, int position2){
        return str.substring(position1,position2).length();
    }

    public static void main(String[] args) {
        String[] arr = {"james", "adam", "joe"};
        int[] arrInt = {45, 23, 6, -3, 66};

//        System.out.println(Arrays.toString(task1(arr, "bond")));
//        System.out.println(Arrays.toString(task1(arr, "Bond", 1)));

//        System.out.println(Arrays.toString(task2(arrInt)));
//        System.out.println(Arrays.toString(task2(arr)));

//        System.out.println(task3("Bond"));
//        System.out.println(task3("Bond",3));
//        System.out.println(task3("dfgvdfvsfdvdfb",2,6));
    }

}
