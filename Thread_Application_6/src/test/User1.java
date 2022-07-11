package test;
public class User1 implements Runnable {
	@Override
	public void run()
	{
		Printer.print(5, Thread.currentThread().getName());
	}
}
