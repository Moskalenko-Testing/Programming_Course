package homework_24.task2;

public class PaymentSystemApp {
    public static void main(String[] args) {

        PaymentSystem bank = new BankAccount("Bank1", 10000);
        PaymentSystem wallet = new ElectronicWallet("Wallet1", 5000);

        System.out.println(bank);
        bank.withdrawMoney(500_000);
        bank.withdrawMoney(500);
        System.out.println("checkBalance: " + bank.checkBalance());


        wallet.depositTransfer(1500);
        System.out.println("checkBalance: " + bank.checkBalance());


    }
}
