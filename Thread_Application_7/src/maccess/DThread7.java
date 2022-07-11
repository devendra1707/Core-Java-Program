package maccess;
import test.*;
public class DThread7 {
	public static void main(String[] args) {
	Producer p = new Producer();	//Con_Call
	Consumer c = new Consumer(p); //Con_Call
	
	Thread t1 = new Thread(p);
	Thread t2 = new Thread(c);
	
	t2.start();
	t1.start();
	}
}