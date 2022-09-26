package maccess;

import java.util.*;

import test.*;

public class DemoException3 extends Exception {
    public DemoException3(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        x: while (true) {
            try {
                System.out.println("Enter the PinNo : ");
                int pinNo = s.nextInt();
                new CheckPinNo().verify(pinNo);
                System.out.println("====Choice====");
                System.out.println("1.WithDraw\n2.Deposit");
                System.out.println("Enter the Choice : ");
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amt:");
                        int a1 = s.nextInt();
                        if (!(a1 > 0 && a1 % 100 == 0)) {
                            DemoException3 de = new DemoException3("Invalid Amt..");
                            throw de;
                        }
                        //Anonymous Inner class as implementation class
                        Transaction wd=new Transaction(){
                            
                            public void process(int amt) throws Exception {
                                try{
                                    if (amt>b.bal) {
                                        Exception w=new Exception("Insufficient Fund...");
                                        throw w;
                                    }
                                    System.out.println("AmtWithDrawn : " + amt);
                                    b.bal = b.bal - amt;// Updating balance
                                    System.out.println("Balance Amt:" + b.getBalance());
                        
                                    System.out.println("Transaction Completed...");
                        
                                }
                                catch(Exception w){
                                    throw w;
                                }
                                
                            }
                        };
                        wd.process(a1);
                        break x;
                    case 2:
                        System.out.println("Enter the amt:");
                        int a2 = s.nextInt();
                        if (!(a2 > 0 && a2 % 100 == 0)) {
                            DemoException3 de = new DemoException3("Invalid Amt.");
                            throw de;
                        }
                        //Anonymous Inner class as implementation class
                        Transaction wt=new Transaction()
                        {
                            public void process(int amt) {
                                System.out.println("Amt Deposited:" + amt);
                                b.bal = b.bal + amt;// Updating balance
                                System.out.println("Balance Amt:" + b.getBalance());
                                System.out.println("Transaction Completed...");
                            }
                        }; 
                        wt.process(a2);
                        break x;

                    default:
                        DemoException3 de = new DemoException3("Invalid Choice ...");
                        throw de;
                }

            } catch (CheckPinNo cpn) {
                System.out.println(cpn.getMessage());
                count++;
                if (count == 3) {
                    System.out.println("Transactin Blocked...");
                    System.exit(0);
                }
            } catch (InputMismatchException ob) {
                System.out.println("Enter only Integer value...");
                System.exit(0);
            } catch (DemoException3 de) {
                System.out.println(de.getMessage());
                break x;
            } catch (Exception w) {
                System.out.println(w.getMessage());
                break;
            }

        }
    }
}
