package fraction;
import java.util.Scanner;
public class ArrayOfFraction {
	private int n;
	private Fraction []a=new Fraction[100];
	public void setN(int nn) {
	if(nn<0) n=0;
	else n=nn;
	}
	public int getN() {
		return n;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter n:");
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter element"+i+":");
			//khoi tao va nhap fraction
			Fraction f=new Fraction();
			f.Input();
			a[i]=f;
		}
	}
	public void output() {
		for(int i=0;i<n;i++)
			a[i].Output();
			System.out.println();
		
	}
	public void MaxFraction() {
		double max=1.0*a[0].getNumerator()/a[0].getDenominator();
		int vt=0;
		for(int i=1;i<n;i++) {
			if(max<(1.0*a[i].getNumerator())/a[i].getDenominator()){
			max=(1.0*a[i].getNumerator())/a[i].getDenominator();
			vt=i;
		}}
		System.out.println("max:"+max);
		a[vt].Output();

	}
	public void sumMaxfraction2() {
		int vt=0,vt1=1;
		double sumMax=1.0*a[0].getNumerator()/a[0].getDenominator();
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				Fraction f3=a[i].plus(a[j]);
				if(sumMax<1.0*f3.getNumerator()/f3.getDenominator()) {
					sumMax=1.0*f3.getNumerator()/f3.getDenominator();
					vt=i;
					vt1=j;
				}
			}
		}
		System.out.println("sum max 2:");
		a[vt].Output();
		a[vt1].Output();
		a[vt].plus(a[vt1]).Output();
	}
	public void sortFraction() {
		for(int i=0;i<this.n-1;i++) {
			for(int j=i+1;j<this.n;j++) {
				if(a[i].getNumerator()/a[i].getDenominator()>a[j].getNumerator()/a[j].getDenominator()) {
					Fraction T=a[i];
					a[i]=a[j];
					a[j]=T;
				}
			}
		}
		System.out.println();
	}
	public Fraction sum() {
		Fraction sum1=a[0];
		for(int i=1;i<this.n;i++) {
			sum1 = sum1.plus(a[i]);
		}
		return sum1;
	}
	public void remove(int index) {
		for(int i=index;i<this.n-1;i++) {
			a[i]=a[i+1];
		}
		n--;
	}
	public void insert(Fraction f,int index) {
		for(int i=this.n;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=f;
		this.n++;
	}
	public int KiemTra(int n) {
		int dem=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				dem++;}
		if(dem==2)
			return 1;
		else return 0;}
	public void PrintNumeElement() {
		for(int i=0;i<this.n-1;i++) {
			if(KiemTra(a[i].getNumerator())==1)
				System.out.print(+a[i].getNumerator()+"/"+a[i].getDenominator() +"  ");
		}
	}
	public void removeDenoEven() {
		for(int i=0;i<this.n-1;i++) {
			if(a[i].getDenominator()%2==0)
				a[i]=a[i+1];
		}
		n--;
		
	}
	public static void main(String[] args)	{
		ArrayOfFraction arr=new ArrayOfFraction();
		arr.input();
		arr.output();
		arr.MaxFraction();
		arr.sumMaxfraction2();
		arr.sortFraction();
		arr.output();
		System.out.println("sum:");
		arr.sum().Output();
		System.out.println("");
		arr.remove(3);
		arr.output();
		arr.insert(new Fraction(2,3),2);
		arr.output();
		arr.PrintNumeElement();
		arr.removeDenoEven();
		arr.output();
	}

}	
