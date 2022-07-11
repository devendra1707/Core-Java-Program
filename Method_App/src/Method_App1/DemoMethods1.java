package Method_App1;
import java.util.Scanner;
class Addition
{
	int add(int x,int y)
	{
		return x+y;
	}
}
class Subtration
{
	int sub(int x,int y)
	{
		return x-y;
	}
}
class Multiplication
{
	int mul(int x,int y)
	{
		return x*y;
	}
}
class Division
{
	float div(int x,int y)
	{
		return (float)x/y;
	}
}
class ModDivision
{
	int ModDiv(int x,int y)
	{
		return x%y;
	}
}
public class DemoMethods1 {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the int value1:");
	int v1=s.nextInt();
	System.out.println("Enter the int value2:");
	int v2 = s.nextInt();
	System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.ModDiv");
	System.out.println("Enter your choice:");
	int choice = s.nextInt();
	switch(choice)
	{
	case 1:
		Addition ad = new Addition();
		System.out.println("Addition:"+ad.add(v1,v2));
		break;
		case 2:
			Subtration sb = new Subtration();
			System.out.println("Subtration:"+sb.sub(v1,v2));
			break;
		case 3:
			Multiplication ml = new Multiplication();
			System.out.println("Multiplication:"+ml.mul(v1,v2));
			break;
			case 4:
				Division dv = new Division();
				System.out.println("Division:"+dv.div(v1,v2));
				break;
			case 5:
				ModDivision md = new ModDivision();
				System.out.println("ModDivision:"+md.ModDiv(v1,v2));
				break;
	}	//end switch case
}
}
