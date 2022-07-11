package test;
public class Display2 implements Runnable {
@Override
public void run()
{
	for(int i=101;i<=105;i++) {
		System.out.println("Task - Two  : "+i);
	try
	{
		Thread.sleep(4000);
	}
	catch(InterruptedException ie) {ie.printStackTrace();}
	}
}
}
