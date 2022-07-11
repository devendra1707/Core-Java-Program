package Method_App3;
import java.util.Scanner;
class CheckPinNo
{
	boolean k=false;
	boolean verify(int pinNo)
	{
		switch(pinNo)
		{
		case 1111: 	k=true;
		break;
		case 2222:	k=true;
		break;
		case 3333:	k=true;
		break;
		}	//end switch case
		return k;
	}
}
class WithDraw
{
	void wDraw(int amt)
	{
		System.out.println("Amt WithDraw:"+amt);
		System.out.println("Balance:"+(2000-amt));
		System.out.println("Transaction Completed...");
	}
}
class Deposit
{
	void deposit(int amt)
	{
		System.out.println("Amt Deposit:"+amt);
		System.out.println("Balance:"+(2000+amt));
		System.out.println("Transaction Completed...");
	}
}
public class DemoMethod3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cout=0;
		xyz:
			while(true)
			{
				System.out.println("Enter the PinNo:");
				int pinNo = s.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean z = cpn.verify(pinNo);
				if(z)
				{
					System.out.println("=====Choice=====");
					System.out.println("1.WithDraw\n2.Deposit");
					System.out.println("Enter your Choice:");
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter the amt:");
						int a1=s.nextInt();
						if(a1>0 && a1%100==0)
						{
							if(a1<=2000)
							{
								WithDraw wd = new WithDraw();
								wd.wDraw(a1);
							}	//end of if
							else
							{
								System.out.println("Insufficient fund...");
							}
							}
							else
							{
								System.out.println("Invali amt...");
							}
							break xyz;
							case 2:
								System.out.println("Enter the amt:");
								int a2=s.nextInt();
								if(a2>0 && a2%100==0)
								{
									Deposit dp = new Deposit();
									dp.deposit(a2);
								}	//end of if
								else
								{
									System.out.println("Invalid amt...");
								}
								break xyz;
								default:
								{
									System.out.println("Invalid choice...");
									break xyz;
								}
							}
			}	//end block
	}}}
