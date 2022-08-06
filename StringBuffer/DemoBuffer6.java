import java.util.Scanner;

public class DemoBuffer6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=s.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.print("Reverse String is : "+sb.reverse());
        String reverse=sb.toString();
        if (str.equals(reverse)) {
            System.out.println("\nString is Palindrome");
        } else {
            System.out.println("\nString is not Palindrome");
        }
        s.close();
    }
}
