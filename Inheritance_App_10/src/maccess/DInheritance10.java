package maccess;
public class DInheritance10 {
	public static void main(String[] args) {
		DInheritance10.main(12.34F);	//method_call
	System.out.println("=====Standard main()=====");
	for(int i=0;i<args.length;i++)
	{
		System.out.println(args[i]);
	}
	}
	public static void main(float k) {
		System.out.println("===Overloading main()=====");
		System.out.println("The value k:"+k);
	}
}
