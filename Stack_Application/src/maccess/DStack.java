package maccess;
import java.util.*;
public class DStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer> ();
		st.push(new Integer(12));
		st.push(new Integer(13));
		st.push(new Integer(14));
		st.push(new Integer(15));
		System.out.println(st.toString());
		System.out.println("peek element : "+st.peek());
		int pos = st.search(new Integer(13));
		System.out.println("Position of Object 13 :"+pos);
		st.pop();
		System.out.println(st.toString());
	}
}
