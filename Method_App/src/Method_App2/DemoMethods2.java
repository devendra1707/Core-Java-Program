package Method_App2;
import java.util.Scanner;
class CheckBranch
{
	boolean k=false;
	boolean verify(String br) 
	{
		switch(br)
		{
		case "CSE": 	k=true;
		break;
		case	 "EEE":		k=true;
		break;
		case "ECE":		k=true;
		break;
		}	//end switch case
		return k;
	}
}
class StudentResult
{
	String result;
	float per;
	void calculate(int totMarks,boolean p)
	{
		per=(float)totMarks/6;
		if(p)
		{
			result="Fail";
		}
		else if(per>=70 && per<=100)
		{
			result="Destination";
		}
		else if(per>=60 && per<70)
		{
			result ="FirstClass";
		}
		else if(per>=50 && per<60)
		{
			result="SecondClass";
		}
		else if(per>=35 && per<50)
		{
			result="Fail";
		}
		else
		{
			result="Fail";
		}
	}
	void getStudentResult()
	{
		System.out.println("=====StudentResult=====");
		System.out.println("Per:"+per);
		System.out.println("Result:"+result);
	}
}
public class DemoMethods2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Student Name:");
		String name=s.nextLine();
		System.out.println("Enter the Student Branch:");
		String branch=s.nextLine().toUpperCase();
		CheckBranch cb = new CheckBranch();
		boolean z=cb.verify(branch);
		if(z)
		{
			System.out.println("Enter the RollNo:");
			String rollno=s.nextLine();
			if(rollno.length()==10)
			{
				System.out.println("=====Enter the Marks of 6 sub=====");
				int i=1,totMarks=0;
				boolean p=false;
				while(i<=6)
				{
					System.out.println("Enter the Mark of Sub"+i);
					int sub=s.nextInt();
					i++;
					if(sub<0 || sub>100)
					{
						System.out.println("Invalid Marks...");
						i--;
						continue;	//skip the below lines within the loop
					}
					if(sub>=0 && sub<=34)
					{
						p=true;
					}
					totMarks+=sub;
				}	//end of loop
				System.out.println("Stu Name:"+name);
				System.out.println("Stu Branch:"+branch);
				System.out.println("Stu RollNo:"+rollno);
				System.out.println("TotMarks:"+totMarks);
				StudentResult sr = new StudentResult();
				sr.calculate(totMarks, p);
				sr.getStudentResult();
			}	// end of else
			else
			{
				System.out.println("Invalid RollNo...");
				System.exit(0);
			}
		}
		else
		{
		System.out.println("Invalid Branch...");
		}
		System.exit(0);
		s.close();
	}
}
