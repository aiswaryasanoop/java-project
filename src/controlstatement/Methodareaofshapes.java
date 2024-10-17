package controlstatement;

public class Methodareaofshapes {

	public static void main(String[] args) {
		Methodareaofshapes ob=new Methodareaofshapes();
        ob.circle();
        ob.triangle(3, 5);
        int sq=ob.square(4);
        System.out.println("area of square="+sq);
        int rec=ob.rectangle();
        System.out.println("area of rectangle="+rec);
	}
	// withot parameter and without returntyp
	
	public void circle()
	{
		int r=4;
		double cir=3.14*r*r;
		System.out.println("area of circle="+cir);
	}
	
	//with parameter and without return type
	
	public void triangle(int b,int h)
	{
		double tri=0.5*b*h;
		System.out.println("area of triangle="+tri);
	}
	
	//with parameter and with returntype
	
	public int square(int a)
	{
		int sq=a*a;
		return sq;
	}
	//without parameter with returntype
	public int rectangle() 
	{
	int l=10,b=5;
	int rec= l*b;
	return rec;
	}

}
