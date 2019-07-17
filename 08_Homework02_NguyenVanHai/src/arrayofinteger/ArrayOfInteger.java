package arrayofinteger;
import java.util.*;
public class ArrayOfInteger {
	private int n;
	private int []a =new int [100];
	public ArrayOfInteger(){
		
	}
	public ArrayOfInteger(int n) {
		this.n=n;
	}
	public int getArrayOfInteger() {
		return this.n;
	}
	public void setArrayOfInteger(int n) {
		if(n<0)this.n=0;
		else this.n=n;
	}
	
	public void input() {
		Scanner h=new Scanner(System.in);
		System.out.println("Nhap chieu dai cua mang : ");
		this.setArrayOfInteger(h.nextInt());
		System.out.println("nhap mang: ");
		for(int i=0;i<n;i++) {
			System.out.print("Enter a["+i+"] : ");
			a[i] =h.nextInt();
		}
	}
	public void output() {
		System.out.println("xuat mang:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	public void PrintEven() {
		for (int i=0;i<n;i++) {
			if(a[i]%2==0)
				System.out.println("so chan:"+a[i]);}
	}
	public void Oddavg() {
		int dem=0;
		double s=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				s=s+a[i];
				dem++;
			}	
		}
		if(dem==0) {
			System.out.println("ko co so le");
		}
		System.out.println("tbc so le:"+s/dem);
	}
	public int max() {
		int max=a[0];
		for(int i=1;i<n;i++) {
			if(max<a[i]) 
				max = a[i];
		}
		return max;
	}
	public int SumMax1() {
		int summax=a[0]+a[1],vt=0;
		for(int i=1;i<n-1;i++) {
			if(summax<a[i]+a[i+1]) 
				summax=a[i]+a[i+1];
		}
		return summax;
	} 
	public int SumMax2() {
		int max = a[0],min = a[0], p = 0;
		for(int i=1;i<n;i++) {
			if(max < a[i]) 
			{
				max = a[i];
				p = i;
			}
				
			if(min > a[i])
				min = a[i];
		}
		int second = min;
		for(int i = 0 ; i < n ; i++)
		{
			if(second < a[i] && i != p)
				second = a[i];
		}
		return max+second;
	}
	public int KiemTra(int n) {
		int dem=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				dem++;}
		if(dem==2)
			return 1;
		else return 0;
	}
	public void PrintPrime() {
		for(int i=1;i<=n;i++) {
			if(KiemTra(a[i])==1)
				System.out.println("so nguyen to:"+a[i]);
		}
	}
	public void sort() {
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(a[j]<a[j-1]){
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;}
	} 
			} 
		}
	public void Remove(int index) {
		for(int i=index-1;i<n;i++){
			a[i]=a[i+1];
		}
		n--;
	}
	public void insert(int x,int index) {
		for(int i=n;i>index;i--) {
			a[i]=a[i-1];
			a[index]=x;
		}
		n++;
	}
	public static void main(String[] args) {
		ArrayOfInteger a =new ArrayOfInteger();
		a.input();
		a.output();
		a.PrintEven();
		a.Oddavg();
		System.out.println("max :"+a.max());
		System.out.println("summax1 :"+a.SumMax1());
		System.out.println("summax2:"+a.SumMax2());
		a.PrintPrime();
		a.sort();
		a.output();
		a.insert(3, 2);
		a.output();
		a.Remove(3);
		a.output();
	}
}
