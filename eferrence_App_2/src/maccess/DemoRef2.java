package maccess;
import java.util.*;
import test.*;
public class DemoRef2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student stu = new Student();
		Read r = new Read();
		r.read(s, stu);
		Dispay d = new Dispay();
		d.dis(stu);
		s.close();
	}
}
