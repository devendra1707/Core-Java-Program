package maccess;
import test.*;
public class DThread_1 {
	public static void main(String[] args) {
		Display1 ob1 = new Display1();
		Display2 ob2 = new Display2();
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		t1.start();
		t2.start();
	}
}
