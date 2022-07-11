package maccess;
import test.*;
public class LambdaExpression1 {
	public static void main(String[] args) {
		ITest ob  = (int x)->
		{
			System.out.println("=====IClass m1()=====");
			System.out.println("x:"+x);
		};
		ob.m1(123); 	//Call_lambdaExpression using Interface_method_name
	}
}
