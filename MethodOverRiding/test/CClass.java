package test;

public class CClass extends PClass {
    public int b=10;
    public void m1(){
        // PClass replaced by CClass
        System.out.println("=======CClass=====");
        System.out.println("value of b : "+b);
    }
}
