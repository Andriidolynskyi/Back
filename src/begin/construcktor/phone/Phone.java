package begin.construcktor.phone;

public class Phone {

    private String touchScreen;
    private String model;
    private int memory;
    private String color;
    private long phoneNumber;

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public Phone(String touchScreen, String model, int memory, String color) {
        this.touchScreen = touchScreen;
        this.model = model;
        this.memory = memory;
        this.color = color;
    }
}
