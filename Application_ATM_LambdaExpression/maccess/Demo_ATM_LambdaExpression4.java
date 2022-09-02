package maccess;

import test.*;
import java.util.*;

public class Demo_ATM_LambdaExpression4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        xyz: while (true) {
            System.out.println("Enter the pinNo:");
            int pinNo = s.nextInt();
            boolean k = new CheckPinNo().verify(pinNo);
            if (k) {
                System.out.println("====Choice====");
                System.out.println("1.WithDraw\n2.Deposit");
                System.out.println("Enter the Choice:");
                switch (s.nextInt()) {
                    case 1:
                        System.out.println("Enter the amt:");
                        int a1 = s.nextInt();
                        if (a1 > 0 && a1 % 100 == 0) {
                            Transaction withDraw = (int amt) -> {
                                if (amt < Transaction.b.bal) {
                                    System.out.println("AmtWithDrawn : " + amt);
                                    Transaction.b.bal = Transaction.b.bal - amt;// Updating balance
                                    System.out.println("Balance Amt:" + Transaction.b.getBalance());

                                    System.out.println("Transaction Completed...");
                                } // end of if
                                else {
                                    System.out.println("Insufficient Fund...");
                                }
                            };
                            withDraw.process(a1);
                        } // end of if
                        else {
                            System.out.println("Invalid amt...");
                        }
                        break xyz;
                    case 2:
                        System.out.println("Enter the amt:");
                        int a2 = s.nextInt();
                        if (a2 > 0 && a2 % 100 == 0) {
                            Transaction deposit = (int amt) -> {
                                System.out.println("Amt Deposited:" + amt);
                                Transaction.b.bal = Transaction.b.bal + amt;// Updating balance
                                System.out.println("Balance Amt:" + Transaction.b.getBalance());
                                System.out.println("Transaction Completed...");
                            };
                            deposit.process(a2);
                        } // end of if
                        else {
                            System.out.println("Invalid amt...");
                        }
                        break xyz;
                    default:

                        System.out.println("Invalid choice...");
                        break xyz; // stop the loop
                }// end of switch
            } // end of if
            else {
                System.out.println("Invalid pinNo....");
                count++;
            }
            if (count == 3) {
                System.out.println("Sorry ! Transaction Blocked...");
                break;// stop the loop
            }
        } // end of loop
    }
}
