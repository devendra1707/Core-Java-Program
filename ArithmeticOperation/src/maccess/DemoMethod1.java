package maccess;
import java.util.Scanner;
import text.*;
public class DemoMethod1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the valud1 : ");
		int v1=s.nextInt();
		System.out.print("Enter the value2 : ");
		int v2 = s.nextInt();
		System.out.println("=======Choice=======");
		System.out.println("1.Addition\n2.Subtration\n3.Multiplication\n4.Division\n5.ModDivision");
		int choice=s.nextInt();
		System.out.println("====================");
		switch(choice)
		{
		case 1:
			Addition ad=new Addition();
			System.out.println("Addition : "+ad.add(v1,v2));
			break;
		case 2:
			Subtraction su = new Subtraction();
			System.out.println("Subtration : "+su.sub(v1,v2));
			break;
		case 3:
			Multiplication mu=new Multiplication();
			System.out.println("Multiplication : "+mu.mul(v1,v2));
			break;
			case 4:
				Division dv=new Division();
				System.out.println("Division : "+dv.div(v1, v2));
				break;
			case 5:
				ModDivision md=new ModDivision();
				System.out.println("ModDivision : "+md.mod(v1,v2));
				break;
				default:
					System.out.println("Invalid Choice...");
		}	//end of switch case
		s.close();
	}

}
