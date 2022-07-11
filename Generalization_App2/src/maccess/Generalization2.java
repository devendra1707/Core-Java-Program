package maccess;
import test.*;
public class Generalization2 {
	public static void main(String[] args) {
	ITest ob = new IClass();
	ob.m1(123);
//	ob.m2(234);	//Compilation_Error
	}
}