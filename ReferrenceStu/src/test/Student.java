package test;

public class Student {
	public String sName,branch,rollNo;
	Address ad = new Address();
	CheckBranch cb = new CheckBranch();
	StudentResult sr = new StudentResult();
	public void getStudent()
	{
		System.out.println("=====StudentDetail=====");
		System.out.println("SName : "+sName);
		System.out.println("Branch : "+branch);
		System.out.println("RollNo : "+rollNo);
	}
}
