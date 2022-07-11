package test;
public class Employee {
	public String empId,empName,empDesg;
	public Address ad = new Address();	//Object reference of Address Class
	public void getEmployee()
	{
		System.out.println("=====EmployeeDetails=====");
		System.out.println("EmpId:"+empId);
		System.out.println("EmpName:"+empName);
		System.out.println("EmpDesg:"+empDesg);
	}
}
