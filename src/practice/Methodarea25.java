package practice;

public class Methodarea25 {

	public static void main(String[] args) {
		Methodarea25 ob=new Methodarea25();
		ob.circle();
		ob.triangle(4,7);
		int ra=ob.rectangle(6,3);
		System.out.println("rectangle area="+ra);
		int sa=ob.square();
		System.out.println("square area="+sa);
				

	}
//...........without parameter and without returntype......
	
	public void circle()
	{
		int r=4;
		double ca=3.14*r*r;
		System.out.println("circle area="+ca);
	}
	//...........with parameter and without return type.........
	
	public void triangle(int b,int h)
	{
		double ta=0.5*b*h;
		System.out.println("triangle are="+ta);
	}
	//.............With parameter and with returntype.........
	
	public int rectangle(int l,int b)
	{
		int ra=l*b;
		return ra;
		
	}
	
	//..............without parameter and with return type...........
	
	public int square()
	{
		int a=6;
		int sa=a*a;
		return sa;
	}
	
}
