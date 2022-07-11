package test;
public class Student {
	public String name,branch,rollNo;
	public Address ad = new Address();
	public CheckBranch cb = new CheckBranch();
	public StudentResult sr = new StudentResult();
	public void getStudent()
	{
		System.out.println("=====StudentDetails=====");
		System.out.println("StuName : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("RollNo : "+rollNo);
	}
}
