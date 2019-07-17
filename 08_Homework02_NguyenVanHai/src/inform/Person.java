package inform;

import java.util.Scanner;

public class Person {
	private String hovaten,sodienthoai1,quequan,noisinh,cmnd,dantoc,manhankhau,congviec;
	int trinhdo;
	private boolean gioitinh;
	private Address add = new Address();
	private Date dob = new Date();
	public 	Date getDob() {
		return this.dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public  Address getAddress() {
		return this.add;
	}
	public void setAddress(Address add) {
		this.add = add;
	}
	public int getTrinhdo() {
		return this.trinhdo;
	}
	public void setTrinhdo(int trinhdo) {
		this.trinhdo = trinhdo;
	}
	public String getCongviec() {
		return this.congviec;
	}
	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	public String getNoisinh() {
		return this.noisinh;
	}
	public void setNoisinh(String noisinh) {
		this.noisinh = noisinh;
	}
	public String getCmnd() {
		return this.cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getDantoc() {
		return this.dantoc;
	}
	public void setDantoc(String dantoc) {
		this.dantoc = dantoc;
	}
	public String getManhankhau() {
		return this.manhankhau;
	}
	public void setManhankhau(String manhankhau) {
		this.manhankhau = manhankhau;
	}
	public String getQuequan() {
		return this.quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getHovaten() {
		return this.hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public String getSodienthoai() {
		return this.sodienthoai1;
	}
	public void setSodienthoai(String sodienthoai1) {
		this.sodienthoai1 = sodienthoai1;
	}
	public Boolean getGioitinh() {
		return this.gioitinh;
	}
	public void setGioitinh(Boolean gioitinh) {
		
		this.gioitinh = gioitinh;
	}
	public   Person() {
		this.hovaten ="";
		this.sodienthoai1 ="";
		this.cmnd ="";
		this.manhankhau ="";
		this.noisinh ="";
		this.quequan ="";
		this.congviec ="";
		this.dantoc ="";
		
	}
	public   Person(String hovaten, String sodienthoai,String cmnd,String manhankhau,String noisinh,String quequan,String dantoc,String congviec,int trinhdo,Boolean gioitinh, Address add,Date dob) {
		setHovaten(hovaten);
		setSodienthoai(sodienthoai);
		setCmnd(cmnd);
		setCongviec(congviec);
		setDantoc(dantoc);
		setGioitinh(gioitinh);
		setManhankhau(manhankhau);
		setNoisinh(noisinh);
		setQuequan(quequan);
		setTrinhdo(trinhdo);
		setAddress(add);
		setDob(dob);
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("HovaTen: ");
		this.setHovaten(in.nextLine());
		System.out.print("Sodienthoai: ");
		this.setSodienthoai(in.nextLine());
		System.out.print("Gioitinh: ");
		this.setGioitinh(in.next().equals("Nam")? true : false);
		in.nextLine();
		System.out.print("SoCMND: ");
		this.setCmnd(in.nextLine());
		System.out.print("CongViec:");
		this.setCongviec(in.nextLine());
		System.out.print("DanToc:");
		this.setDantoc(in.nextLine());
		System.out.print("Manhankhau:");
		this.setManhankhau(in.nextLine());
		System.out.print("Noisinh:");
		this.setNoisinh(in.nextLine());
		System.out.print("Quequan:");
		this.setQuequan(in.nextLine());
		System.out.print("Trinhdo:");
		this.setTrinhdo(in.nextInt());
		in.nextLine();
		dob.input();
		add.input();
	}
	public String toString() {
		String s = this.getHovaten()+", "+this.getSodienthoai()+", "+this.getGioitinh()+", "+this.getCmnd()+", "+this.getCongviec()+", "+this.getDantoc()+" ,"+this.getNoisinh()+","
				+this.getManhankhau()+", "+this.getQuequan()+", "+this.getTrinhdo()+", "+dob.toString()+", "+add.toString();
		return s;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.input();
		person.toString();
	}

}
