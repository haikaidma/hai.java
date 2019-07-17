package string;

public class Stringcomparison {

	public static void main(String[] args) {
		//ex by equals() method
		String s1="duy tan";
		String s2="duy tan";
		String s3= new String("duy tan");
		String s4= "duy tan1";;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		//ex2
		String x1="sa chin";
		String x2="SA CHIN";
		System.out.println(x1.equals(x2));
		System.out.println(x1.equalsIgnoreCase(x2));
		// by == operator
		String a1="haikadima";
		String a2="haikadima";
		String a3=new String("haikadima");
		System.out.println(a1==a2);
		System.out.println(s1==s3);
		//by compareto() method
		String v1="deptrai";
		String v2= new String("deptrai");
		String v3="depgai";
		System.out.println(v1.compareTo(v2));
		System.out.println(v1.compareTo(v3));
		System.out.println(v3.compareTo(v1));


	}

}
