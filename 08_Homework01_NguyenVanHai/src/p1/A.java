package p1;

public class A {
	String df = "Default";
	private  String pri = "Private";
	public String pub = "Public";
	protected String pro = "Protected";
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.df);
		System.out.println(a.pri);
		System.out.println(a.pro);
		System.out.println(a.pub);
	}
}
