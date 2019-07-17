package option_pane;
import javax.swing.JOptionPane;
public class JOptionPane_Example {

	public static void main(String[] args) {
		/*
		JOptionPane.showMessageDialog(null,"Hello everyone");
		
		int a=JOptionPane.showConfirmDialog(null,"Do you love me");
		JOptionPane.showMessageDialog(null,a);
		if(a==JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null,"I am so happy");
		
		String name= JOptionPane.showInputDialog(null,"What is your name?");
		JOptionPane.showMessageDialog(null,"My name is " + name);
		*/	
		String aa= JOptionPane.showInputDialog(null,"Enter a");
		int a=Integer.parseInt(aa);
		String bb= JOptionPane.showInputDialog(null,"Enter b");
		int b=Integer.parseInt(bb);
		JOptionPane.showMessageDialog(null,a+ "+" +b+ "=" +(a+b)  );
		
		int c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter c"));

	}

}