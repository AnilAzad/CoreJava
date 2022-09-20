package maccess;

import test.*;
import java.util.*;

public class DemoCursor1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector<Product> al = new Vector<Product>();
        System.out.print("Enter the numbers of Products : ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("=====Details of Product-" + i + " ====");
            System.out.print("Enter the Code : ");
            String code = s.nextLine();
            System.out.print("Enter the name : ");
            String name = s.nextLine();
            System.out.print("Enter the price : ");
            float price = Float.parseFloat(s.nextLine());
            System.out.print("Enter the Qty : ");
            int qty = Integer.parseInt(s.nextLine());
            al.add(new Product(code, name, price, qty));
        }
        System.out.println("=======Iterator<E>======");
        Iterator<Product> it1 = al.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println("=======Iterator<E>(Java8)======");
        Iterator<Product> it2 = al.iterator();
        it2.forEachRemaining((k) -> {
            System.out.println(k);
        });
        System.out.println("*********ListIterator<E>**********");
        ListIterator<Product> lt = al.listIterator();
        System.out.println("=====Forward======");
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }
        System.out.println("====Backword======");
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
        System.out.println("*******Enumeration<E>*******");
        Enumeration<Product> e = al.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        System.out.println("*******Spliterator<E>*******");
        Spliterator<Product> sp = al.spliterator();
        sp.forEachRemaining((z) -> {
            System.out.println(z);
        });
        s.close();
    }
}
