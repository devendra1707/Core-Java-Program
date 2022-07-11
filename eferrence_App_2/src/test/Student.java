package test;
public class Student {
		public String name,branch,rollNo;
		Address ad = new Address();
		CheckBranch cb = new CheckBranch();
		StudentResult sr = new StudentResult();
		public void getStudent()
		{
			System.out.println("=====StudentDetails=====");
			System.out.println("StuName:"+name);
			System.out.println("Branch:"+branch);
			System.out.println("RollNo:"+rollNo);
		}
}
