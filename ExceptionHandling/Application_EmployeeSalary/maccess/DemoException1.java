package maccess;

import java.util.*;

import test.Employee;
import test.Salary;

public class DemoException1 extends Exception {
    public DemoException1(String msg){
        super(msg);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            ArrayList<Employee> al =new ArrayList<Employee>();
            System.out.println("Enter the Number of Employees");
            int n=Integer.parseInt(s.nextLine());
            if (n<=0) {//Exception condition
                DemoException1 de=new DemoException1("Employees must be min 1...");
                throw de;//throwing the object onto catch block
            } 
            System.out.println("Enter "+n+" Employee Details : ");
            for (int i = 1; i <=n; i++) {
            Employee e=new Employee(new Salary());
            System.out.println("Enter the EmpId : ");
            e.id=s.nextLine();
            System.out.println("Enter the EmpName : ");
            e.name=s.nextLine();
            System.out.println("Enter the EmpDesg : ");
            e.desg=s.nextLine();
            System.out.println("Enter the EmpBSal : ");
            e.sl.bSal=Integer.parseInt(s.nextLine());
            if (e.sl.bSal<12000) {//Exception condition
                DemoException1 de=new DemoException1("Invalid bSal and must be min 12000 ...");
                throw de;
            }
            e.sl.totSal=e.sl.bSal+(0.93F*e.sl.bSal)+(0.63F*e.sl.bSal);
            al.add(e);
        }
        System.out.println("=====EmployeeDetails=====");
        al.forEach((k)->{
            System.out.println(k.toString());
        });
        
        }
        catch(NumberFormatException ob){
            System.out.println("Enter only Integer value...");
        }
        catch(DemoException1 de){
            System.out.println(de.getMessage());
        }
        finally{
            s.close();
        }
    }
}
