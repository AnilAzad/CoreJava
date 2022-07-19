class BTest3{
    int a=10;
    static int b=20;
    static{
        b++;
        System.out.println("=====subClass StaticBlocks=======");
        System.out.println("Value of b : "+b);
    }
    {
        a++;
        b++;
        System.out.println("=====SubClass InstanceBlock=======");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
public class DemoBlocks3 {
    int x=100;
    static int y=200;
    static{
        y++;
        System.out.println("=====MainClass StaticBlock=======");
        System.out.println("Value of y : "+y);
    }
    {
        x++;
        y++;
        System.out.println("=====MainClass InstanceBlock=======");
        System.out.println("Value of x : "+x);
        System.out.println("Value of y : "+y);
    }
    
    public static void main(String[] args) {
        BTest3 obj1=new BTest3();
        BTest3 obj2=new BTest3();
        DemoBlocks3 obj3=new DemoBlocks3();
        System.out.println("=====MainClass=======");
        System.out.println("Value of x : "+obj3.x);
        System.out.println("Value of y : "+y);
    }
    
}
