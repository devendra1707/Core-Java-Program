package maccess;
import java.util.*;
public class DQueue1 {
	public static void main(String[] args) {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer> ();
			pq.add(new Integer(500));
			pq.add(new Integer(12));
			pq.add(new Integer(200));
			pq.add(new Integer(234));
			System.out.println("=====Queue====");
			System.out.println(pq.toString());
	}
}
