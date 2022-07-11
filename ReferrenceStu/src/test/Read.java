package test;
import java.util.Scanner;
public class Read {
	public void Read(Scanner s,Student stu)
	{
		String sName,branch,rollNo;
		System.out.println("Enter SName : ");
		stu.sName = s.nextLine();
		System.out.println("Enter the SBranch : ");
		stu.branch = s.nextLine().toUpperCase();
		boolean z = stu.cb.verify(stu.branch);
		if(z)
		{
			System.out.println("Enter the RollNo : ");
			stu.rollNo = s.nextLine();
			if(stu.rollNo.length()==10)
			{
				System.out.println("Enter the HNo : ");
				stu.ad.hNo = s.nextLine();
				System.out.println("Enter the SName : ");
				stu.ad.sName = s.nextLine();
				System.out.println("Enter the City : ");
				stu.ad.city = s.nextLine();
				System.out.println("Enter PinCode : ");
				stu.ad.pinCode = Integer.parseInt(s.nextLine());
				System.out.println("=====Enter the Marks of 6 Sub=====");
				int totM=0,i=1;
				boolean p=false;
				while(i<=6)
				{
					System.out.println("Enter the Marks of Sub"+i);
					int sub=Integer.parseInt(s.nextLine());
					i++;
					if(sub<0 || sub>100)
					{
						System.out.println("Invalid Marks...");
							i--;
							continue;
					}
					if(sub>=0 && sub<=34)
					{
						p=true;
					}
					totM+=sub;
				}	//end of loop
				stu.sr.calculate(totM, p);
			}
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
