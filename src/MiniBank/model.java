package MiniBank;

public class model {
    double balance;
    String transaction;

    public model() {
    }

    private model(double balance, String transaction) {
        this.balance = balance;
        this.transaction = transaction;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "model{" +
                "balance=" + balance +
                '}';
    }
}
