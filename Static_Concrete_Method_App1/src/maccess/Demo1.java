package maccess;
import test.*;
public class Demo1 {
	public static void main(String[] args) {
		ITest ob = (int x) ->{
			System.out.println("=====m1()=====");
			System.out.println("The value x:"+x);
		};
		ob.m1(123); 	//Abstract_method_call
		ITest.m2(124); 	//Static method_call
//		ob.m2(123);	//Compilation_Error
	}
}
