package test;
public class CClass extends PClass {
	public static void m(int x,int y,int z) {
		System.out.println("=====1stm()=====");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}
	public static void m(int x,int y)
	{
		System.out.println("=====2ndm()=====");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	public void dis(int x,int y,int z) {
		this.m(x, y, z);
		this.m(x, y);
		this.m(x);
	}
}
