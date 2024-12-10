package homework_24.task2_1;

public class BankAccount1 extends VusaMember implements PaySystem{

    public BankAccount1(String title, double balance, String currency) {
        super(title, balance, "EUR");

    }

    @Override
    public String toString() {
        return "BankAccount1: {" + "title='" + title + '\'' + ", balance=" + balance +", currency: "+ this.getCurrency() +'}';
    }

    @Override
    public boolean transferMoney(double amountEur, PaySystem recipient) {
        if (amountEur > balance) {
            System.out.printf("Недостаточно средст: (transfer: %2f | balance: %2f)\n", amountEur, balance);

        }
        return false;

    }



    @Override
    public boolean withdrawMoney(double amount) {
        return false;
    }

    @Override
    public void depositTYransfer(double amount) {

    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
