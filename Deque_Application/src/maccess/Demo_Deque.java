package maccess;
import java.util.*;
public class Demo_Deque {
	public static void main(String[] args) {
			ArrayDeque<Integer> ad = new ArrayDeque<Integer> ();
			ad.add(new Integer(12));
			ad.add(new Integer(13));
			ad.add(new Integer(14));
			System.out.println(ad.toString());
			ad.addFirst(new Integer(11));
			ad.addLast(new Integer(15));
			System.out.println(ad.toString());
			ad.removeFirst();
			ad.removeLast();
			System.out.println(ad.toString());
	}
}
