package maccess;
import java.util.Scanner;
import text.*;
public class LambdaExpression3 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the int value1:");
	int v1 = s.nextInt();
	System.out.println("Enter the int value2:");
	int v2 = s.nextInt();
	System.out.println("=====Choice=====");
	System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv");
	System.out.println("Enter your Choice:");
	int choice = s.nextInt();
	switch(choice)
	{
	case 1:
		IAritmetic ad = (int x,int y)-> x+y;
			System.out.println("Sum:"+ad.process(v1,v2));
			break;
	case 2:
		IAritmetic sb = (int x,int y)-> x-y;
		System.out.println("Sub:"+sb.process(v1, v2));
		break;
	case 3:
		IAritmetic ml = (int x,int y)->x*y;
		System.out.println("Mul:"+ml.process(v1, v2));
		break;
	case 4:
		IAritmetic dv = (int x,int y)->(float)x/y;
		System.out.println("Div:"+dv.process(v1, v2));
		break;
	case 5:
		IAritmetic  md=(int x,int y)->x%y;
		System.out.println("ModDiv:"+md.process(v1, v2));
		break;
		default:
			System.out.println("Invalid Choice...");
	}	//end of switch
	s.close();
}
}
