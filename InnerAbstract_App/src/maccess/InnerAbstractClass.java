package maccess;
import test.*;
public class InnerAbstractClass {
	public static void main(String[] args) {
		SubClass.AClass1 ob1 = new SubClass.AClass1() {
			public void m1(int x) {
				System.out.println("x:"+x);
			}
		};
		ob1.m1(123);
		ITest.AClass2 ob2 = new ITest.AClass2() {
	public void m2(int y) {
			System.out.println("y:"+y);
			}
		};
		ob2.m2(125);
		AClass.AClass3 ob3 = new AClass.AClass3() {
			public void m3(int z) {
			System.out.println("z:"+z);	
			}
		};
		ob3.m3(12);
	}
}
