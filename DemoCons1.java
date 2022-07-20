class CTest1{
    int x=10;
    CTest1(){
        System.out.println("------Constructor-----");
        System.out.println("The value of x : "+x);
    }
    void dis(){
        System.out.println("=====InstanceMethod======");
        System.out.println("The value of : "+x);
    }
}
public class DemoCons1{
    public static void main(String[] args) {
        
        CTest1 ob=new CTest1();
        ob.dis();
    }
}
