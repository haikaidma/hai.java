package test1;
import java.util.Scanner;
public class Testa {
	public static void main(String[] args) {
	Scanner kb1 = new Scanner(System.in);
	System.out.println("enter String");
	String s=kb1.nextLine();
	System.out.println(s);
	Scanner kb2 = new Scanner(s);
	String sNew="";
	while(kb2.hasNext()==true) {
		sNew=kb2.next()+" "+sNew;
	}
	/*while (kb2.hasNext()==true) {
		if(kb2.hasNextInt()==true)
			sInt =sInt+kb2.nextInt();
		else
			if(kb2.hasNextDouble()==true)
				sDouble+=kb2.nextDouble();
			else kb2.next();
	}
	System.out.println(sInt);
	System.out.println(sDouble);*/
	System.out.println(sNew);
	String st="nguyen van hai";
	int index=st.lastIndexOf(" ");
	System.out.println(index);
	
	String lastName=st.substring(index+1);
	String fullname=st.substring(0, index);
	System.out.println(lastName);
	System.out.println(fullname);

}
	}