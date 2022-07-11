package maccess;
import java.util.*;
public class DList2 {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
			//ArrayList Object holding Unlimited Integer Objects
	al.add(new Integer(12));
	al.add(new Integer(11));
	al.add(new Integer(13));
	System.out.println(al.toString());
	al.add(1,new Integer(500));
	System.out.println(al.toString());
	al.remove(1);
	System.out.println(al.toString());
}
}
