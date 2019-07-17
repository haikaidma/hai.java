package option_pane;
import javax.swing.JOptionPane;
public class Exercise2_Equation {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a"));
		int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter b"));
		int c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter c"));
		
		SquareEquation hai =new SquareEquation(a,b,c);
		String s=hai.slove();
		
		JOptionPane.showMessageDialog(null,"Result:"+(s) );

	}

}