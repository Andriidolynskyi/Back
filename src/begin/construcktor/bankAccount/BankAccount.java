package begin.construcktor.bankAccount;

public class BankAccount {
    private String type;
    private int accountNumber;
    private double balance;
    private String holderName;

    public BankAccount(String type, int accountNumber, double balance, String holderName) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public void deposit(double deposit) {
        System.out.println(deposit + " is deposited to your account");
        balance += deposit;
    }

    public void transfer(double transfering) {
        System.out.println(transfering + " is transferred from your account");
        balance -= transfering;
    }

    public void info() {
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Type: " + type);
        System.out.println("Account number: " + accountNumber);
    }


}
