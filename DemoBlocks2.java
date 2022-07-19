class BTest2{
    int a=10;
    static int b=20;
    {
        a++;
        b++;
        System.out.println("=====SubClass InstanceBlock");
        System.out.println("Value of a : "+a);
        System.out.println("Value of a : "+b);
    }
}
public class DemoBlocks2 {
    public static void main(String[] args) {
        BTest2 ob1=new BTest2();
        BTest2 ob2=new BTest2();
    }

}
