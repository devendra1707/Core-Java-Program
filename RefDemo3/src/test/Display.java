package test;
public class Display {
	public Product p;	//Instance reference variable
	public Display(Product p)		//Constructor to initialize Instance variable
	{
		this.p=p;
	}
	public void dis()
	{
		p.getProduct();
	}
}
