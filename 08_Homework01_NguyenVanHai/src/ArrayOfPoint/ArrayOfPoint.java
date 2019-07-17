package ArrayOfPoint;
import java.util.Scanner;

import point.Point;
public class ArrayOfPoint {
	private int n,x,y;
	private Point []a =new Point [100];
public ArrayOfPoint(){
		
	}
	public ArrayOfPoint(int n) {
		this.n=n;
	}
	public int getArrayOfPoint() {
		return this.n;
	}
	public void setArrayOfPoint(int n) {
		if(n<0)this.n=0;
		else this.n=n;
	}
	public void input() {
		Scanner h=new Scanner(System.in);
		System.out.println("Nhap chieu dai cua mang : ");
		this.setArrayOfPoint(h.nextInt());
		for(int i=0;i<this.n;i++) {
		System.out.println("enter point:"+i+":");
			Point p =new Point();
			p.input1();
			this.a[i]=p;
	}
		}
	public void OutPut() {
		System.out.println("xuat mang:");
		for(int i=0;i<n;i++) {
			System.out.print("point"+i);
			a[i].output1();
		}
		}
	public void Max() {
		int vt=0,vt1=1;
		double max=a[0].distance(a[1]);
		for (int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(max<a[i].distance(a[j])) {
					max=a[i].distance(a[j]);
				vt=i;
				vt1=j;
			}
		}
		a[vt].output1();
		a[vt1].output1();
		System.out.print(max);
	}
		}
	public void Perimeter1() {
		int vt=0,vt1=1,vt2=2;
		double max=a[0].perimeter(a[1],a[2]);
		for (int i=0;i<n-2;i++) {
			for (int j=i+1;j<n-1;j++) {
				for (int k=j+1;k<n-1;k++) {
					if(max<a[i].perimeter(a[j], a[k])) {
						max=a[i].perimeter(a[j], a[k]);
						vt=i;
						vt1=j;
						vt2=k;
					}
				}
			}
		}
		a[vt].output1();
		a[vt1].output1();
		a[vt2].output1();
		System.out.print(max);
	}
	public static void main(String[] args) {
		ArrayOfPoint arr=new ArrayOfPoint();
		arr.input();
		arr.OutPut();
		arr.Max();
		arr.Perimeter1();
	}

}
