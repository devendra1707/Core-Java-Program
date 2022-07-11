package test;
public class WithDraw implements Transaction {
		public void process(int amt)
		{
			if(amt<=b.bal) 
			{
				System.out.println("Amt WithDraw :"+amt);
				b.bal=b.bal-amt;
				b.getBalance();
				System.out.println("Transaction Completed...");
			}
			else
			{
				System.out.println("Insufficient Fund...");
			}
		}
}
