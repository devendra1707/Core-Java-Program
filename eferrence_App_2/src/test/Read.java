package test;
import java.util.Scanner;
public class Read {
	public void read(Scanner s,Student stu)
	{
		System.out.println("Enter StuName:");
		stu.name = s.nextLine();
		System.out.println("Enter Branch:");
		stu.branch = s.nextLine().toUpperCase();
		boolean z = stu.cb.verify(stu.branch);
		if(z)
		{
			System.out.println("RollNo:");
			stu.rollNo=s.nextLine();
			if(stu.rollNo.length()==10)
			{
				System.out.println("Enter HNo:");
				stu.ad.hNo = s.nextLine();
				System.out.println("Enter SName:");
				stu.ad.sName=s.nextLine();
				System.out.println("Enter City:");
				stu.ad.city=s.nextLine();
				System.out.println("Enter PinCode:");
				stu.ad.pinCode = Integer.parseInt(s.nextLine());
				System.out.println("====Enter the Marks of 6 Sub====");
				int totM=0,i=1;
				boolean k=false;
				while(i<=6)
				{
					System.out.println("Enter the Marks of Sub"+i);
					int sub=Integer.parseInt(s.nextLine());
					i++;
					if(sub<=0 || sub>=100)
					{
						System.out.println("Invalid Marks...");
						i--;
						continue;
					}
					if(sub>=0 && sub<=34)
					{
						k=true;
					}
					totM+=sub;
				}
				stu.sr.calculate(totM, k);
			}
			else
			{
				System.out.println("Invalid Branch...");
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
