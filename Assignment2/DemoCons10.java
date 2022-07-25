package Assignment2;

import java.util.Scanner;
import java.lang.String;

class Customer {
    String cId, cName, cEmail;
    int cBalance;
    long cPhNo;

    Customer(String id, String name, int bal, long phNo, String mail) {
        cId = id;
        cName = name;
        cBalance = bal;
        cPhNo = phNo;
        cEmail = mail;
    }

    void getCustomer() {
        System.out.println("======CustomerDetails======");
        System.out.println("CustomerId   : " + cId);
        System.out.println("CustomerName : " + cName);
        System.out.println("CustomerBal  : " + cBalance);
        System.out.println("CustomerPhNo : " + cPhNo);
        System.out.println("CustomerMail : " + cEmail);

    }
}

public class DemoCons10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter CustomerId : ");
        String id = s.nextLine();
        System.out.print("Enter CustomerName : ");
        String name = s.nextLine();
        System.out.print("Enter CustomerBalance : ");
        int bal = s.nextInt();
        System.out.print("Enter CustomerPhNo : ");
        long phNo = s.nextLong();
        System.out.print("Enter CustomerEmail : ");
        s.nextLine();
        String mail = s.nextLine();
        s.close();
        Customer c = new Customer(id, name, bal, phNo, mail);
        c.getCustomer();
    }
}
