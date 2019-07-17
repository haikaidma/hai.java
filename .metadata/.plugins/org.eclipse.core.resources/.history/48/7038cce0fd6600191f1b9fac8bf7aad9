package candidate;
import java.util.Scanner;
public class Address {
	//khai bao thuoc tinh
	private String number;
	private String street;
	private String district;
	private String city;
	
	//cai dat cac phuong thuc
	//ham khoi tao ko doi so
	public Address() {
		this.number="";
		this.street="";
		this.district="";
		this.city="";
		
	}

	public Address(String number, String street, String district, String city)	{
		this.number=number;
		this.street=street;
		this.district=district;
		this.city=city;
		/*setNumber(n);
		setStreet(s);
		setDistrict(d);
		setCity(c);*/
	}
	public String getNumber() {
		return this.number;
	}
	public String getStreet() {
		return this.street;
	}
	public String getDistrict() {
		return this.district;
	}
	public String getCity() {
		return this.city;
	}
	public void setNumber(String n) {
		this.number=n;
	}
	public void setStreet(String s) {
		this.street=s;
	}
	public void setDistrict(String d) {
		this.district=d;
	}
	public void setCity(String c) {
		this.city=c;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter house's number :");
		this.setNumber(kb.nextLine());
		System.out.println("Enter street :");
		this.setStreet(kb.nextLine());
		System.out.println("Enter district :");
		this.setDistrict(kb.nextLine());
		System.out.println("Enter city :");
		this.setCity(kb.nextLine());
	}
	public void output() {
		System.out.println("Address is:"  + this.number + "/" +this.street + "/" +this.district + "/" +this.city);
	}
	public static void main(String[] args) {
		// Tao nen caac doi tuong co gia tri cu the rieng
		Address A=new Address();
		A.input();
		A.output();
		
		Address B=new Address("187","nguyen cong hoan","lien chieu","da nang");
		B.output();
		
		String number="130";
		String street="nguyen luong bang";
		String district="lien chieu";
		String city="da nang";
		Address add=new Address(number, street,district,city);
		add.output();
				
		A=add;
		System.out.println(A);
		A.output();
		
	}

}