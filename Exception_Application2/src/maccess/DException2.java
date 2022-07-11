package maccess;
import java.util.*;
public class DException2 extends Exception{
	public DException2(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter the User Age:");
			int age = s.nextInt();
			if(age<18)	//Exception
			{
				DException2 ob = new DException2 ("Not-Eligible for Voting");
				throw ob;
			}
			System.out.println("Eligible for Voting...");
			System.out.println("Age:"+age);	
		}	//end of try
		catch(DException2 ob) 
		{
			System.out.println("Details:"+ob.getMessage());
		}
		finally
		{
			s.close();
		}
	}
}
