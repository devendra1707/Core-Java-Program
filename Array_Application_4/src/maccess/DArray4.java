package maccess;
public class DArray4 {
public static void main(String []args) {
	Integer a1[] = {1,2,3};
	Integer a2[] = {111,12,13,14};
	Integer a3[] = {22,23,24,25,26};
	Integer a[][] = {a1,a2,a3};	// Array holding Array Object
	System.out.println("===Jagged Array===");
	for(int i=0;i<a.length;i++)
	{
		System.out.print("Array :- "+(i+1)+" => ");
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}		//end of InnerLoop
		System.out.println();
	}	 	// end of OuterLoop 
}
}
