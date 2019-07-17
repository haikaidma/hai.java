package option_pane;

import java.util.Scanner;

public class LinearEquation 
{

	//khai bao bien
		protected double b, c;
		
		//goi ham khoi tao khong doi so
		public   LinearEquation()
		{
			b=4;
			c=2;
		}
		
		//goi ham khoi tao co doi so
		public   LinearEquation(double b, double c) 
		{
			setB(b);
			setC(c);
		}
		
		public double GetB() {
			return b;
		}
		
		public double GetC() {
			return c;
		}
		
		public void setB(double b) { 
			this.b=b;
		}
		
		public void setC(double c) { 
			this.c=c;
		}
		public void input() {
			Scanner kb=new Scanner(System.in);
			System.out.println("Enter b:");
			this.b=kb.nextDouble();
			System.out.println("Enter c:");
			this.c=kb.nextDouble();
		}
		//cai dat phuong thuc
		public String solve()
		{
			String s="";
			if(b == 0) 
				if(c==0)
					s="Unlimited roots";
				else
					s="no root";
			else
				s=" x = "+ (-c/b);
			return s;
		}
		public void f(int a,int b) {
			System.out.println(a-b);
		}
		public void f1(int a,int b,int c) {
			System.out.println(a-b-c);
		}

		public static void main(String[] args) 
		{
			LinearEquation l=new LinearEquation();

		}

	}