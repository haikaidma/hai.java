 package vidu;
	import java.util.Scanner;
	public class Ka {
		private int n;
		private int []a=new int[100];
		public Ka() {
			
		}
		public Ka(int n) {
			this.n=n;
		}
		public int getVidu() {
			return this.n;
		}
		public void setVidu(int n) {
			if(n<0)this.n=0;
			else this.n=n;
		}
		public void input() {
			Scanner kb=new Scanner(System.in);
			System.out.println("enter n: ");
			this.setVidu(kb.nextInt());
			System.out.println("nhap mang: ");
			for(int i=0;i<n;i++) {
				System.out.println("a["+i+"]");
				a[i]=kb.nextInt();
			}
		}
		public void output() {
			for(int i=0;i<n;i++) {
				System.out.println(a[i]+" ");
			}
		}
		public void main(String[] args) {
			Vidu v=new Vidu();
			v.input();
			v.output();
		}
	}

