package AppSwing;
@SuppressWarnings("serial")
public class Test extends Exception{
	void check(int a,int b) throws Test
	{
		try
		{
			if(a==0 || b==0)
			{
				throw new Test();
			}
		}		//end of try
		catch(Test t)
		{
			throw t;	// re-throw
		}
	}
}
