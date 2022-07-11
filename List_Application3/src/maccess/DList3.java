package maccess;
import java.util.*;
public class DList3 {
public static void main(String[] args) {
	Vector<Integer> v = new Vector<Integer> ();
	v.addElement(new Integer(12));
	v.addElement(new Integer(11));
	v.addElement(new Integer(13));
	System.out.println(v.toString());
	System.out.println("FirstElement : "+v.firstElement());
	System.out.println("LastElement : "+v.lastElement());
	System.out.println("Ele at index 1: "+v.elementAt(1));
	v.insertElementAt(new Integer(500),1);
	System.out.println(v.toString());
	v.setElementAt(new Integer(600),1);
	System.out.println(v.toString());
}
}
