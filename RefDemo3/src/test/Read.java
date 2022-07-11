package test;
import java.util.*;
public class Read {
	public Product p;	//Instance reference variable
	public Scanner s;	//Instance reference variable
		//Loosly Coupled reference concept
	public Read(Scanner s,Product p) 	//Constructor to initialize Instance variable
		{
			this.p=p;
			this.s=s;
		}
	public void read()
	{
		System.out.println("Enter the ProdCode :");
		p.pCode=s.nextLine();
		System.out.println("Enter the PName :");
		p.pName= s.nextLine();
		System.out.println("Enter the PPrice :");
		p.pPrice=s.nextFloat();
		System.out.println("Enter the ProdQty :");
		p.pQty=s.nextInt();
	}
}
