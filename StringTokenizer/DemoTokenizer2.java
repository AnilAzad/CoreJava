/* Assignment => WAP to read a string and Display the reverse of words in the String.
  I/P => java language
  O/P => avaj egaugnal
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class DemoTokenizer2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=s.nextLine();
        System.out.print("Enter the String : ");
        String delimiter =s.nextLine();
        StringTokenizer ob=new StringTokenizer(str,delimiter);
        System.out.println("******Particular Reverse String*****");
        while (ob.hasMoreTokens()) {
            String result=ob.nextToken();
            StringBuffer sb=new StringBuffer(result);
            System.out.print(sb.reverse()+" ");
        }
        s.close();
    }
}