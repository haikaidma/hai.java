package string;

public class CommonlyUsesMethodOfSringClass {

	public static void main(String[] args) {
// ex of to upperCase() and to lower() method
		String s="Sachin";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
//ex of trim() method
		String s1="    Tangle    ";
		System.out.println(s1);
		System.out.println(s1.trim());
// ex startwith() and endswith() 
		System.out.println(s.startsWith("Sa"));
		System.out.println(s.endsWith("n"));
// charat()
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(4));
//length()
		System.out.println(s.length());
//intern() method
		String st1="hello java";
		String st2=new StringBuffer("hello").append(" java").toString();
		String st3=st2.intern();
		System.out.println("st1==st2 "+ (st1==st2));
		System.out.println("st1==st3 "+ (st1==st3));
	}

}
