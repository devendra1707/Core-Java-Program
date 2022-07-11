package maccess;
import java.util.*;
public class DList1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
		try 
		{
			List<Integer> l = null;
					// List holding Integer Object
			System.out.println("=====Choice=====");
			System.out.println("1.ArrayList\n2.LinkedList\n3.Vector");
			System.out.println("Enter the Choice : ");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ArrayList Object Created : ");
				l = new ArrayList();
				break;
			case 2:
				System.out.println("LinkedList Object Created : ");
				l = new LinkedList();
				break;
			case 3:
				System.out.println("Vector Object Created :");
				l = new Vector();
				break;
				default:
					System.out.println("Invalid Choice...");
					System.exit(0);
			}	//end of switch case
			System.out.println("Enter the Number of Integer Objects ");
			int n = s.nextInt();
			System.out.println("Enter "+n+" Integer Objects");
			for(int i=1;i<=n;i++)
			{
				l.add(new Integer(s.nextInt()));
			}		//end of loop
			System.out.println("===Display from List Object===");
			System.out.println(l.toString());
		}
		catch(Exception e)
		{e.printStackTrace();}
		}	// end of try-with-resource
	s.close();
	} 
}
