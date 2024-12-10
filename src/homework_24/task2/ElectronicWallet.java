package homework_24.task2;

public class ElectronicWallet implements PaymentSystem{
    private String title;
    private double balance;

    public ElectronicWallet(String title, double aDouble) {
        this.title = title;
        this.balance = aDouble;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "title='" + title + '\'' +
                ", balance =" + balance +
                '}';
    }

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
