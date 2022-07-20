import java.util.Scanner;
class CTest3{
    CTest3(int x){
        System.out.println("======Constructor=====");
        System.out.println("The Value of v1 : "+x);
    }
    void dis(int y){
        System.out.println("====InstanceMethod=====");
        System.out.println("The value of v2 : "+y);
    }
}
public class DemoCons3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value1 : ");
        int v1=s.nextInt();
        System.out.print("Enter the value2 : ");
        int v2=s.nextInt();
        s.close();
        CTest3 ob=new CTest3(v1);
        ob.dis(v2);
    }
}
