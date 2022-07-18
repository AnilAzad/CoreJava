
class Btest1{
   static int x=20;
    static{
        
        System.out.println("====SubClass staticBlock====");
        System.out.println("Value x : "+x);
    }
}

public class DemoBlocks1 {
    static int z=10;
    public static void main(String[] args) {
        Btest1.x=500;
        System.out.println("====Main()====");
        System.out.println("Value z : "+z);
        System.out.println("Value x : "+Btest1.x);
    }
    static{
        System.out.println("====MainClass StaticBlock====");
        System.out.println("The value z : "+z);
    }
    
}
