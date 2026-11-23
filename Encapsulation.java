class BankAccount {
    private String accountHolder;
    private double balance;
    BankAccount(String holder, double openingBalance) {
        accountHolder = holder;
        if (openingBalance >= 0) balance = openingBalance;
    }
    public double getBalance() { return balance; }
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; return true; }
        return false;
    }
    public String getAccountHolder() { return accountHolder; }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Asha", 1000);
        a.deposit(250);
        System.out.println("Withdrawal successful: " + a.withdraw(300));
        System.out.println(a.getAccountHolder() + " balance: " + a.getBalance());
    }
}
