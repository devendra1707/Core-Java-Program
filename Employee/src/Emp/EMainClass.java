package Emp;
import java.util.Scanner;
class EmployeeSalary
{
	int bSal;
	float totSal;
	void calculate()
	{
		totSal=bSal+(0.93F*bSal)+(0.63F*bSal);
	}
	void getEmlpoyeeSalary()
	{
		System.out.println("=====EmployeeSalary=====");
		System.out.println("BSal:"+bSal);
		System.out.println("TotSal:"+totSal);
	}
}
public class EMainClass {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		EmployeeSalary es = new EmployeeSalary();
		System.out.println("Enter the bSal:");
		es.bSal=s.nextInt();
		if(es.bSal>=5000)
		{
			es.calculate();
			es.getEmlpoyeeSalary();
		}	//end of if
		else
		{
			System.out.println("Invalid bSal...");
		}
		s.close();
	}
}
