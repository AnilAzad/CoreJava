package test;
public class PClass{
    public static int a=10;
    public static void m1(){
        System.out.println("*******PClass m1()*****");
        System.out.println("Value of a : "+a);
    }
    static{
        System.out.println("*****PClass Static Block******");
        System.out.println("Value of a : "+a);
    }
}