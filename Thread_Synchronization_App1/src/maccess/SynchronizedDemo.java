package maccess;
class Display
{
	public synchronized void wish(String name)
	{
		for(int i=1;i<=10;i++) {
			System.out.println("Good Morning : ");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) { }
		System.out.print(name);
	}
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"YuvRaj");
		t1.start();
		t2.start();
	}
}
