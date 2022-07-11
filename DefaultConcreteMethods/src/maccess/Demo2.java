package maccess;
import test.*;
public class Demo2 {
	public static void main(String[] args) {
		ITest ob = (int y)-> 
		{
			System.out.println("=====m2()=====");
			System.out.println("The value y:"+y);
		};
		ob.m1(123); 	//default_method_Call
		ob.m2(124); 	//abstract_method_Call
	}
}
