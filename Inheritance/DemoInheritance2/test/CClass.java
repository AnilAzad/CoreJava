package test;
public class CClass extends PClass{
    public static int b=20;
    public static void m2(){
        System.out.println("=====CClass m2()======");
        System.out.println("Value of b : "+b);
    }
    static{
        System.out.println("=====CClass Static Block======");
        System.out.println("Value of b : "+b);   
    }
}