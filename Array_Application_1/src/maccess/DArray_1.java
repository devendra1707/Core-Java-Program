package maccess;
import java.util.*;
import test.*;
public class DArray_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			try {
				System.out.println("Enter the Number of Book : ");
				int n = Integer.parseInt(s.nextLine());
				BookData bd[] = new BookData[n];
				 	//Array holding n BookData Objects
				System.out.println("**Enter "+n+" BookDetails**");
				for(int i=0;i<n;i++) {
					System.out.println("Enter BookCode : ");
					String bCode = s.nextLine();
					System.out.println("Enter BookName : ");
					String bName = s.nextLine();
					System.out.println("Enter BookAuthor : ");
					String bAuthor = s.nextLine();
					System.out.println("Enter BookPrice : ");
					float bPrice = Float.parseFloat(s.nextLine());
					System.out.println("Enter BookQty : ");
					int bQty = Integer.parseInt(s.nextLine());
					bd[i] = new BookData(bCode,bName,bAuthor,bPrice,bQty);
				}	//end of loop
				System.out.println("=====Display Book Details=====");
				for(int i=0;i<n;i++)
				{
					System.out.println(bd[i].toString());
				}
			}
			catch(Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}	//end of try-With-Resource
		s.close();
	}
}
