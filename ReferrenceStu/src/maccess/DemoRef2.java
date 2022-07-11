package maccess;
import java.util.Scanner;
import test.*;
public class DemoRef2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student stu = new Student();
		Read r = new Read();
		r.Read(s, stu);
		Display d = new Display();
		d.dis(stu);
		s.close();
	}

}
