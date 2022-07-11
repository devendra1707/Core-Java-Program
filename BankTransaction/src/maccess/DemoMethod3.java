package maccess;
import java.util.Scanner;
import text.*;
public class DemoMethod3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count = 0;
		xyz:
			while(true)
			{
				System.out.print("Enter the PinNo. : ");
				int pinNo = s.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean p = cpn.verify(pinNo);
				if(p)
				{
					System.out.println("=====Choice=====");
					System.out.println("1.WithDraw\n2.Deposit");
					System.out.println("Enter the Choice : ");
					int choice = s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.print("Enter the Amt : ");
						int a1 = s.nextInt();
						if(a1>0 && a1%100==0)
						{
							if(a1<=2000)
							{
								WithDraw wd = new WithDraw();
								wd.wDraw(a1);
							}	//end of if
							else
							{
								System.out.println("InSufficient fund...");
							}
						}		//end of if
						else
						{
							System.out.println("Invalid amt...");
						}
						break xyz;
					case 2:
						System.out.print("Enter the Amt : ");
						int a2 = s.nextInt();
						if(a2>0 && a2%100==0)
						{
							Deposit dp = new Deposit();
							dp.deposit(a2);
						}		//end of if
						else
						{
							System.out.println("Invalid amt...");
						}
						break xyz;
						default:
							System.out.println("Invalid Choice...");
							break xyz;
					}		//end switch case
				}		//end of if
				else
				{
					System.out.println("Invalid PinNo...");
					count++;
				}
				if(count==3)
				{
					System.out.println("'Sorry ! Transaction Blocked...");
					break xyz;
				}
			}
		s.close();
	}
}		//end of while