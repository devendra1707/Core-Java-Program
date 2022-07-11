package Demo;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class Demo1
{
	public static void main(String[] args)
	{
	JFrame f=new JFrame();
	f.setVisible(true);
	f.setSize(300,300);
	Container c=f.getContentPane();
	String[] header={"ENO","ENAME","ESAL"};
	Object[][] 
	body={{"111","aaa",5000},{"222","bbb",6000},{"333","ccc",7000},{"444","ddd",8000}};
	JTable t=new JTable(body,header);
	JTableHeader th=t.getTableHeader();
	c.setLayout(new BorderLayout());
	c.add("North",th);
	c.add("Center",t);
	}
}
