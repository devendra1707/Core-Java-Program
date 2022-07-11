package maccess;
import test.*;
public class InnerClass1 {
	public static void main(String[] args) {
		PClass ob = new PClass()	{
				public void m1(int x)	{
			System.out.println("=====CClass m1()=====");
			System.out.println("x:"+x);
				}
		public void m3(int z) {
			System.out.println("=====CClass m3()=====");
			System.out.println("z:"+z);
		}
	};
	ob.m1(123);
	ob.m2(234);
//	ob.m3(124);	//Compilation_Error
	}
}
