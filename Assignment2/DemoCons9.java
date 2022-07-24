package Assignment2;

import java.util.Scanner;

class Customer{
    String cId, cName, cEmail;
    int cBalance;
    long cPhNo;
    void setCustomerId(String cI){
        cId=cI;
    }
    String getCustomerId(){
        return cId;
    }
    void setCustomerName(String cN){
        cName=cN;
    }
    String getCustomerName(){
        return cName;
    }
    
    void setCustomerBal(int cB){
        cBalance=cB;
    }
    int getCustomerBal(){
        return cBalance;
    }
    void setCustomerPhNo(long cP){
        cPhNo=cP;
    }
    long getCustomerPhNo(){
        return cPhNo;
    }
    void setCustomerMail(String cE){
        cEmail=cE;
    }
    String getCustomerMail(){
        return cEmail;
    }
}
public class DemoCons9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Customer c=new Customer();
        System.out.print("Enter CustomerId : ");
        c.setCustomerId(s.nextLine());
        System.out.print("Enter CustomerName : ");
        c.setCustomerName(s.nextLine());
        System.out.print("Enter CustomerBal : ");
        c.setCustomerBal(s.nextInt());
        System.out.print("Enter CustomerPhNo : ");
        c.setCustomerPhNo(s.nextLong());
        System.out.print("Enter CustomerMail : ");
        s.nextLine();
        c.setCustomerMail(s.nextLine());
        s.close();
        System.out.println("========CustomerDetails=========");
        System.out.println("CustomerId : "+c.getCustomerId());
        System.out.println("CustomerName : "+c.getCustomerName());
        System.out.println("CustomerBal : "+c.getCustomerBal());
        System.out.println("CustomerPhNo : "+c.getCustomerPhNo());
        System.out.println("CustomerMail : "+c.getCustomerMail());

    }
}
