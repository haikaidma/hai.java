package p2;

import p1.A;

public class E extends A{

	public static void main(String[] args) {
		E a = new E();
		System.out.println(a.pub);
		System.out.println(a.pro);
		System.out.println(a.df);// cann't access
		System.out.println(a.pri);// cann't access
	}

}