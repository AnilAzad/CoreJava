package test;

public class CClass extends PClass {
    public int b=20;
    public CClass(){
        super();//Compiler added super() for executing PClass First
        System.out.println("******CClass Constructor****");
        System.out.println("Value of b : "+b);
    }
}
