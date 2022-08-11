package test;
public class PClass{
    public int a=10;
    public void m1(){
        System.out.println("*******PClass m1()*****");
        System.out.println("Value of a : "+a);
    }
    {
        System.out.println("*****PClass Instance Block******");
        System.out.println("Value of a : "+a);
    }
}