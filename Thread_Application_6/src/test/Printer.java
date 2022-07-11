package test;
public class Printer {
	public synchronized static void print(int n,String user) 
	{
		for(int i=1;i<=n;i++) {
			System.out.println(i+" print for "+user);
			try 
			{
				Thread.sleep(4000);
			}
			catch(Exception e) {	e.printStackTrace();}
		}	//end of loop
	}
}
