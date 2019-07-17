package equation;

public class Test {

	public static void main(String[] args) {
		LinearEquation l=new LinearEquation();
		l.f(5, 6);
		l.f1(6, 5);
		l.f2(3, 4, 5);
		LinearEquation l1=new SquareEquation();
		l1.f(5, 6);
		l1.f1(6, 5);
		l1.f2(3, 4, 5);
		SquareEquation l2= new SquareEquation();
		l2.f(5, 6);
		l2.f1(6, 5);
		l2.f2(3, 4, 5);
	}
	}
