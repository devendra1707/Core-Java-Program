package test;
import java.util.Scanner;
public class Read {
	public void Read(Scanner s,Employee e)
	{
		System.out.println("Enter the EmpId:");
		e.empId = s.nextLine();
		System.out.println("Enter the EmpName:");
		e.empName = s.nextLine();
		System.out.println("Enter the EmpDesg:");
		e.empDesg = s.nextLine();
		System.out.println("Enter the HNo:");
		e.ad.hNo = s.nextLine();
		System.out.println("Enter the SName:");
		e.ad.sName = s.nextLine();
		System.out.println("Enter the City:");
		e.ad.city = s.nextLine();
		System.out.println("Enter the PinCode:");
		e.ad.pinCode = s.nextInt();
	}
}
