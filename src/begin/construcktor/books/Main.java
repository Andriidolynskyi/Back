package begin.construcktor.books;

    /*
    Create a program that will ask the user how many books they have.
    Then they will be asked to enter the book’s title, author, and number of pages.
    Create each book object and store them into a Book array.

    Part 2: Loop through your array and print the name of all the books
     */

public class Main {

    public static void main(String[] args) {

        Books books1 = new Books("Java", "cybertek", 200);
        Books books2 = new Books("automation", "Greg", 300);
        Books books3 = new Books("Selenium", "fgdvcd", 100);

        Books[] myBook = new Books[3];
        myBook[0] = books1;
        myBook[1] = books2;
        myBook[2] = books3;

        for (Books books : myBook){
            System.out.println(books.name);
        }

    }

}
