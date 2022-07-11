package test;
public class CClass extends PClass {
	public void m(int a,int b,int c,float x)
	{
		this.m(a,b,x); 	//Calling the method from same class
		System.out.println("c:"+c);
	}
	public void m(int a,int b,float x)
	{
		this.m(a, x);		//Calling the method from same class
		System.out.println("b:"+b);
	}
	public void m(int a,float x)
	{
		super.m(x);	//PClass method call
		System.out.println("a:"+a);
	}
}
