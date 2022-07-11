package maccess;
import text.*;
public class MethodReferences {
	public static void main(String[] args) {
		ITest ob1 = Display :: new;	//Reference to Constructor
		ob1.dis(123); 	//Constructor_Body is executed
		
		Display d = new  Display(111);		//Con_Call
		ITest ob2 = d :: m1;	//Reference to Instance method
		ob2.dis(124); //Instance method_body is executed
		
		ITest ob3 = Display :: m2 ; 	//Reference to Static method
		ob3.dis(125); 	//Static method_body is executed
	}
}
