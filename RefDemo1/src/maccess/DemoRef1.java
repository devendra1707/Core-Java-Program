package maccess;
import java.util.Scanner;
import test.*;
public class DemoRef1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Employee e = new Employee();
		Read r = new Read();
		r.Read(s, e); 	//Reference variable as parameter
		Display d = new Display();
		d.dis(e);	//Reference as parameter
		s.close();
	}

}
