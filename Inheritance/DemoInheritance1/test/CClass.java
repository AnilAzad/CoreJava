package test;
public class CClass extends PClass{
    public int b=20;
    public void m2(){
        System.out.println("=====CClass m2()======");
        System.out.println("Value of b : "+b);
    }
    {
        System.out.println("=====CClass Instance Block======");
        System.out.println("Value of b : "+b);   
    }
}