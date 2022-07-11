package maccess;
public class DThread3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Task - One : "+i);
				try
				{
				Thread.sleep(4000);	
				}
				catch(InterruptedException ie) {ie.printStackTrace();}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=101;i<=105;i++)
			{
				System.out.println("Task - Two : "+i);
				try
				{
					Thread.sleep(400);
				}
			catch(InterruptedException ie) {ie.printStackTrace();}
			}
		});
		t1.start();
		t2.start();
	}
}
