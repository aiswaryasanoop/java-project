package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add(20, 40);
		ob.add(32, 10, 12);
		ob.add(3.5, 34);
		ob.add(23, 43.9);
				

	}

	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	public void add(int a,int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public void add(double a, int b)
	{
		double c= a+b;
		System.out.println(c);
	}
	public void add(int a, double b)
	{
		double c= a+b;
		System.out.println(c);
	}
}
