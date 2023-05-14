package src.test.Esercizi1;

public abstract class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public abstract double getBalance();

    public abstract Double depositing(double depositedMoney);
}
