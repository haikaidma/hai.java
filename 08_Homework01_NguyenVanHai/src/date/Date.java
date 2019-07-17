package date;

public class Date {
	private int day,month,year;
	//ham khoi tao k doi so
	public Date() {
		day=1;
		month=1;
		year=1900;
	}
	//ham khoi tao doi so
	public Date(int d,int m,int y) {
		setYear(y);
		setMonth(m);
		setDay(d);
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int getDay() {
		return day;
	}
	public void setMonth(int m) {
		if(m<=0||m>12)month=1;
		else month=m;
	}
	public void setYear(int y) {
		if(y<=0||y>5000)year=1900;
		else year=y;
	}
	public void setDay(int d) {
		if(d<=0||d>numberOfDay())
			day=1;
		else day=d;
	}
	public int numberOfDay() {
		if(month==1||month==3||month==5||month==9||month==11)
		{
			return 31;
		}
		else {
			if(month==4||month==6||month==10||month==12)
			{
				return 30;
			}
			else {
				if(year%4==0&&year%100!=0||year%400==0) 
				{
					return 29;
				}
				else
				{
					return 28;
				}
			}
			}
		}
	public void nextDay() {
		if(day==numberOfDay())
			if(month==12)System.out.println("1/1"+(++year));
			else System.out.println("1/"+(++month)+"/"+year);
		else System.out.println((++day)+"/"+month+"/"+year);
	}
	public static void main(String[] args) {
		Date n1=new Date();
		n1.setYear(2017);
		n1.setMonth(2);
		n1.setDay(30);
		n1.nextDay();

		Date n2=new Date();
		n2.setYear(2016);
		n2.setMonth(2);
		n2.setDay(29);
		n2.nextDay();
		
		Date n3=new Date();
		n3.setYear(2017);
		n3.setMonth(12);
		n3.setDay(31);
		n3.nextDay();
		
		Date n4=new Date();
		n4.setYear(2016);
		n4.setMonth(2);
		n4.setDay(28);
		n4.nextDay();
		Date n5=new Date();
		System.out.println(+n5.getDay()+"/"+n5.getMonth()+"/"+n5.getYear());
		Date n6=new Date(14,3,2000);
		System.out.println(+n6.getDay()+"/"+n6.getMonth()+"/"+n6.getYear());
		
	}

}
 