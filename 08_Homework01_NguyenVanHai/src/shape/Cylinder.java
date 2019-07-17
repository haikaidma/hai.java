package shape;
import java.util.Scanner;
public class Cylinder extends Circle{
	private double hight;
	public Cylinder() {
		
	}
	public Cylinder(double h,double r) {
		super();
		setHight(h);
	}
	public double getHight() {
		return this.hight;
	}
	public void setHight(double h) {
		this.hight=h;
	}
@Override
	public void input() {
		Scanner k=new Scanner(System.in);
		System.out.println("enter hight:");
		setHight(k.nextDouble());
		super.input();
	}
	public double area() {
		return 2*super.area()+2*Math.PI*getRedius()*this.hight;
	}
	public double perimeter() {
		return 2*getRedius()*Math.PI;
	}
	public void output() {
		System.out.println("area: "+area());
		System.out.println("perimeter"+perimeter());
	}
	public static void main(String[] args) {
		Cylinder cy=new Cylinder();
		cy.input();
		cy.output();
	}

}
