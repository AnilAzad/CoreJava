package test;

public class EmpRegistration {
	public void register(java.util.Scanner s, Employee e) {
		System.out.print("Enter Employee Id : ");
		e.eId=s.nextLine();
		System.out.print("Enter Employee Name :");
		e.eName=s.nextLine();
		System.out.print("Enter Employee Desg : ");
		e.eDesg=s.nextLine();
		System.out.print("Enter MailId : ");
		e.c.mailid=s.nextLine();
		System.out.print("Enter Phone Number : ");
		e.c.phNo=Long.parseLong(s.nextLine());
		System.out.print("Enter bSal : ");
		e.sl.bSal=Float.parseFloat(s.nextLine());
		System.out.print("Enter HouseNo : ");
		e.ad.huNo=s.nextLine();
		System.out.print("Enter StreetName : ");
		e.ad.sName=s.nextLine();
		System.out.print("Enter CityName : ");
		e.ad.cityName=s.nextLine();
		System.out.print("Enter PinCode : ");
		e.ad.pinCode=s.nextInt();
	}
}
