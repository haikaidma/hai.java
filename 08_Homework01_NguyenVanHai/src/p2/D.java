package p2;

import p1.A;

public class D {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.pub);
		System.out.println(a.pro);// cann't access
		System.out.println(a.df);// cann't access
		System.out.println(a.pri);// cann't access
	}

}