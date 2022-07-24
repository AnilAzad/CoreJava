import java.util.Scanner;

class Employee{
    String eId,eName,eDesg;
    Employee(String id, String name, String desg){
        eId=id;
        eName=name;
        eDesg=desg;
    }
    void getEmployee(){
        System.out.println("=======EmployeeDetails=======");
        System.out.println("EmployeeId : "+eId);
        System.out.println("EmployeeName : "+eName);
        System.out.println("EmployeeDesg : "+eDesg);
    }
}
public class DemoCons7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter EmpId : ");  
        String id=s.nextLine();
        System.out.print("Enter EmpName : ");  
        String name=s.nextLine();
        System.out.print("Enter EmpDesg : ");  
        String desg=s.nextLine();
        s.close();
        Employee e=new Employee(id, name, desg);
        e.getEmployee();
    }

}
