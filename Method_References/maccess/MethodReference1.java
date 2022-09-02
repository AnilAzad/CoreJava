package maccess;

import test.Display;
import test.ITest;

public class MethodReference1 {
    public static void main(String[] args) {
        System.out.println("********Reference to constructor*******");
        ITest ob1= Display :: new;//Reference to constructor
        ob1.dis(123);//constructor body_call
        ob1.show(200);
        System.out.println("******Reference to Instance Method******");
        Display d=new Display(111);//onstructor call
        ITest ob2= d :: m1;//Reference to Instance Method
        ob2.dis(124);//Instance Method body_call 
        ob2.show(300);
        System.out.println("******Reference to Static Method*******");
        ITest ob3= Display :: m2;//Reference to Static Method
        ob3.dis(125);//Static method body_call
        ob3.show(400);
    }
}
