class CTest4{
    CTest4(int x){
        System.out.println("======CTest4(x)======");
        System.out.println("Value of x : "+x);
    }
    CTest4(int y,int z){
        System.out.println("======CTest4(y,z)======");
        System.out.println("Value of y : "+y);
        System.out.println("Value of z : "+z);
    }
}
public class DemoCons4 {
    public static void main(String[] args) {
        CTest4 ob1=new CTest4(12);
        CTest4 ob2=new CTest4(34, 54);
    }
}
