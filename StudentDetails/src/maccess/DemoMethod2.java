package maccess;
import java.util.Scanner;
import text.*;
public class DemoMethod2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String sName = s.nextLine();
		System.out.println("CSE\nECE\nEEE");
		System.out.print("Enter Student Branch : ");
		String branch = s.nextLine().toUpperCase();
		CheckBranch cb = new CheckBranch();
		boolean z = cb.verify(branch);
		if(z)
		{
			System.out.println("Enter the Student Roll No. : ");
			String rollNo = s.nextLine();
			if(rollNo.length()==10)
			{
				System.out.println("======Enter 6 Sub Marks=====");
				int i=1,totMarks=0;
				boolean p=false;
				while(i<=6)
				{
					System.out.println("Enter the Marks of Sub"+i+" ");
					int sub = s.nextInt();
					i++;
					if(sub<=0 || sub>100)
					{
						System.out.println("Invalid Marks...");
						i--;
						continue;	//skip the below lines within the loop
					}
					if(sub>=0 && sub<=34)
					{
						p=true;
					}
					totMarks=totMarks+sub;	
				}		//end of loop
				System.out.println("=====================");
				System.out.println("Student Name : "+sName);
				System.out.println("Student Branch : "+branch);
				System.out.println("Student Roll No : "+rollNo);
				System.out.println("Tot Marks : "+totMarks);
				StudentResult sr = new StudentResult();
				sr.calculate(totMarks, p);
				sr.getStudentResult();
			}		//end of if
			else
			{
				System.out.println("Invalid Roll No...");
			}
		}		//end of if
		else 
		{
			System.out.println("Invalid Branch...");
		}
		
		s.close();
	}

}
