import java.util.Scanner;

public class DemoMethods4 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the RollNum");
            int rollno=s.nextInt();
            System.out.println("Enter the Name");
            s.nextLine();
            String name=s.nextLine();
            System.out.println("Enter the Branch");
            String branch=s.nextLine();
            System.out.println("Enter the PhoneNum");
            long phNo=s.nextLong();
            System.out.println("============Details============");
            System.out.println("RollNum :"+rollno);
            System.out.println("User Name :"+name);
            System.out.println("Branch :"+branch);
            System.out.println("PhoneNum :"+phNo);
        }
            
    }
}
