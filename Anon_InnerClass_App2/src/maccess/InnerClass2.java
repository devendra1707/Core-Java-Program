package maccess;
import test.*;
public class InnerClass2 {
	public static void main(String[] args) {
		ITest ob = new ITest()
				{
			public void m1(int x) {
				System.out.println("=====IClass m1()=====");
				System.out.println("x:"+x);
			}
			public void m2(int y) {
				System.out.println("=====IClass m1()=====");
				System.out.println("y:"+y);
			}
				};
				ob.m1(123);
//				ob.m2(234);	//Compilation_Error
	}
}
