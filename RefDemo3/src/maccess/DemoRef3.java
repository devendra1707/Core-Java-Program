package maccess;
import java.util.Scanner;
import test.*;
public class DemoRef3 {
	public static void main(String[] args) {
			Scanner s= new Scanner(System.in);	//Scanner Class Object 
			Product p=new Product();		//Product Class Object
			Read r = new Read(s,p);		//Con_call
			r.read();
			Display d = new Display(p);		//Con_call
			d.dis();
			s.close();
	}

}
