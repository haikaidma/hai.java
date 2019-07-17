package p1;

public class C extends A{

	public static void main(String[] args) {
		C a = new C();
		System.out.println(a.pub);
		System.out.println(a.pro);
		System.out.println(a.df);
		System.out.println(a.pri);//cann't access
	}
}