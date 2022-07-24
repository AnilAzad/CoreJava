package Assignment2;

import java.util.Scanner;

class Customer {
    String cId, cName, cEmail;
    int cBalance;
    long cPhNo;
}

public class DemoCons8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Customer c = new Customer();
        System.out.print("Enter CustomerId : ");
        c.cId = s.nextLine();
        System.out.print("Enter CustomerName : ");
        c.cName = s.nextLine();
        System.out.print("Enter CustomerBalance : ");
        c.cBalance = s.nextInt();
        System.out.print("Enter CustomerPhNo : ");
        c.cPhNo = s.nextLong();
        System.out.print("Enter CustomerEmail : ");
        s.nextLine();
        c.cEmail = s.nextLine();
        s.close();
        System.out.println("=======CustomerDeatils=======");
        System.out.println("CustomerId : "+c.cId);
        System.out.println("CustomerName : "+c.cName);
        System.out.println("CustomerBalance : "+c.cBalance);
        System.out.println("CustomerPhNo : "+c.cPhNo);
        System.out.println("CustomerEmail : "+c.cEmail);
        

    }
}
