package maccess;
import java.util.Scanner;
import test.*; 
public class LambdaExpression4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		xyz:
			while(true)
				{
				System.out.println("Enter the PinNo:");
				int pinNo= s.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean z = cpn.verify(pinNo);
				if(z)
				{
					System.out.println("=====Choice=====");
					System.out.println("1.WithDraw\n2.Deposit");
					System.out.println("Enter the Choice:");
					int choice = s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter the amt:");
						int a1 = s.nextInt();
						if(a1>0 && a1%100==0)
						{
							Transaction wd = (int amt)->
							{
							 if(amt<=Transaction.b.bal)
								{
									System.out.println("Amt WithDrawn:"+amt);
									Transaction.b.bal=Transaction.b.bal-amt;
									Transaction.b.getBalance();
									System.out.println("Transaction Completed...");
								}
								else
								{
									System.out.println("Insufficient fund...");
								}
							};
							wd.process(a1);
						}	//end of if
						else
						{
							System.out.println("Invalid amt...");
						}
						break xyz;
					case 2:
						System.out.println("Enter the amt:");
						int a2 = s.nextInt();
						if(a2>0 && a2%100==0)
						{
							Transaction dp =(int amt)->
									{
								System.out.println("Amt Deposit:"+amt);
								Transaction.b.bal=Transaction.b.bal+amt;
								Transaction.b.getBalance();
								System.out.println("Transaction Completed...");
									};
							dp.process(a2);
						}	//end of if
						else
						{
							System.out.println("Invalid amt...");
						}
						break xyz;
					default:
						System.out.println("Invalid Choice...");
						break xyz;
				}	//end switch
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
	}	//end of while
		s.close();
	}
}
