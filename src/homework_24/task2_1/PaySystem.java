package homework_24.task2_1;

public interface PaySystem {

    boolean transferMoney(double amount,PaySystem recipient);
    boolean withdrawMoney(double amount);
    void depositTYransfer(double amount);
    double checkBalance();

}
