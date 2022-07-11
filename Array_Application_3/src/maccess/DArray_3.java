package maccess;
import test.*;
public class DArray_3 {
	public static void main(String[] args) {
		Object o[] = new Object[3];
				// Array to hold DisSimilar Object
		o[0] = new Integer(111);
		o[1] = new String("NIT");
		o[2] = new Product("A123","KB",123.45F,12);
		System.out.println("===Display from Object Array===");
		for(int i=0;i<3;i++)
		{
			System.out.println(o[i].toString());
		}		//end of loop
	}
}
