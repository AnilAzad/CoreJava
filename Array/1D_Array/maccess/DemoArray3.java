package maccess;

import java.util.*;

public class DemoArray3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = Integer.parseInt(s.nextLine());
        String[] a = new String[n];
        System.out.println("Enter " + n + " String objects : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = new String(s.nextLine());
        }
        Spliterator<String> sp= Arrays.spliterator(a);
        sp.forEachRemaining((z) ->{
            String str=z.toString();
            char ch=str.charAt(str.length()-1);
            System.out.print(ch+" ");
        });
        s.close();
    }
}
