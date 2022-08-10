package maccess;
import test.*;
import java.util.*;
public class DemoRef2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Contact c=new Contact();
		Salary sl=new Salary();
		Address ad=new Address();
		Employee e=new Employee(ad, c, sl);
		EmpRegistration ob=new EmpRegistration();
		ob.register(s,e);
		DisplayEmpDetails ob2=new DisplayEmpDetails();
		ob2.des(e);
	}
}

