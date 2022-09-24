package maccess;
import java.util.*;

public class DemoArray7 {
    public static void main(String[] args) {
        Integer[] a1 ={11,22,33};
        Integer[] a2 ={111,222,333,444};
        Integer[][] a={a1,a2};
        System.out.println("******Display From Jagged Array*******");
        Spliterator<Integer[]> sp1=Arrays.spliterator(a);
        sp1.forEachRemaining((k)->{
            System.out.print("Array : ");
            Spliterator<Integer> sp2=Arrays.spliterator(k);
            sp2.forEachRemaining((z)->{
                System.out.print(z.toString()+" ");
            });
            System.out.println();
        });
    }
}
