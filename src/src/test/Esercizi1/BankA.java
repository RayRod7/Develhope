package src.test.Esercizi1;

public class BankA extends Bank {


    public BankA(double balance) {
        super(balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public Double depositing(double depositedMoney) {
        balance += depositedMoney;
        return balance;
    }
}
