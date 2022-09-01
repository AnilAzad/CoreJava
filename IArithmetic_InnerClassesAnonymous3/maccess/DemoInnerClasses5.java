package maccess;
import java.util.Scanner;
import test.IArithmetic;

public class DemoInnerClasses5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Value v1 : ");
        int v1=s.nextInt();
        System.out.print("Enter the Value v2 : ");
        int v2=s.nextInt();
        System.out.println("=======Choice======");
        System.out.println("1.Add\n2.sub\n3.Mul\n4.Div\n5.ModDiv");
        System.out.print("Enter the Choice : ");
        switch(s.nextInt()){
            case 1:
            IArithmetic ob1=new IArithmetic(){
                public double cal(int v1, int v2){
                    return v1+v2;
                }
            };
            System.out.println("Sum : "+ob1.cal(v1, v2));
            break;
            case 2:
            IArithmetic ob2=new IArithmetic(){
                public double cal(int v1, int v2){
                    return v1-v2;
                }
            };
            System.out.println("Sub : "+ob2.cal(v1, v2));
            break;
            case 3:
            IArithmetic ob3=new IArithmetic(){
                public double cal(int v1, int v2){
                    return v1*v2;
                }
            };
            System.out.println("Sum : "+ob3.cal(v1, v2));
            break;
            case 4:
            IArithmetic ob4=new IArithmetic(){
                public double cal(int v1, int v2){
                    return v1/v2;
                }
            };
            System.out.println("Sum : "+ob4.cal(v1, v2));
            break;
            case 5:
            IArithmetic ob5=new IArithmetic(){
                public double cal(int v1, int v2){
                    return v1%v2;
                }
            };
            System.out.println("Sum : "+ob5.cal(v1, v2));
            break;
            default:
                System.out.println("Invalid Choice...");
        }
        s.close();
    }
}
