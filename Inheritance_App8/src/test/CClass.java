package test;
public class CClass extends PClass {
	public CClass(int x,int y,int z) {
		this(x,y);		//Con_call from the same class
		System.out.println("z:"+z);
	}
	public CClass(int x,int y) {
		super(x);		//Con_call from the PClass
		System.out.println("y:"+y);
	}
}
