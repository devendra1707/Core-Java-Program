package maccess;
import test.*;
public class InnerInterface {
	public static void main(String[] args) {
	SubClass.ITest1 ob1 = (int x)->{
		System.out.println("=====m1()=====");
		System.out.println("x:"+x);
	};	
	ob1.m1(123);
	ITest.ITest2 ob2 = (int y)->{
		System.out.println("=====m2()=====");
		System.out.println("y:"+y);
	};
	ob2.m2(124);
	AClass.ITest3 ob3 = (int z) ->{
		System.out.println("=====m3()=====");
		System.out.println("z:"+z);
	};
	ob3.m3(125);
	}
}
