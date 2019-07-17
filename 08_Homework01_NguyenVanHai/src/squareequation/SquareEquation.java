package squareequation;

public class SquareEquation {
	//khai bao thuoc tinh
	private int a,b,c;
	//cai dat cac phuong thuc
public SquareEquation() {
		
	}
	public SquareEquation(int aa,int bb, int cc) {
		setA(aa);
		setB(bb);
		setC(cc);
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public void setB(int bb) {
		b=bb;
	}
	public void setA(int aa) {
		a=aa;
	}
	public void setC(int cc) {
		c=cc;
	}
	public void solve()
	{
		double denta=b*b-4*a*c;
		if(denta>0) {
			System.out.println("x1= "+-b+Math.sqrt(denta)/(2*a));
			System.out.println("x2= "+(-b-Math.sqrt(denta))/(2*a));
			}
		else {
			if(denta==0) {
				System.out.println("x1=x2= "+-b/(2*a));
			}
			else {
				System.out.println("no root");
			}
		}	
	}
	public void f(int a, int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		//tai gia tri cu the rieng 
		SquareEquation s1=new SquareEquation();
		s1.a=1;
		s1.b=-4;
		s1.c=4;
		s1.solve();
		
		SquareEquation s2=new SquareEquation();
		s2.a=1;
		s2.b=-4;
		s2.c=5;
		s2.solve();
		
		SquareEquation s3=new SquareEquation();
		s3.a=2;
		s3.b=0;
		s3.c=-8;
		s3.solve();
		SquareEquation s4=new SquareEquation(4,5,6);
		System.out.println(s4.a);
		
	}

}
