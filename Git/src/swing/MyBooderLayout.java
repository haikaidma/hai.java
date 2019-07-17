package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyBooderLayout extends JFrame{
	private JButton b1,b2,b3,b4,b5;
	public MyBooderLayout() {
		super();
		super.setTitle("Welcome to Simple Frame");
		super.setSize(400,200);
		super.setLocationRelativeTo(null);	//Frame nam giua mam hinh
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//close program
		super.setVisible(true);	//hien thi JFrame ra man hinh
		//thiet lap Layout cho frame
		super.setLayout(new BorderLayout());	//default layout cua Frame la BorderLayout chinh la co cung dc ma k cung k sao
	
		//doan lenh 2: thiet lap cac components
		b1=new JButton("I'm a button 1");
		b2=new JButton("Click me 2");
		b3=new JButton("I'm a button 3");
		b4=new JButton("Click me 4");
		b5=new JButton("I'm a button 5");
	
		//doan lenh 3:dua cac components vao container
		super.add(b1,BorderLayout.NORTH);
		super.add(b2,BorderLayout.SOUTH);
		super.add(b3,BorderLayout.EAST);
		super.add(b4,BorderLayout.WEST);
		super.add(b5,BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		MyBooderLayout mbl=new MyBooderLayout();

	}
}