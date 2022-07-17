import java.util.Scanner;

public class DemoMethods5 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter UsreName");
            String user=s.nextLine();
            System.out.println("Enter Password");
            String pass=s.nextLine();
            System.out.println("Enter FirstName");
            String firstName=s.nextLine();
            System.out.println("Enter PhoneNo");
            long phNo=Long.parseLong(s.nextLine());
            System.out.println("Enter MailID");
            String mailId=s.nextLine();
            System.out.println("-----------UserLogin----------");
            System.out.println("UserName : "+user);
            System.out.println("Password : "+pass);
            System.out.println("FirstName : "+firstName);
            System.out.println("PhoneNo : "+phNo);
            System.out.println("MailId : "+mailId);
        } 
    }
    
}
