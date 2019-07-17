package inform;

import java.util.Scanner;

public class Address {
	private String sonha, duong, quan, thanhpho;
	public String getSonha() {
		return this.sonha;
	}
	public void setSonha(String sonha) {
		this.sonha = sonha;
	}
	public String getDuong() {
		return this.duong;
	}
	public void setDuong(String duong) {
		this.duong = duong;
	}
	public String getQuan() {
		return this.quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public String getThanhpho() {
		return this.thanhpho;
	}
	public void setThanhpho(String thanhpho) {
		this.thanhpho = thanhpho;
	}
	public     Address() {
		this.sonha = "";
		this.duong = "";
		this.quan = "";
		this.thanhpho = "";
	}
	public     Address(String sonha, String duong, String quan, String thanhpho) {
		setSonha(sonha);
		setDuong(duong);
		setQuan(quan);
		setThanhpho(thanhpho);
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("\t\t Sonha:");
		this.setSonha(in.nextLine());
		System.out.print("\t\t Duong:");
		this.setDuong(in.nextLine());
		System.out.print("\t\t Quan");
		this.setQuan(in.nextLine());
		System.out.print("\t\ts ThanhPho:");
		this.setThanhpho(in.nextLine());
	}
	public String toString() {
		String string =this.getSonha()+", "+this.getDuong()+", "+this.getQuan()+", "+this.getThanhpho();
		return string;
	}
	public static void main(String[] args) {
		Address address = new Address();
		address.input();
		address.toString();
	}
}
