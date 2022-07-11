package maccess;
public class DArray_2 {
	public static void main(String[] args) {
		Integer a[] = new Integer[3];
			// Array holding 3 Integer Object
		String str[] = new String[3];
			// Array holding 3 String Object
		System.out.println("'===== Integer Object=====");
		a[0] = new Integer(12);
		a[1] = new Integer(13);
		a[2] = new Integer(21);
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i].toString());
		}	//end of loop
		System.out.println("===String Onject===");
		str[0] = new String("Java");
		str[1] = new String("nit");
		str[2] = new String("hyd");
		for(int i=0;i<3;i++)
		{
			System.out.println(str[i].toString());
		}	// end of loop
	}
}
