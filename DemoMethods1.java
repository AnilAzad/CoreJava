public class DemoMethods1 {
    int a=10;
    static int b=20;
    void m1(){
        System.out.println("------Non-Static Methods-----");
        System.out.println("the value of a="+a);
        System.out.println("the value of b="+b);
    }
    static void m2(){
        System.out.println("------Static Methods-------");
        System.out.println("the value of b="+b);
    }
    
    public static void main(String[] args) {
        DemoMethods1 ob=new DemoMethods1();
        ob.m1();
        DemoMethods1.m2();
    }
}
