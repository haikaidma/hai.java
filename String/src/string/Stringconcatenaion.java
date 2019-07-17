package string;

public class Stringconcatenaion {

	public static void main(String[] args) {
		//by operator
		String s= "hai"+"kadima";
		System.out.println(s);
		//by operator cont
		String s1=50+30+"haikadima"+14+13;
		System.out.println(s1);
		//by concat method
		String s2="haikadima";
		String s3="14032000";
		String s4=s2.concat(s3);
		System.out.println(s4);
	}

}
