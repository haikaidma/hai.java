package swing;
import javax.swing.JFrame;
public class SimpleFrame extends JFrame
{
	public SimpleFrame() {
		super();
		super.setTitle("hai kadima");
		super.setSize(500,200);
		super.setLocationRelativeTo(null);	//Frame nam giua mam hinh
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//close program
		super.setVisible(true);	//hien thi JFrame ra man hinh
	}

	public static void main(String[] args) {
		SimpleFrame me=new SimpleFrame();

	}

}