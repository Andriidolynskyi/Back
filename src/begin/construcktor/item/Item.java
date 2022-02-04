package begin.construcktor.item;

public class Item {

    String name;
    double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void printAll(){
        System.out.println(name);
        System.out.println(price);
    }

}
