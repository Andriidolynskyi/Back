package begin.construcktor.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Checking account", 12345678, 3000, "Andrii Dolynskyi");
        bankAccount.deposit(350);
        bankAccount.transfer(50);
        bankAccount.info();
    }
}
