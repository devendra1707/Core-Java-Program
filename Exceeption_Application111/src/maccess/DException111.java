package maccess;
import java.util.*;
public class DException111 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the value:");
			int v = s.nextInt();
			//Exception for Non-Integer input
			// Object created for InputMismatchException
			int k = 44/v;	//Exception when v = 0
			System.out.println("The value k:"+k);
		}	//end of try
		catch(InputMismatchException | ArithmeticException ob) {
			System.out.println("Enter only Non-Zero Integer Value");
			System.out.println("Details:"+ob.getMessage());
		}
		finally
		{
			s.close();
		}
	}
}
