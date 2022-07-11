package test;
public class Printer {
	public synchronized void print(int n,String user) {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" Print for "+user);
			try 
			{
				Thread.sleep(4000);
			}
			catch(InterruptedException ie) {ie.printStackTrace();}
		}	//end of loop
	}
}
