package shape;
import java.util.*;
public class Circle implements Shape {
	private double redius;
	public Circle() {
		
	}
	public Circle(double r) {
		setRedius(r);
	}
	public double getRedius(){
		return redius;
	}
	public void  setRedius(double r) {
		if(r<0)redius=0;
		else redius =r;
	}
	public void input() {
		Scanner kb= new Scanner(System.in);
		System.out.println("enter redius:");
		setRedius(kb.nextDouble());
	}
	@Override
	public double area()
	{
		return redius*redius*Math.PI;
	}
	public double perimeter()
	{
		return redius*2*Math.PI;
	}
	public void output() {
		System.out.println("area:"+area());
		System.out.println("perimeter:"+perimeter());
	}
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		/*c1.redius=3;
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		Circle c2=new Circle();
		c2.redius=5;
		System.out.println(c2.area());
		System.out.println(c1.perimeter());
		Circle c3=new Circle(5);
		System.out.println(c3.redius);*/
		c1.input();
		c1.output();
	}

}
