package maccess;
import test.*;
public class DThread5 {
	public static void main(String[] args) {
		Printer p = new Printer();
		
		User1 u1 = new User1(p);
		User2 u2 = new User2(p);
		
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		
		t1.setName("Devendra !!!");
		t2.setName("Sonu !!!");
		
		t1.start();
		t2.start();
	}
}
