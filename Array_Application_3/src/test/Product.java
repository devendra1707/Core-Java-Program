package test;
public class Product {
	public String pName,pCode;
	public float pPrice;
	public int pQty;
	public Product(String pCode,String pName,float pPrice,int pQty)
	{
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}
	public String toString() {
		return pCode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
	}
}
