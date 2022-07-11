package AppSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SwingApp extends JFrame implements ActionListener{
	 String str,str1,str2;
	 JLabel lb;
	JLabel lb1;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;
	
	@SuppressWarnings("rawtypes")
	JComboBox jc;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JButton b1;
	JButton b2;
	
	@SuppressWarnings({"unchecked","rawtypes"})
	SwingApp()		//constructor
	{
		Container c = this.getContentPane();
		String str[] = {"ECE","CSE","EEE"};
		jc  = new JComboBox(str);
		c.setLayout(null);
		c.setBackground(Color.yellow);
		Font f1 = new Font("Dialog",Font.BOLD,30);
		lb = new JLabel("ADDITION");
		lb.setFont(f1);
		lb.setBounds(505, 50, 500,50);
		lb.setForeground(Color.blue);
		lb4 = new JLabel("Branch : ");
		lb.setFont(f1);
		lb4.setBounds(500, 100, 500, 50);
		lb4.setForeground(Color.red);
		Font f = new Font("Dialog",Font.BOLD,20);
		lb1 = new JLabel("Enter the val1");
		lb1.setFont(f);
		lb1.setBounds(50,100,100,50);
		lb1.setForeground(Color.red);
		t1 = new JTextField(50);
		t1.setBounds(200, 100, 100, 50);
		lb2 = new JLabel("Enter the val2");
		lb2.setFont(f);
		lb2.setBackground(Color.red);
		t2.setBounds(200,200,100,50);
		lb3 = new JLabel("Result");
		lb3.setFont(f);
		lb3.setBounds(50, 300, 500, 50);
		lb3.setForeground(Color.red);
		t3 = new JTextField(50);
		t3.setBounds(100, 400, 100, 50);
		b1 = new JButton("Add");
		b1.setBounds(200, 400, 100, 50);
		b2 = new JButton("Clear");
		b2.setBounds(250, 400, 100, 50);
		c.add(lb);
		c.add(lb1);
		c.add(t1);
		c.add(lb4);
		c.add(jc);
		c.add(lb2);
		c.add(t2);
		c.add(lb3);
		c.add(t3);
		c.add(b1);
		c.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		SwingApp obj = new SwingApp();
		obj.setTitle("SwingFrame");
		obj.setSize(800,600);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//close the window
	}
	public void actionPerformed(ActionEvent ae) {
		str  = ae.getActionCommand();
		if(str.equals("Add"))
		{
			str1 = t1.getText();
			str2 = t2.getText();
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			Test t = new Test();
			try
			{
				t.check(a,b);		//method call
			}
			catch(Test e)
			{
				JOptionPane.showMessageDialog(this,"invalid Input");
			}
			int c = a+b;
			t3.setText(""+c);
		}
		else 
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}

