package test;
public class CClass extends PClass {
	public static int b;
	public static void m2()
	{
		System.out.println("=====CClass=====");
		System.out.println("The value b:"+b);
	}
	static
	{
		System.out.println("CClass Static block...");
	}
}
