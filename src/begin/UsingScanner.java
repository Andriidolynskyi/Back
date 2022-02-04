package begin;

import java.util.Scanner;

public class UsingScanner {

    Scanner scanner = new Scanner(System.in);
    static UsingScanner usingScanner = new UsingScanner();

    public static void main(String[] args) {
        usingScanner.usingString();
        usingScanner.usingNumeric();
        // Tasks
        usingScanner.date();
        usingScanner.date2();


    }

    public void usingString() {
        System.out.println("type text");
        String s = scanner.nextLine();
        System.out.println(s);
    }

    public void usingNumeric() {
        System.out.println("type numeric");
        int number = scanner.nextInt();
        System.out.println(number);
    }

    // Task1
    /*
    Create three int variables: month, day, year
    Take those values and put them into a string in this format: “M/D/Y”


    Month: 5
    Day: 20
    Year: 2019
    > Output:
    5 / 20 / 2019
     */

    public void date() {
        System.out.println("Type the month");
        int month = scanner.nextInt();
        System.out.println("Type the day");
        int day = scanner.nextInt();
        System.out.println("Type the year");
        int year = scanner.nextInt();

        System.out.println(month + " / " + day + " / " + year);
    }

    //Task2
    /*
    After printing the original date, add 5 to the years and subtract 1 from the day. Print the new date value.
    > input — as values are above
    > output:
    5 / 19 / 2024
     */

    public void date2() {
        System.out.println("Type the month");
        int month = scanner.nextInt();
        System.out.println("Type the day");
        int day = scanner.nextInt();
        System.out.println("Type the year");
        int year = scanner.nextInt();

        System.out.println(month + " / " + day + " / " + year);
        System.out.println(month + " / " + (day - 1) + " / " + (year + 5));
    }

}
