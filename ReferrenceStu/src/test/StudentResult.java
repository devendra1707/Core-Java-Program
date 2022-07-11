package test;

public class StudentResult {
	public String result;
	public float per;
	public void calculate(int totM, boolean p)
	{
		per=(float)totM/6;
		if(p)
		{
			result="Fail";
		}
		else if(per>=70 && per<=100)
		{
			result="Destination";
		}
		else if(per>=60 && per<70)
		{
			result="FirstClass";
		}
		else if(per>=50 && per<60)
		{
			result="SecondClass";
		}
		else if(per>=35 && per<50)
		{
			result="ThirdClass";
		}
		else
		{
			result="Fail";
		}
	}	
		public void getStudentResult()
		{
			System.out.println("=====StudentResult=====");
			System.out.println("Per : "+per);
			System.out.println("Result : "+result);
		}
}
