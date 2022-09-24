package maccess;

import java.util.*;

public class DemoArray4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr the size of Array : ");
        int n = Integer.parseInt(s.nextLine());
        String[] a = new String[n];
        System.out.println("Enter " + n + " String Objects : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = new String(s.nextLine());
        }
        Spliterator<String> sp = Arrays.spliterator(a);
        sp.forEachRemaining((k) -> {
            int count = 0;
            String str = k.toString();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
            System.out.println(str.toString() + " : " + count);
        });
        s.close();
    }
}
