package begin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

    /*
    charAt()	Returns the character at the specified index (position)	char
    compareTo()	Compares two strings lexicographically	int
    compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
    concat()	Appends a string to the end of another string	String
    contains()	Checks whether a string contains a sequence of characters	boolean
    endsWith()	Checks whether a string ends with the specified character(s)	boolean
    equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
    equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
    indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
    isEmpty()	Checks whether a string is empty or not	boolean
    lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
    length()	Returns the length of a specified string	int
    matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
    replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
    replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
    replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
    split()	Splits a string into an array of substrings	String[]
    startsWith()	Checks whether a string starts with specified characters	boolean
    substring()	Returns a new string which is the substring of a specified string	String
    toCharArray()	Converts this string to a new character array	char[]
    toLowerCase()	Converts a string to lower case letters	String
    toString()	Returns the value of a String object	String
    toUpperCase()	Converts a string to upper case letters	String
    trim()	Removes whitespace from both ends of a string	String
    valueOf()	Returns the string representation of the specified value	String
     */

public class StringTasks {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

//        credentials();
//        sendTheMessage();
//        allStringMethods();
//        moveWordToTheEnd();
//        accountNumber();
//        createEmail();
        separate();


    }

    public static void allStringMethods() {
        String java = "java";

        // 1 - charAt()	Returns the character at the specified index (position)	char
        System.out.println("charAt()--> " + java.charAt(1));

        // 2 - compareTo()	Compares two strings lexicographically	int
        System.out.println("compareTo()--> " + java.compareTo("java"));

        // 3 - compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
        System.out.println("compareToIgnoreCase()--> " + java.compareToIgnoreCase("Java"));

        // 4 - concat()	Appends a string to the end of another string	String
        System.out.println("concat()--> " + java.concat("java"));

        // 5 - contains()	Checks whether a string contains a sequence of characters	boolean
        System.out.println("contains()--> " + java.contains("ja"));

        // 6 - endsWith()	Checks whether a string ends with the specified character(s)	boolean
        System.out.println("endsWith()--> " + java.endsWith("s"));

        // 7 - equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
        System.out.println("equals()--> " + java.equals("java"));

        // 8 - equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
        System.out.println("equalsIgnoreCase()--> " + java.equalsIgnoreCase("JAVA"));

        // 9 - indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
        System.out.println("indexOf()--> " + java.indexOf("j"));

        // 10 - isEmpty()	Checks whether a string is empty or not	boolean
        System.out.println("isEmpty()--> " + java.isEmpty());

        // 11 - lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
        System.out.println("lastIndexOf()--> " + java.lastIndexOf("v"));

        // 12 - length()	Returns the length of a specified string	int
        System.out.println("length()--> " + java.length());

        // 13 - replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
        System.out.println("replace()--> " + java.replace("a", "2"));

        // 14 - replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
        System.out.println("replaceFirst()--> " + java.replaceFirst("a", "2"));

        // 15 - replaceAll() Replaces each substring of this string that matches the given regular expression with the given replacement String
        System.out.println("replaceAll()--> " + java.replaceAll("a", "2"));

        // 16 - split()	Splits a string into an array of substrings	String[]
        String[] arr = java.split("");
        System.out.println("split()--> " + Arrays.toString(arr));

        // 17 - startsWith() Checks whether a string starts with specified characters	boolean
        System.out.println("startsWith()--> " + java.startsWith("v"));

        // 18 - substring()	Returns a new string which is the substring of a specified string	String
        System.out.println("substring()--> " + java.substring(0, 3));

        // 19 - toCharArray() Converts this string to a new character array	char[]
        char[] charArr = java.toCharArray();
        System.out.println("toCharArray()--> " + Arrays.toString(charArr));

        // 20 - toLowerCase()	Converts a string to lower case letters	String

        // 21 - toString()	Returns the value of a String object	String

        //22 -  toUpperCase()	Converts a string to upper case letters	String

        //23 -  trim()	Removes whitespace from both ends of a string	String

    }

    //Task1
    /*
    Credentials: Given two existing data: user and pass of “test” and “test123”
    Write a program that asks users to enter a username and password.
    —> If the username and password match print: “ Welcome!”
    —> If username is incorrect print: “invalid username” and don’t ask for the password
    —> If password is incorrect print: “invalid password”
     */

    public static void credentials() {
        String user = "test";
        String pass = "test123";

        System.out.println("Please enter your username");
        String username = scanner.nextLine();

        if (user.equals(username)) {
            System.out.println("Please enter your password");
            String password = scanner.nextLine();
            if (pass.equals(password)) {
                System.out.println("Welcome");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Wrong username");
        }
    }

    //Task2
    /*
    Send Message: User will enter a message, if message is valid it will be sent, there is a chance the message will not be delivered due to internet
    > User takes a message that needs to be at least 15 characters
    > If the message is valid user will see message: “sent” and “not sent” if the message was not valid
    > If message was sent there is a 50 % chance the message will not be delivered. >> If the message is delivered user will see message: “ delivered”
    HINT: use random number for random chance to send
     */

    public static void sendTheMessage() throws InterruptedException {
        System.out.println("Enter your message");
        String message = scanner.nextLine();
        Random random = new Random();
        int chance = random.nextInt(2) + 1;

        if (message.length() >= 15) {
            System.out.println("Sent");
            if (chance % 2 == 0) {
                Thread.sleep(1500);
                System.out.println("Delivered");
            } else {
                Thread.sleep(1500);
                System.out.println("Not delivered");
            }
        } else {
            System.out.println("Not sent");
        }
    }

    // Task3
    /*
    User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
    > input: “Java is a fun language”
    > output: “is a fun language Java”
    hint: you know the first space will be the end of the first word
     */

    public static void moveWordToTheEnd() {
        String str = "Java is a fun language";

        System.out.println(str.substring(str.indexOf(" ") + 1, str.length()) + " " + str.substring(0, str.indexOf(" ")));
    }

    //Task4
    /*
    User is asked to enter an account number. You will check if these account numbers are valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “ Invalid account number”
     */

    public static void accountNumber() {
        System.out.println("Enter account number");
        String acc = scanner.nextLine();
        if (acc.startsWith("2") && acc.length() == 7 || acc.startsWith("5") && acc.length() == 10) {
            System.out.println("You good");
        } else {
            System.out.println("Invalid account number");
        }
    }

    //Task5
    /*
    Creating an email. Ask user to enter two strings. Both of these strings should be at least 6 character long.
    If they are shorter than that print “Invalid data” and program should end.
    If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string.
    At the end of your combined string add “@cybertek.com” and print the final string as your created email.
    > input: “JamesBond”, "Secret"
    > output: Jameret@cybertek.com
     */

    public static void createEmail() {
        System.out.println("Enter your name. At least 6 letter minimum");
        String firstName = scanner.nextLine();
        System.out.println("Enter your name. At least 6 letter minimum");
        String lastName = scanner.nextLine();

        String mail = "@cybertek.com";

        System.out.println(firstName.substring(0, 4) + lastName.substring(lastName.length() - 3) + mail);

    }

    //Task6
    /*
    User will be given a string:
    “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}”
    > You will separate these parts and print them separately. > Print the following:
    “Sender: actualSender”
    “Number: actualNumber”
    “Message: actualMessage”
     */

    public static void separate() {
        String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        System.out.println("Sender: " + message.substring(message.indexOf("<") + 1, message.indexOf(">")));
        System.out.println("Number: " + message.substring(message.indexOf("[") + 1, message.indexOf("]")));
        System.out.println("Message: " + message.substring(message.indexOf("{") + 1, message.indexOf("}")));
    }


}
