package test;

public class Display {
    public Display(int x){
        System.out.println("--------Constructor Body-------");
        System.out.println("Value x : "+x);
    }
    public void m1(int y){
        System.out.println("--------Instance Method Body---------");
        System.out.println("Value y : "+y);
    }
    public static void m2(int z){
        System.out.println("--------Static Method Body-------");
        System.out.println("Value z : "+z);
    }
}
