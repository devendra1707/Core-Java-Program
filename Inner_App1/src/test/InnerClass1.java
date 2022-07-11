package test;
import test.*;
public class InnerClass1 {
	public static void main(String[] args) {
		SubClass1 ob1 = new SubClass1();	//OuterClass Object
		ob1.m1();
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2();	//Static Member InnerClass Object
		SubClass1.SubClass2.m2();
		ob2.m22();
		SubClass1.SubClass3 ob3 = ob1.new SubClass3();
//		NonStatic member InnerClass object 
		SubClass1.SubClass3.m3();
		ob3.m33();
	}
}
