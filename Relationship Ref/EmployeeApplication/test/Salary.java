package test;

public class Salary {
	public float bSal;
	public float totalSal(){
		float totSal=bSal+(0.91F*bSal)+(0.63F*bSal);
		return totSal;
	}
	
}
