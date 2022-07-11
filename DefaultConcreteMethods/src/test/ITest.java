package test;
public interface ITest {
	public default void m1(int x) {
		System.out.println("=====Default Concrete m1()=====");
		System.out.println("The value x:"+x);
	}
	public abstract void m2(int y);
}
