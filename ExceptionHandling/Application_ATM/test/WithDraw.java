package test;

public class WithDraw extends Exception implements Transaction {
    public WithDraw(){}
    public WithDraw(String msg){
        super(msg);
    }
    public void process(int amt) throws WithDraw {
        try{
            if (amt>b.bal) {
                WithDraw w=new WithDraw("Insufficient Fund...");
                throw w;
            }
            System.out.println("AmtWithDrawn : " + amt);
            b.bal = b.bal - amt;// Updating balance
            System.out.println("Balance Amt:" + b.getBalance());

            System.out.println("Transaction Completed...");

        }
        catch(WithDraw w){
            throw w;
        }
        
    }
}
