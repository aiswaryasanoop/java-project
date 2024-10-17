package oops;

class Father
{
	public void phone()
	{
		System.out.println("samsung");
	}
}
class Son extends Father
{

	@Override
	public void phone() {
	System.out.println("Iphone");
		super.phone();
	}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
	
		Son s=new Son();
		s.phone();
		

	}

}
