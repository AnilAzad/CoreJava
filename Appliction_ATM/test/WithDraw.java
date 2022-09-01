package test;

public class WithDraw implements Transaction {
    public void process(int amt) {
        if (amt < b.bal) {
            System.out.println("AmtWithDrawn : " + amt);
            b.bal = b.bal - amt;// Updating balance
            System.out.println("Balance Amt:" + b.getBalance());

            System.out.println("Transaction Completed...");
        } // end of if
        else {
            System.out.println("Insufficient Fund...");
        }
    }
}
