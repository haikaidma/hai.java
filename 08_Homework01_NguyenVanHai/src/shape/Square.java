package shape;
import java.util.*;
public class Square extends Rectangle{
	public Square() {
		super();
	}
	public Square(double edge) {
		super(edge,edge);
	}
@Override
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter edge");
		length=width=kb.nextDouble();
	}                                  
	public void output() {
		super.output();
}
	public static void main(String[] args) {
		Square s =new Square();
			s.input();
			s.output();
		
	}
}
