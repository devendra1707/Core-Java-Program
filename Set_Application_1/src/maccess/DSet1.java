package maccess;
import java.util.*;
public class DSet1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				Set<Integer> st = null;
					// Set holding Unlimited Integer Object
				System.out.println("===Choice===");
				System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
				System.out.println("Enter the Choice : ");
				int choice = s.nextInt();
				switch(choice) 
				{
				case 1:
				st = new HashSet<Integer>();
				System.out.println("HashSet Object Created");
				break;
				case 2:
				st = new LinkedHashSet<Integer>();
				System.out.println("LinkedHashSet Object Created");
				break;
				case 3:
					st = new TreeSet<Integer>();
					System.out.println("TreeSet Object Created");
					break;
					default:
						System.out.println("Invalid Choice...");
						System.exit(0);
				}	//end of choice
				System.out.println("Enter the Number of Integer Objects : ");
				int n = s.nextInt();
				System.out.println("Enter "+n+" Integer Objects");
				for(int i=1;i<=n;i++)
				{
					st.add(new Integer(s.nextInt()));
				}	// end of loop
				System.out.println("===Display from Set Object===");
				System.out.println(st.toString());
			}
			catch(Exception e) 	{	e.printStackTrace();}
		}		//end of try -with-resource
		s.close();
	}
}
