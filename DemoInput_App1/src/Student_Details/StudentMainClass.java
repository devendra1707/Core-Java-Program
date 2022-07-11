package Student_Details;
import java.util.Scanner;
class StudentData
{
	String stuName,branch;
	int rollNo;
	void getStudentData()
	{
		System.out.println("=====StudentData=====");
		System.out.println("RollNo:"+rollNo);
		System.out.println("Student Name:"+stuName);
		System.out.println("Branch:"+branch);
	}
}
class StudentAddress
{
	String hNo,sName,city;
	int pinCode;
	void getStudentAddress()
	{
		System.out.println("=====StudentAddress=====");
		System.out.println("HNo:"+hNo);
		System.out.println("SName:"+sName);
		System.out.println("City:"+city);
		System.out.println("PinCode:"+pinCode);
	}
}
class StudentContact
{
	String mailId;
	long phoneNo;
	void getStudentContact()
	{
		System.out.println("=====StudentContact=====");
		System.out.println("PhoneNo:"+phoneNo);
		System.out.println("MailId:"+mailId);
	}
}
public class StudentMainClass {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	StudentData sd = new StudentData();
	StudentAddress sa = new StudentAddress();
	StudentContact sc = new StudentContact();
	
	System.out.println("Enter RollNo:");
	sd.rollNo=Integer.parseInt(s.nextLine());
	System.out.println("Enter StuName:");
	sd.stuName	=	s.nextLine();
	System.out.println("Enter Branch:");
	sd.branch=s.nextLine();
	System.out.println("Enter HNo:");
	sa.hNo=s.nextLine();
	System.out.println("Enter SName:");
	sa.sName = s.nextLine();
	System.out.println("Enter City:");
	sa.city = s.nextLine();
	System.out.println("Enter PinCode");
	sa.pinCode = Integer.parseInt(s.nextLine());
	System.out.println("Enter PhoneNo:");
	sc.phoneNo = Long.parseLong(s.nextLine());
	System.out.println("Enter MailId:");
	sc.mailId = s.nextLine();
	
	sd.getStudentData();
	sa.getStudentAddress();
	sc.getStudentContact();
	
	s.close();
		}
}
