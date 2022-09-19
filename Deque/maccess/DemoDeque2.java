package maccess;

import java.util.ArrayDeque;
@SuppressWarnings("removal")
public class DemoDeque2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ad.add(new Integer(12));
        ad.add(new Integer(13));
        ad.add(new Integer(14));
        ad.add(new Integer(15));
        ad.add(new Integer(12));
        ad.add(new Integer(13));
        ad.add(new Integer(14));
        ad.add(new Integer(15));
        System.out.println(ad);
        ad.removeFirstOccurrence(new Integer(12));
        System.out.println(ad);
        ad.removeLastOccurrence(new Integer(13));
        System.out.println(ad);
    }
}
