package test;
public class Display1 implements Runnable {
@Override
public void run()
{
	for(int i=1;i<=5;i++) {
		System.out.println("Task-One : "+i);
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException ie)
		{	ie.printStackTrace(); }
	}
}
}
