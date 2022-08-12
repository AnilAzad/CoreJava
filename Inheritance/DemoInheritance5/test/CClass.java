package test;

public class CClass extends PClass {
    public CClass(int x, int y){
        super(x, y);//Coder must added super() for executing PClass:
        System.out.println("======CClass Constructor======");
        System.out.println("x : "+x+"\n"+"y : "+y);
    }
}
