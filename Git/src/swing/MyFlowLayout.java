package swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class MyFlowLayout extends JFrame
{private JButton b1,b2,b3,b4,b5;
public MyFlowLayout() {
super();
super.setTitle("Welcome to Simple Frame");
super.setSize(400,200);
super.setLocationRelativeTo(null);	//Frame nam giua mam hinh
super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//close program
super.setVisible(true);	//hien thi JFrame ra man hinh
//thiet lap Layout cho frame
super.setLayout(new FlowLayout());

//doan lenh 2: thiet lap cac components
b1=new JButton("I'm a button 1");
b2=new JButton("Click me 2");
b3=new JButton("I'm a button 3");
b4=new JButton("Click me 4");
b5=new JButton("I'm a button 5");

//doan lenh 3:dua cac components vao container
super.add(b1);
super.add(b2);
super.add(b3);
super.add(b4);
super.add(b5);
}

public static void main(String[] args) {
	MyFlowLayout fl=new MyFlowLayout();

}
}