package maccess;
import test.*;
public class Generalization1 {
	public static void main(String[] args) {
		PClass ob=new CClass();
		ob.m1(123);
		ob.m2(234);
//		ob.m3(124);	//Compilation_Error
	}
}
