import java.util.Arrays;

public class Tasks2 {

    //Print duplicate characters from String?
    public static void printDuplicate(String str) {
        String empty = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && !empty.contains(str.charAt(i) + "")) {
                empty += str.charAt(i);
                System.out.println(str.charAt(i) + "");
            }
        }
    }

    //Check if two Strings are anagrams of each other?
    public static void isAnagram(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }

    //Reverse a given String using recursion?
    public static String recursion(String str) {
        if (str.length() < 2) {
            return str;
        }

        return recursion(str.substring(1)) + str.charAt(0);
    }

    public static void recursion2(int number) {
        if (number < 10) {
            System.out.print(number);
            return;
        }
        System.out.print(number % 10);
        recursion2(number / 10);
    }

    //Count many vowels and consonants in a given String?
    public static void vowelsAndConsonants(String str) {
        int countVowels = 0;
        int countConsonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    countVowels++;
                    break;
                default:
                    countConsonants++;
            }
        }
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonats: " + countConsonants);
    }

    //Find the duplicate number on a given integer array?
    public static void duplicateIntegers(int[] arr) {
        String empty = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1 && !empty.contains(String.valueOf(arr[i]))) {
                empty += arr[i];
                System.out.println(arr[i]);
            }
        }
    }

    //The largest and smallest number in an unsorted integer array?
    public static void smallestAndLargest(int[] arr) {
        int smallest = arr[0];
        int bigger = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
            if (bigger < arr[i]) {
                bigger = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(bigger);
    }

    //Find all pairs of integer arrays whose sum is equal to a given number?
    public static void pairs(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    break;
                }

            }
        }
    }

    //Remove duplicate from array
    public static void removeDuplicate(int[] arr) {
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 0) {
                length++;
            }
        }
        int[] newArr = new int[length];
        for (int i = 0, k = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 0) {
                newArr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    //Reverse an array
    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            arr[i] += arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] -= arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        printDuplicate("Javac");
        isAnagram("bla", "bla");
        System.out.println(recursion("ja"));
        recursion2(123);
        System.out.println();
        vowelsAndConsonants("adiob");
        int[] arr = {1, 2, 6, 3, 9, 11, 3};
        duplicateIntegers(arr);
        smallestAndLargest(arr);
        pairs(arr, 9);
        removeDuplicate(arr);
        reverseArray(arr);


    }


}
