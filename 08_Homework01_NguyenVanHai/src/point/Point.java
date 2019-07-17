package point;

import java.util.Scanner;

public class Point {
	private double x,y;
	public Point() {

	}
	public Point(int x ,int y) {
		setX(x);
		setY(y);
	}
	public double getX() {
		return x;
	
	}
	public double getY() {
		return y;
	}
	public void setX(double xx) {
		this.x=xx;
	}
	public void setY(double yy) {
		this.y=yy;
	}
	public void input1() {
		Scanner kb= new Scanner(System.in);
		System.out.printf("Nhap vao : ");
		double x=kb.nextDouble();
		setX(x);
		double y=kb.nextDouble();
		setY(y);
	}
	public double distance(Point b) {
		return Math.sqrt(Math.pow(b.x-this.x,2))+ Math.pow(b.y-this.y,2);
	}
	public double distance(Point z,Point b) {
		return Math.sqrt(Math.pow(b.x-this.x,2))+ Math.pow(b.y-this.y,2);
	}
	public double perimeter(Point b,Point c) {
		double ab,ac,bc;
		ab=this.distance(b);
		ac=this.distance(c);
		bc=this.distance(c);
		if(ab+bc>ac&&ab+ac>bc&&ac+bc>ab)
		return ab+bc+ac;
		else 
			return 0;
		
	}
	public void output1() {
		System.out.println("["+this.x+";"+this.y+"]");
	
	}
	public static void main(String[] args) {
		Point p1= new Point();
		p1.input1();
		p1.output1();
		Point p2= new Point();
		p2.input1();
		p2.output1();
		Point p3= new Point();
		p3.input1();
		p3.output1();
		System.out.println(p1.perimeter(p2,p3));
		
		}

	}
