package maccess;

import java.util.*;

import test.*;

public class DemoException4 extends Exception {
    public DemoException4(String msg) {
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
                            DemoException4 de = new DemoException4("Invalid Amt..");
                            throw de;
                        }
                        //Lambda Expression
                        Transaction wd = (int amt) -> {
                            try {
                                if (amt > Transaction.b.bal) {
                                    Exception w = new Exception("Insufficient Fund...");
                                    throw w;
                                }
                                System.out.println("AmtWithDrawn : " + amt);
                                Transaction.b.bal = Transaction.b.bal - amt;// Updating balance
                                System.out.println("Balance Amt:" + Transaction.b.getBalance());

                                System.out.println("Transaction Completed...");

                            } catch (Exception w) {
                                throw w;
                            }
                        };
                        wd.process(a1);
                        break x;
                    case 2:
                        System.out.println("Enter the amt:");
                        int a2 = s.nextInt();
                        if (!(a2 > 0 && a2 % 100 == 0)) {
                            DemoException4 de = new DemoException4("Invalid Amt.");
                            throw de;
                        }
                        //Lambda Expression
                        Transaction wt = (int amt) -> {
                            System.out.println("Amt Deposited:" + amt);
                            Transaction.b.bal = Transaction.b.bal + amt;// Updating balance
                            System.out.println("Balance Amt:" + Transaction.b.getBalance());
                            System.out.println("Transaction Completed...");
                        };
                        wt.process(a2);
                        break x;

                    default:
                        DemoException4 de = new DemoException4("Invalid Choice ...");
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
            } catch (DemoException4 de) {
                System.out.println(de.getMessage());
                break x;
            } catch (Exception w) {
                System.out.println(w.getMessage());
                break;
            }

        }
    }
}
