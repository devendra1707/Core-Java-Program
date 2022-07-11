package test;
public class Producer implements Runnable {
	public StringBuffer sb = null;
	public Producer()
	{
		sb = new StringBuffer();
	}
		@Override
		public void run()
		{
			synchronized(sb)
			{
				try
				{
					for(int i=1;i<=10;i++) {
						sb.append(i+" : ");
						System.out.println("Producer Appeding...");
						Thread.sleep(4000);
					}	//end of loop
					sb.notify(); //Send message to Waiting Thread
				}
				catch(Exception e) {e.printStackTrace();}
			}	//end of loop
		}
 
}
