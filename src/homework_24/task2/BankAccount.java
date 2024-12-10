package homework_24.task2;

public class BankAccount implements PaymentSystem {
    private String title;
    private double balance;

    public BankAccount(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance){
            System.out.println("Недостаточно денег на счету для снятия " + amount);
        }
        System.out.printf("Банк %s. Вывод средст со счета : %2f\n", title, amount);
        balance -=amount;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.printf("Банк %s. Зачесление средст со счета : %2f\n", title, amount);
        balance +=amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
