import java.util.Scanner;
public class DemoBuffer3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        System.out.println("Capacity :"+sb.capacity());
        System.out.println("Length :"+sb.length());
        System.out.println("***Enter the data to be Appended***");
        sb.append(s.nextLine());
        System.out.println("sb : "+sb);
        System.out.println("Capacity :"+sb.capacity());
        System.out.println("Length :"+sb.length());
        System.out.println("****remove all the vowels in the String****");
        for (int i = 0; i < sb.length(); i++) {
            
            if (sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u') {
                sb.deleteCharAt(i);
            }
        }
        System.out.print("Removed Vowels : "+sb);
        s.close();

    }
}