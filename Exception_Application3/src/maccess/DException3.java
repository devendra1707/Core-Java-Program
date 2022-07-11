package maccess;
public class DException3 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			System.out.println("Value:"+i);
			try {
				Thread.sleep(5000);  //Method_call
			}catch(InterruptedException ie)
			{ie.printStackTrace();}
		}	//end of loop
	}
}
