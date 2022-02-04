package begin.construcktor.House;

public class House {

    private String type;
    private String address;
    private int numRooms;

    House(String type, String address, int numRooms) {
        this.type = type;
        this.address = address;
        this.numRooms = numRooms;
    }

    public void info() {
        System.out.println("Type: " + type);
        System.out.println("Address: " + address);
        System.out.println("Numbers of rooms: " + numRooms);
    }
}
