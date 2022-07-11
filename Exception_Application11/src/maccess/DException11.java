package maccess;
import java.util.*;
public class DException11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the value: ");
			int v = s.nextInt();
			// Exception for Non-Integer input
			// Object create for InputMismatchException
			int k = 44/v;	//Exception when v= 0
			// Object Create for ArithmeticException
			System.out.println("The value k:"+k);
		}	// end of tey
		catch(InputMismatchException ime) {
			System.out.println("Enter only Integer Value");
			System.out.println("Details:"+ime.getMessage());
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Enter only Non-Zero Value");
			System.out.println("Details:"+ob.getMessage());
				// ob.printStackTrace();
		}
		finally {
			s.close();
		}
	}
}
