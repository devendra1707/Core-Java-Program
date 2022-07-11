package test;
public interface ITest {
	private void m1(int x) {
		System.out.println("=====m1()=====");
		System.out.println("The value x:"+x);
	}
	static private void m2(int y) {
		System.out.println("=====m2()=====");
		System.out.println("The value y:"+y);
	}
	default void dis(int x,int y) {
		this.m1(x);
		ITest.m2(y);
	}
}
