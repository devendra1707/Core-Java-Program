package maccess;
import text.*;
public class InnerClass2 {
	public static void main(String[] args) {
		ITest.SubClass2 ob2 = new ITest.SubClass2();
		ob2.m2(123);
		AClass.SubClass3 ob3 = new AClass.SubClass3();
		ob3.m3(234);
	}
}
