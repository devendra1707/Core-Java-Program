package Student;
import java.util.Scanner;
class StudentResult
{
	int s1,s2,s3,s4,s5,s6,totMarks,p=0;
	float per;
	String result;
	void calculate()
	{
		totMarks = s1+s2+s3+s4+s5+s6;
		per = (float)totMarks/6;	//TypeCasting
		if(p==1)
		{
			result = "Fail";
		}
		else if(per>70 && per<100)
		{
			result="Destination";
		}
		else if(per>=60 && per<70)
		{
			result = "FirstClass";
		}
		else if(per>=50 && per<60)
		{
			result = "SecondClass";
		}
		else if(per>=35 && per<50)
		{
			result = "ThirdClass";
		}
		else 
		{
			result = "Fail";
		}
	}
	void getStudentResult()
	{
		System.out.println("=====StudentResult=====");
		System.out.println("Total Marks:"+totMarks);
		System.out.println("Percentage:"+per);
		System.out.println("Result:"+result);
	}
}
public class SMainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StudentResult sr = new StudentResult();
		System.out.println("Enter themarks of Sub1:");
		sr.s1=s.nextInt();
		System.out.println("Enter themarks of Sub2:");
		sr.s2=s.nextInt();
		System.out.println("Enter themarks of Sub3:");
		sr.s3=s.nextInt();
		System.out.println("Enter themarks of Sub4:");
		sr.s4=s.nextInt();
		System.out.println("Enter themarks of Sub5:");
		sr.s5=s.nextInt();
		System.out.println("Enter themarks of Sub6:");
		sr.s6=s.nextInt();
		
		if((sr.s1>=0 && sr.s1<=100) && (sr.s2>=0 && sr.s2<=100) &&  (sr.s3>=0 && sr.s3<=100) &&  (sr.s4>=0 && sr.s4<=100) &&  (sr.s5>=0 && sr.s5<=100)  &&  (sr.s6>=0 && sr.s6<=100))
		{
			if(sr.s1<=34 || sr.s2<=34 || sr.s3<=34 || sr.s4<=34 || sr.s5<=34 || sr.s6<=34)
			{
				sr.p=1;
			}
			sr.calculate();
			sr.getStudentResult();
		}	//end of if
		else
		{
			System.out.println("Invalid SubMarks...");
		}
	}
}
