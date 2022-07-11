package maccess;
import java.util.*;
public class DException1 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			try {
				System.out.println("Enter the value: ");
				int v = s.nextInt();
				int k = 44/v;	//Exception when v = 0
				// Object Created for AithmeticException
				System.out.println("The value k:"+k);
			}	//end of try
			catch(ArithmeticException ob) {
				System.out.println("Enter only Non-Zero value");
				System.out.println("Details:"+ob.getMessage());
				//ob.printStackTrace();
			}
			finally {
				s.close();
			}
	}
}
