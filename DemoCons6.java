// Loading data to Object using "Setter Methods."
import java.util.Scanner;

class UserLogin{
    String userName;
    long phNo;
    void setUserName(String uN){
        userName=uN;
    }
    String getUserName(){
        return userName;
    }
    void setPhNo(long pN){
        phNo=pN;
    }
    long getPhNo(){
        return phNo;
    }
}
public class DemoCons6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        UserLogin u=new UserLogin();
        System.out.print("Enter UserName : ");
        u.setUserName(s.nextLine());
        System.out.print("Enter PhoneNum : ");
        u.setPhNo(s.nextLong());
        s.close();
        System.out.println("======UserLoginDatail=======");
        System.out.println("UserName : "+u.getUserName());
        System.out.println("UserPhNo : "+u.getPhNo());
    }
}
