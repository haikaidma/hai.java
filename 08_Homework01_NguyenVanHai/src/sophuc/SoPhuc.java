package sophuc;
import java.util.*;

public class SoPhuc {

	private double real,imaginary;
	public double getReal() {
		return this.real;
	}
	public void setReal(double a) {
		this.real = a;
	}
	public double getImaginary() {
		return this.imaginary;
	}
	public void setImaginary(double b) {
		this.imaginary = b;
	}
	public   SoPhuc() {
		
	}
	public   SoPhuc(double a, double b) {
		setReal(a);
		setImaginary(b);
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a:");
		double a = in.nextDouble(); setReal(a);
		System.out.println("Enter b:");
		double b = in.nextDouble(); setImaginary(b);
	}
	public void output() {
		System.out.println(this.real+" + "+this.imaginary+"i" );
	}
	public SoPhuc addition(SoPhuc z2) {
		SoPhuc z3 = new SoPhuc();
		z3.real = this.real + z2.real;
		z3.imaginary = this.imaginary + z2.imaginary;
		System.out.print("Tong hai so phuc =");
		return z3;
	}
	public SoPhuc subtraction(SoPhuc z2) {
		SoPhuc z3 = new SoPhuc();
		z3.real = this.real - z2.real;
		z3.imaginary = this.imaginary - z2.imaginary;
		System.out.print("Hieu hai so phuc =");
		return z3;
	}
	public SoPhuc multiplication(SoPhuc z2) {
		SoPhuc z3 = new SoPhuc();
		z3.real = this.real*z2.real - this.imaginary*z2.imaginary;
		z3.imaginary = this.real*z2.imaginary + this.imaginary*z2.real;
		System.out.print("Tich hai so phuc =");
		return z3;
	}
	public SoPhuc division(SoPhuc z2) {
		SoPhuc z3 = new SoPhuc();
		z3.real =(this.real*z2.real+this.imaginary*z2.imaginary)/(Math.pow(z2.real,2)+Math.pow(z2.imaginary,2));
		z3.imaginary =(-this.real*z2.imaginary+z2.real*this.imaginary)/(Math.pow(z2.real, 2)+Math.pow(z2.imaginary,2));
		System.out.print("Th��ng hai so phuc =");
		return z3;
	}


	public static void main (String[] args) {
		System.out.print("Nhap vao So phuc 1:");
		SoPhuc z4 = new SoPhuc();
		z4.input();
		z4.output();
		System.out.print("Nhap vao So phuc 2:");
		SoPhuc z5 = new SoPhuc();
		z5.input();
		z5.output();
		SoPhuc z3 = z4.addition(z5);
		z3.output();
		SoPhuc z6 = z4.subtraction(z5);
		z6.output();
		SoPhuc z7 = z4.multiplication(z5);
		z7.output();
		SoPhuc z8 = z4.division(z5);
		z8.output();
		
}
}
