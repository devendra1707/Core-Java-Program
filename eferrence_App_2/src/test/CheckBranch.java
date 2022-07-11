package test;
public class CheckBranch {
	public boolean z=false;
	public boolean verify(String br)
	{
		switch(br)
		{
		case "CSE":z=true;
		break;
		case "EEE":z=true;
		break;
		case "ECE":z=true;
		}	//end switch case
		return z;
	}
}
