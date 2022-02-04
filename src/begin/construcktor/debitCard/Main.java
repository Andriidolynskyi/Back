package begin.construcktor.debitCard;

public class Main {

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard(1234567890123456L, "Vasia Brabash", 35000);
        DebitCard debitCard2 = new DebitCard(1234123412341234L, "Vasi", "Visa", 0000, 45000);

        debitCard.info();
        debitCard2.info();
    }

}
