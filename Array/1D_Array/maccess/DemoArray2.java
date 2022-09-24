package maccess;

import java.util.*;

public class DemoArray2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = Integer.parseInt(s.nextLine());
        String[] a = new String[n];
        System.out.println("Enter " + n + " String objects : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = new String(s.nextLine());
        }
        System.out.println("===Display using Old Forloop==");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].toString() + " ");
        }
        System.out.println("\n====Display using Extended for(java5)=====");
        for (String z : a) {
            System.out.print(z.toString() + " ");
        }
        System.out.println("\n=====Display using Spliterator<k>====");
        Spliterator<String> sp = Arrays.spliterator(a);
        sp.forEachRemaining((z) -> {
            System.out.print(z.toString() + " ");
        });
        s.close();
    }
}
