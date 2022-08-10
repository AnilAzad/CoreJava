package test;

public class Employee {
	public String eId,eName,eDesg;
	public Address ad;
	public Contact c;
	public Salary sl;
	public Employee(Address ob1, Contact ob2, Salary ob3) {
		ad=ob1;
		c=ob2;
		sl=ob3;
	}
	public String toString() {
		return eId+"\n"+eName+"\n"+eDesg+"\n"+c.mailid+"\n"+c.phNo+"\n"+sl.totalSal()+"\n"+ad.huNo+"\n"+ad.sName+"\n"+ad.cityName+"\n"+ad.pinCode;
	}
	
}
