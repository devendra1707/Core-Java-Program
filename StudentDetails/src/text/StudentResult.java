package text;

public class StudentResult {
	public String result;
	public float per;
	public void calculate(int totMarks,boolean p)
	{
		per = (float)totMarks/6;
		if(p)
		{
			result = "Fail";
		}
		else if(per>=70 && per<=100)
		{
			result = "Designation";
		}
		else if(per>=60 && per<70) 
		{
			result = "FirstClass";
		}
		else if(per>=50 && per<60)
		{
			result = "SecondClass";
			}
		else if(per>=35 && per<50)
		{
			result = "ThirdClass";
		}
		else
		{
			result = "Fail";
		}	//end if else block
	}
	public void getStudentResult()
	{
		System.out.println("Per : "+per);
		System.out.println("Result : "+result);
	}

}
