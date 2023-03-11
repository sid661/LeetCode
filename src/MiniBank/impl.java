package MiniBank;

import javax.xml.crypto.dsig.TransformService;


public class impl {
    model m = new model();


    public double balance() {
        return m.getBalance();
    }

    public double withdraw(double money) {
        double availableBalance = m.getBalance();
        String tr = m.getTransaction();

        if (availableBalance >= money) {
            if (tr.equalsIgnoreCase(Transaction.DEPOSITE.toString())) {
                double transactionSingle = money * 0.40;
                double balance = availableBalance - (money + transactionSingle);
                m.setBalance(balance);
                m.setTransaction(Transaction.WITHDRAW.toString());
                return balance;
            }
            if (tr.equalsIgnoreCase(Transaction.WITHDRAW.toString())) {
                double trasactionCharge = money * 0.50;
                double balance = availableBalance - (money + trasactionCharge);
                m.setBalance(balance);
                m.setTransaction(Transaction.WITHDRAW.toString());
                return balance;
            }

        }

        return availableBalance;
    }

    public double deposite(double money) {
        double availableBalance = m.getBalance();
        String tr = m.getTransaction();


            if (tr == null || tr.equalsIgnoreCase(Transaction.WITHDRAW.toString())) {
                double transactionSingle = money * 0.20;
                double balance = availableBalance + (money - transactionSingle);
                m.setBalance(balance);
                m.setTransaction(Transaction.DEPOSITE.toString());
                return balance;
            }
            if (tr.equalsIgnoreCase(Transaction.DEPOSITE.toString())) {
                double trasactionCharge = money * 0.25;
                double balance = availableBalance + (money - trasactionCharge);
                m.setBalance(balance);
                m.setTransaction(Transaction.DEPOSITE.toString());
                return balance;
            }



        return availableBalance;
    }
}
