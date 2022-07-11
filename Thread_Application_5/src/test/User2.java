package test;
public class User2 implements Runnable{
	public Printer p;
	public User2(Printer p) {
		this.p = p;
	}
	@Override
	public void run()
	{
		p.print(5, Thread.currentThread().getName());
	}
}
