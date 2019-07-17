package p1;

public class B {
	
	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println(a.pub);
		System.out.println(a.pro);
		System.out.println(a.df);
		System.out.println(a.pri);// cann't access
	}

}