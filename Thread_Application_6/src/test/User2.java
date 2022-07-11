package test;
public class User2 implements Runnable {
	@Override
	public void run()
	{
		Printer.print(5, Thread.currentThread().getName());
	}
}
