package test;
import java.util.Scanner;
public class Read {
	public void read(Scanner s,Student stu) 
	{
		System.out.println("Enter the StuName:");
		stu.name = s.nextLine();
		System.out.println("Enter the StuBranch:");
		stu.branch = s.nextLine().toUpperCase();
		boolean k = stu.cb.verify(stu.branch);
		if(k)
		{
			System.out.println("Enter the RollNo:");
			stu.rollNo = s.nextLine();
			if(stu.rollNo.length()==10)
			{
				System.out.println("Enter the HNo:");
				stu.ad.hNo = s.nextLine();
				System.out.println("Enter the SName:;");
				stu.ad.sName = s.nextLine();
				System.out.println("Enter the City:");
				stu.ad.city = s.nextLine();
				System.out.println("Enter the PinCode:");
				stu.ad.pinCode = Integer.parseInt(s.nextLine());
				System.out.println("=====Enter 6 Sub Marks=====");
				int totM=0,i=1;
				boolean p=false;
				while(i<=6)
				{
					System.out.println("Enter the Sub"+i);
					int sub=Integer.parseInt(s.nextLine());
							i++;
					if(sub<0 || sub>100) 
					{
						System.out.println("Invalid Marks...");
							i--;
						continue;		
					}	//end of if
					if(sub>=0 && sub<=34)
					{
						p=true;
					}
					totM+=sub;
				}	//end of loop
				stu.sr.calculate(totM, k);
			}		//end of if
			else
			{
				System.out.println("Invalid RollNo...");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Invalid Branch...");
			System.exit(0);
		}
	}
}
