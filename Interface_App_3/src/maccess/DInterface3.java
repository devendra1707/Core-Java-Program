package maccess;
import java.util.Scanner;
import test.*;
public class DInterface3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		xyz:
			while(true)
			{
				System.out.println("Enter the PinNo:");
				int pinNo=s.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean z=cpn.verify(pinNo);
				if(z)
				{
					System.out.println("=====Choice=====");
					System.out.println("1.WithDraw\n2.Deposit");
					System.out.println("Enter the Choice:");
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter the amt:");
						int a1=s.nextInt();
						if(a1>0 && a1%100==0)
						{
							WithDraw wd = new WithDraw();
							wd.process(a1);
						}	//end of if
						else
						{
							System.out.println("Invalid amt...");
						}
						break xyz;
					case 2:
						System.out.println("Enter the amt:");
						int a2=s.nextInt();
						if(a2>0 && a2%100==0) 
						{
						Deposit dp = new Deposit();
						dp.process(a2);
						}
						else
						{
							System.out.println("Invalid amt...");
						}
						break xyz;
							default:
								System.out.println("Invalid Choice...");
					}	//end switch case
					
				}	//end of if
				else
				{
					System.out.println("Invalid PinNo...");
					count++;
				}
				if(count==3)
				{
				System.out.println("Sorry ! Transaction Blocked...");
				break xyz;
				}
			}	//end while loop
		s.close();
	}
}
