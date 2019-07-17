package test;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//tao cac doi tuong co gia tri cu the rieng
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Something :");
		

		int a= kb.nextInt();
		double b = kb.nextDouble();
		String word = kb.next();
		String sentence = kb.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(word);
		
		System.out.println("Enter x");
		int x =kb.nextInt();
		kb.nextLine();
		
		System.out.println("Enter y");
		double y = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter sentence");
		String sentence1= kb.nextLine();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(sentence1);
		}

}