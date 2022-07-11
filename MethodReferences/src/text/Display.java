package text;
public class Display {
	public Display(int x) {
		System.out.println("=====Constructor_body=====");
		System.out.println("The value x:"+x);
	}
	public void m1(int y) {
		System.out.println("=====Instance Method_Body");
		System.out.println("The value y:"+y);
	}
	public static void m2(int z) {
		System.out.println("=====Static Method_Body=====");
		System.out.println("The value z:"+z);
	}
}
