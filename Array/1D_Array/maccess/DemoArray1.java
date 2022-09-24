package maccess;

import java.util.*;

public class DemoArray1 {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = s.nextInt();
        Integer[] a = new Integer[n];// Array Object
        System.out.println("Enter the " + n + " integer object : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer(s.nextInt());
            // Adding Integer object to Array object based on index
            // a[i]=s.nextInt();
        }
        System.out.println("Display using old For loop ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n===Display using Extended For(Java5)(ForEachLoop)=====");
        for (Integer j : a) {
            System.out.print(j + " ");
        }
        System.out.println("\n===Display using spliterator<T>(Java8)====");
        Spliterator<Integer> sp = Arrays.spliterator(a);
        sp.forEachRemaining((k) -> {
            System.out.print(k + " ");
        });
        s.close();
    }

}