package maccess;
import java.util.*;
import test.*;
public class LambdaExpression2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value2:");
		int v2 = s.nextInt();
		System.out.println("=====Choice=====");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Choice:");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:	//Greater
			IComparable gt = (int x,int y)->
			{
			if(x>y)	return x;
			else return y;
			};
			System.out.println("Greater Value:"+gt.compare(v1, v2));
			break;
		case 2:		//Smaller
			IComparable sm = (int x , int y)->
			{
				if(x<y)	return x;
				else return y;
			};
			System.out.println("Smaller Value:"+sm.compare(v1,v2));
			break;
			default:
				System.out.println("Invalid Choice...");
		}	//end of switch
		s.close();
	}
}
