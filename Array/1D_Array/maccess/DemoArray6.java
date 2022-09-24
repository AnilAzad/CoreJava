package maccess;

import java.util.*;
import test.Employee;

public class DemoArray6 {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Object[] o = new Object[3];
        o[0] = new Integer(123);
        o[1] = new String("NIT HYD");
        o[2] = new Employee("A111", "Raj", "SE", 18000, 46080);
        System.out.println("====Display Object Array====");
        Spliterator<Object> sp = Arrays.spliterator(o);
        sp.forEachRemaining((k) -> {
            System.out.println(k.toString() + " ");
        });
    }
}
