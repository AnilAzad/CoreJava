package maccess;

import test.Employee;
import java.util.*;

public class DemoArray5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Employees : ");
        int n = Integer.parseInt(s.nextLine());
        Employee[] a = new Employee[n];
        System.out.println("====Enter " + 2 + " Employee objects====");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Employee Details :" + (i + 1));
            System.out.print("Enter EmpId : ");
            String id = s.nextLine();
            System.out.print("Enter EmpName : ");
            String name = s.nextLine();
            System.out.print("Enter EmpDesg : ");
            String desg = s.nextLine();
            System.out.print("Enter EmpBSal : ");
            int bSal = Integer.parseInt(s.nextLine());
            float totSal = bSal + (0.93F * bSal) + (0.63F * bSal);
            a[i] = new Employee(id, name, desg, bSal, totSal);
        }
        System.out.println("\n*********EmployeeDetails**********");
        Spliterator<Employee> sp = Arrays.spliterator(a);
        sp.forEachRemaining((k) -> {
            System.out.println(k.toString() + " ");
        });
        s.close();
    }
}
