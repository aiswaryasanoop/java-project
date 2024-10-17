package controlstatement;

public class Methodpgrm {

	public static void main(String[] args) {
		Methodpgrm ob=new Methodpgrm();
		ob.add();
		ob.sub(30,20);
	    int m= ob.mul(3,4);
	    System.out.println("mul="+m);
	    double d=ob.div();
		System.out.println("div="+d);

		

	}
	//method without parameter and without returntype
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println("add="+c);
	}
	
	//method with parameter and without returntype
	
	public void sub(int a,int b)
	{
		int s= a-b;
		System.out.println("sub="+s);
	}
	//method with parameter and with return type
	
	public int mul(int a,int b)
	{
		int m= a*b;
		return m;
	}
	
	// method without parameter and with returntype
	
	
		public double div()
		{
			int a=10,b=2;
		double d= a/b;
		return d;
	}

}
