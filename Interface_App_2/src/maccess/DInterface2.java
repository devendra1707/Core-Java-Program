package maccess;
import java.util.Scanner;
import test.*;
public class DInterface2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the int value1:");
		int v1 = s.nextInt();
		System.out.println("Enter the int value2:");
		int v2 = s.nextInt();
		System.out.println("=====Choice=====");
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.ModDiv");
		System.out.println("Enter your Choice:");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			Addition ad = new Addition();
			System.out.println("Sum:"+ad.process(v1,v2));
			break;
		case 2:
			Subtraction sb = new Subtraction();
			System.out.println("Sub:"+sb.process(v1,v2));
			break;
		case 3:
			Multiplication ml = new Multiplication();
			System.out.println("Mul:"+ml.process(v1,v2));
			break;
		case 4:
			Division dv = new Division();
			System.out.println("Div:"+dv.process(v1,v2));
			break;
		case 5:
			ModDivision md = new ModDivision();
			System.out.println("ModDiv:"+md.process(v1,v2));
			break;
			default:
				System.out.println("Invalid Choice...");
		}	//end switch case
		s.close();
	}
}
