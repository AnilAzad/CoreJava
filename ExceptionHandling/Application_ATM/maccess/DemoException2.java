package maccess;

import java.util.*;

import test.*;

public class DemoException2 extends Exception {
    public DemoException2(String msg) {
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
                            DemoException2 de = new DemoException2("Invalid Amt..");
                            throw de;
                        }
                        new WithDraw().process(a1);
                        break x;
                    case 2:
                        System.out.println("Enter the amt:");
                        int a2 = s.nextInt();
                        if (!(a2 > 0 && a2 % 100 == 0)) {
                            DemoException2 de = new DemoException2("Invalid Amt.");
                            throw de;
                        }
                        new Deposit().process(a2);
                        break x;

                    default:
                        DemoException2 de = new DemoException2("Invalid Choice ...");
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
            } catch (DemoException2 de) {
                System.out.println(de.getMessage());
                break x;
            } catch (WithDraw w) {
                System.out.println(w.getMessage());
                break;
            }

        }
    }
}
