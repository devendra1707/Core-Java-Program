package DVariable;
import java.util.Scanner;
class Display
{
	static int a;		//Class Variable
	int b;		//Instance Variable
	void dis1()	//NonStatic
	{
		int c =10;	//Local Variable
		System.out.println("=====Instance Method dis1()=====");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
		System.out.println("The value c:"+c);
	}
	static void dis2()
	{
		int d=20;	//variable
		System.out.println("=====static method dis2()=====");
		System.out.println("The value a:"+a);
//		System.out.println("The value b:"+b);	//Compilation_Error
		System.out.println("The value d:"+d);
	}
}
public class DemoVariables_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		Display.a = s.nextInt();
		Display d = new Display();
		System.out.println("Enter the value of b:");
		d.b = s.nextInt();
		System.out.println("The value b:"+d.b);
		Display.dis2();//Static method_call
		d.dis1();	//Instance method_call
	}
}
