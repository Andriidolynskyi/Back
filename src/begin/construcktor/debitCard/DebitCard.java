package begin.construcktor.debitCard;

public class DebitCard {

    long cardNumber;
    String holderName;
    String cardType;
    int pinNumber;
    double balance;

    public DebitCard(long cardNumber, String holderName, double balance) {

        this.holderName = holderName;

        this.balance = balance;
        if (String.valueOf(1234567890123456L).length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid data");
        }
    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pinNumber, double balance) {
        this(cardNumber, holderName, balance);

        if (String.valueOf(pinNumber).length() == 4) {
            this.pinNumber = pinNumber;
        } else {
            System.out.println("Invalid pin Number");
        }

        if (cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("Master Card")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }

    }

    public void info() {

        System.out.println("Card number: " + cardNumber);
        System.out.println("Holder name: " + holderName);
        System.out.println("Card type: " + cardType);
        System.out.println("Balance: " + balance);

    }

}
