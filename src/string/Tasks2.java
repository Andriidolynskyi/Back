package string;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class Tasks2 {
    static Scanner scanner = new Scanner(System.in);

    //Task1
    /*
    You have a String with the following value:
    -> “Cybertek is located in Des Plaines”
    The user is asked to enter a part of the string they are looking for. Find the position of the String the user is looking for and print it.
    Ex:
    > Input: “located”
    > Output: "located starts at: " 12
     */
    public static void locate() {
        String str = "Cybertek is located in Des Plaines";
        String entered = scanner.next();

        System.out.println(str.indexOf(entered));
    }

    //Task2
    /*
    You have a value that hold what month it is (October).
    Ask the user to enter the month from the console. If the user’s input matches the expected month put print true, but if the input does not match the actual month print false.
    Uppercase and lowercase letters do not matter, we only care about the value.
     */
    public static void month() {
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();
        System.out.println("Enter the current month: ");
        String month = scanner.next().toUpperCase();


        if (month.equals(String.valueOf(currentMonth))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    //Task3
    /*
    You have a String with the following value:
    -> “We will have a picnic when the weather gets nicer”
    First print the given sentence. Then the user is asked to enter the following: the set of characters from the sentence they want to change,
    and the set of characters that will show up in place of the ones which were removed. Print the new sentence.
    > input: “w” , “La”
    > output: “We Laill have a picnic Lahen the Laeather gets nicer”
     */
    public static void nicer() {
        String str = "We will have a picnic when the weather gets nicer";
        System.out.println(str.replace("w", "La"));
    }

    //Task6
    /*
    User takes two strings from the user. Compare the Strings and print out the String that comes first lexicographically.
     */
    public static void compareTwoString() {
        System.out.println("Enter the first string: ");
        String str1 = scanner.next();

        System.out.println("Enter the second string");
        String str2 = scanner.next();

        if (str1.compareTo(str2) != 0) {
            System.out.println("Not lexicographically");
        } else {
            System.out.println("Lexicographically");
        }

    }

    //Task7
    /*
    User is asked to enter their name. You will check if it is a cool name.
    > If the name begins with an ‘a’ or a ‘z’ print “Your name is cool” > Otherwise print “Sorry not a cool name”
     */
    public static void coolName() {
        System.out.println("Enter your name: ");
        String name = scanner.next();

        if (name.toUpperCase().startsWith("A") || name.toLowerCase().startsWith("Z")) {
            System.out.println("Cool name");
        } else {
            System.out.println("Sorry not a cool name");
        }
    }

    //Task8
    /*
    You have a car garage with these car brands. You will check the cars and print the following messages:
    String cars = "Toyota, BMW, Juguar";
    > If the garage is empty print “No cars in your garage”
    > If you have a Toyota or Nissan print “There is a Japanese car in your garage”
    > If you have a BMW print “There is a German car in your garage”
    > If you have a Maserati print “There is an Italian car in your garage”
    > If you have a Jaguar print “There is a British car in your garage” —> If the garage does not have a car of that type, print “No x cars”
     */
    public static void garage() {
        String cars = "Toyota, BMW, Jaguar";

    }

    //Task9
    /*
    User is asked to enter a message to send. You will check if the message contains any of these bad words: “idiot, dumb, stupid”
    > if any bad words are in the message change them to “smart” and print “your message was changed:” and then print the new message in the next line.
    > if the message had no bad words print “Your message was not changed:” and then print the original message in the next line.
     */
    public static void checkContains() {
        System.out.println("Print the sentences");
        String str = scanner.nextLine();

        if (str.contains("idiot")) {
            System.out.println(str.replace("idiot", "smart"));
        }
        if (str.contains("dumb")) {
            System.out.println(str.replace("dumb", "smart"));
        }
        if (str.contains("stupid")) {
            System.out.println(str.replace("stupid", "smart"));
        }
    }

    //Task10
    /*
    User will be asked to enter two full names ( first and last). You will determine if the two entered people are relatives by comparing their last names.
     */
    public static void relativeOrNot() {
        System.out.println("Enter first full name: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter second full name");
        String str2 = scanner.nextLine();

        if (str1.substring(str1.indexOf(" ") + 1).equalsIgnoreCase(str2.substring(str2.indexOf(" ") + 1))) {
            System.out.println("Two persons are related");
        } else {
            System.out.println("Not related");
        }
    }

    //Task11
    /*
    Creating an email. Ask user to enter two strings. Both of these strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
    If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email.
    > input: “JamesBond”, Secret
    > output: jameret@cybertek.com
     */
    public static void combination() {
        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string");
        String str2 = scanner.nextLine();

        if (str1.length() >= 6 && str2.length() >= 6) {
            System.out.println(str1.substring(0, 4).toLowerCase() + str2.substring(str2.length() - 3) + "@cybertek.com");
        }


    }

    //Task12
    /*
    User will be given a string:
    “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}”
    > You will separate these parts and print them separately. > Print the following:
    “Sender: actualSender”
    “Number: actualNumber”
    “Message: actualMessage”
     */
    public static void separate() {
        String sentens = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        System.out.println("Sender: " + sentens.substring(sentens.indexOf("<") + 1, sentens.lastIndexOf(">")));
        System.out.println("Number: " + sentens.substring(sentens.indexOf("[") + 1, sentens.lastIndexOf("]")));
        System.out.println("Message: " + sentens.substring(sentens.indexOf("{") + 1, sentens.lastIndexOf("}")));

    }


    public static void main(String[] args) {
//        locate();
//        month();
//        nicer();
//        compareTwoString();
//        coolName();
//        checkContains();
//        relativeOrNot();
//        combination();
        separate();

    }
}
