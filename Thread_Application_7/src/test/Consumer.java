package test;
public class Consumer implements Runnable {
public Producer prod = null;
public Consumer(Producer prod) {
	this.prod = prod;
}
@Override
public void run()
{
	synchronized(prod.sb)
	{
		try
		{
			System.out.println("Consumer Blocked...");
			prod.sb.wait(); //Blocking the Consumer
			System.out.println("=====Display using Consumer=====");
			System.out.println(prod.sb);
		}
		catch(Exception e) {e.printStackTrace();}
	}	//end of look
}
}
