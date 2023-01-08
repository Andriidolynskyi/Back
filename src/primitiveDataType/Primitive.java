package primitiveDataType;

public class Primitive {

    //Task1
    /*
    Declare a variable for number of apples. You begin with 10;
    Declare a variable for number of oranges. You begin with 5;

    Then reassign the number of apples to be only 8;
    Then reassign the number of oranges to be the same as number of apples;
    Print out each instance of apple. Print the value before you change it

    apples: 10
    oranges: 5
    apples after : 8
    oranges after: 8
     */
    public static void declare() {
        int apples = 10;
        int oranges = 8;

        apples = 8;

        System.out.println("Apples: " + apples);
        System.out.println("Oranges: " + oranges);
    }

    //Task2
    /*
    You have 20 wild cats;
    You will take 5 of them in
    Print out the original values
    --> So far you should have two variables. - wild, pets

    reassign wild - 15
    print wild and pets

    take in 5 more cats, reassign wild - 10;

    Wild: 20
    Pets: 0

    Wild: 15
    Pets: 5

    Wild: 10
    Pets: 10
     */
    public static void pets() {

        int wild = 20;
        int pets = 0;

        wild -= 5;
        pets += 5;
        System.out.println(wild);
        System.out.println(pets);

        System.out.println();

        wild -= 5;
        pets += 5;
        System.out.println(wild);
        System.out.println(pets);

    }

    //Task3
    /*
    Task:
    You have variables: first name and variable last name
    --> Another variable: email
    ---> firstName + lastName + @cybertek.com
    Print in this format:

    First name: the first name
    Last name: the last name
    Email: the email
     */
    public static void mail() {

        String firstName = "Vasyl";
        String lastName = "Lomachenko";
        String mail = "@gmail.com";

        System.out.println(firstName + lastName.toLowerCase() + mail);

        System.out.println("The first name: " + firstName);
        System.out.println("The lastname name: " + lastName);
        System.out.println("The mail: " + mail);

    }

    //Task4
    /*
    You have number of chairs stored as a short datatype with the value of 5
    More chairs were ordered so we need something to store more chairs
    --> Change the chair datatype to long
    You realize you now have too much storage
    --> Change the chair datatype to int


    ---------
    Operators
    ---------
    int a= 5;
    int b= 2;

    int sum = a + b;
    int minus = a - b;
    a = a - 1;
    a -= 1;
     */
    public static void chairs() {

        short chairs = 5;

        long chairsLong = (long) chairs;

        int chairsInt = (int) chairsLong;

        System.out.println(chairs);
        System.out.println(chairsLong);
        System.out.println(chairsInt);

    }

    //Task5
    /*
    You have three numbers: 15, 23, 367
    Print the average of these numbers. -> avg should be double
    Result: 135
    */
    public static void avgNumber() {
        int number1 = 15;
        int number2 = 23;
        int number3 = 367;

        int avgNumber = (number1 + number2 + number3) / 3;

        System.out.println(avgNumber);
    }

    //Task6
    /*
    You have a temperature in Fahrenheit: 72.5
    Print out the temperature in celsius
    Formula: degrees celsius = 5 *(degrees F - 32) / 9
    Result:
    "Temperature in F: " + F temp ==== 72.5
    "Temperature in C: " + C temp ==== 22.5
     */
    public static void fahToCel() {
        double fahrenheit = 72.5;
        double celcius = 5 * (fahrenheit - 32) / 9;

        System.out.println("Celsius: " + celcius);
    }


    public static void main(String[] args) {

//        declare();
//        pets();
//        mail();
//        chairs();
//        avgNumber();
        fahToCel();


    }

}
