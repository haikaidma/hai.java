package polynomal;
import java.util.Scanner;

public class Polynomal {
	private double coefficent;
	private int exponlntial;
	public double getCoefficent() {
		return coefficent;
	}
	public void setCoefficent(double c){
		this.coefficent =c;
	}
	public int getExponlntial() {
		return exponlntial;
	}
	public void setExponlntial(int e){
		if(e<0) this.exponlntial=0;
		else this.exponlntial =e;
	}
	public Polynomal() {
		
	}
	public Polynomal(double c,int e) {
		setExponlntial(e);
		setCoefficent(c);
	}
	public void input() {
		Scanner kb= new Scanner(System.in);
		System.out.println("enter coefficent: ");
		double c=kb.nextDouble();
		setCoefficent(c);
		System.out.println("enter exponlntial: ");
		int e=kb.nextInt();
		setExponlntial(e);
	}
	public void output(double x) {
		System.out.println("f("+x+")="+this.f(x));
		System.out.println("f'("+x+")="+this.ff(x));
	}
	public double f(double x) {
		return this.coefficent*Math.pow(x,this.exponlntial);
	}
	public double ff(double x) {
		return this.exponlntial*this.coefficent*Math.pow(x,this.exponlntial-1);
	}
	public static void main(String[] args) {
		Polynomal p1=new Polynomal();
		p1.input();
		p1.output(2); 
	}

}
