package shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
public class ArrayOfShape {
	private int n;
	private Shape []a =new Shape[100];
	public ArrayOfShape()
	{
		
	}
	public ArrayOfShape(int n) {
		this.n=n;
	}
	public int getN() {
		return this.n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter n: ");
		this.setN(kb.nextInt());
		for(int i=0;i<n;i++) {
			System.out.println("no."+(i+1));
			System.out.println("1-circle/2-triangle/3-rectangle/4-square/5-Cyclinder");
			int choose =kb.nextInt();
			if (choose == 1)
				a[i] = new Circle();
			else if (choose == 2)
				a[i] = new Rectangle();
			else if (choose == 3)
				a[i] = new Triangle();
			else if(choose == 4)
				a[i] = new Square();
			else if(choose == 5)
				a[i] = new Cylinder();
			a[i].input();
		}
	}
	public void readFile() throws FileNotFoundException {
		Scanner kb = new Scanner(new File("src/shape/input.txt"));
		while (kb.hasNextLine()) {
			String str = kb.next();
			if(str.compareTo("rectangle") == 0)
			{
				Shape s = new Rectangle(kb.nextDouble(),kb.nextDouble());
				a[n] = s;
				n++;
			}
			else if(str.compareTo("circle") == 0)
			{
				Shape s = new Circle(kb.nextDouble());
				a[n] = s;
				n++;
			}
			else if(str.compareTo("triangle") == 0)
			{
				Shape s = new Triangle(kb.nextDouble(),kb.nextDouble(),kb.nextDouble());
				a[n] = s;
				n++;
			}
			else if(str.compareTo("square") == 0)
			{
				Shape s = new Square(kb.nextDouble());
				a[n] = s;
				n++;
			}
			else if(str.compareTo("cylinder") == 0)
			{
				Shape s = new Cylinder(kb.nextDouble(),kb.nextDouble());
				a[n] = s;
				n++;
			}
			
		}
	}
	public void sortArea()
	{
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n - 1 ; j++)
			{
				if(a[i].area() > a[j].area())
				{
					Shape t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
	}
	public void write() throws FileNotFoundException
	{
		PrintStream p = new PrintStream(new File("src/shape/sort.txt"));
		for(int i = 0 ; i < n ; i++)
		{
			if(a[i] instanceof Triangle)
		{
			p.append(" triangle : "+a[i].area()+"\n");
		}
			else 
				if(a[i] instanceof Square)
				{
					p.append(" square : "+a[i].area()+"\n");
				}
				else 
					if(a[i] instanceof Cylinder)
					{
						p.append(" cylinder : "+a[i].area()+"\n");
					}
						else 
							if(a[i] instanceof Circle)
							{
								p.append(" circle : "+a[i].area()+"\n");
							}
							else 
								if(a[i] instanceof Rectangle)
								{
									p.append(" rectangle : "+a[i].area()+"\n");
								}
								else 
									if(a[i] instanceof Square)
									{
										p.append("Square  : "+a[i].area()+"\n");
									}
			}
		}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].output();
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		ArrayOfShape a=new ArrayOfShape();
		a.readFile();
		a.output();
		a.sortArea();
		a.write();
	}

}
