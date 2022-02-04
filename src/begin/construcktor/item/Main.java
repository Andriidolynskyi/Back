package begin.construcktor.item;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item;
        int numbersOfBooks = scanner.nextInt();
        Item[] items = new Item[numbersOfBooks];

        for (int i = 0; i < numbersOfBooks; i++) {
            System.out.println("Enter item number " + (i+1));
            String name = scanner.next();
            System.out.println("Enter item price ");
            double price = scanner.nextDouble();
            item = new Item(name,price);
            items[i] = item;
        }

        for(Item i : items){
            System.out.println(i.name);
            System.out.println(i.price);
        }

    }

}
