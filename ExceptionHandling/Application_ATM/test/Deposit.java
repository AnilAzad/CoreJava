package test;

public class Deposit implements Transaction {
    public void process(int amt) {
        System.out.println("Amt Deposited:" + amt);
        b.bal = b.bal + amt;// Updating balance
        System.out.println("Balance Amt:" + b.getBalance());
        System.out.println("Transaction Completed...");
    }
}
