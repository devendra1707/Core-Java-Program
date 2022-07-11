package test;
public class CheckBranch {
	public boolean p = false;
	public boolean verify(String br)
	{
		switch(br)
		{
		case "CSE": p=true;
				break;
		case "EEE":	p=true;
				break;
		case "ECE":	p=true;
				break;
		}
		return p;
	}
}
