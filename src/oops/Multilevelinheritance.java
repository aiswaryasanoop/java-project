package oops;

class parent
{
	public void job()
	{
		System.out.println("job details");
	}
}
class child extends parent
{
	public void childdeatails()
	{
		System.out.println("child details");
	
	}
}
class grandchild extends child
{
	public void grandchilddetails()
	{
		System.out.println("grand child details");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
	grandchild ob=new grandchild();
	ob.grandchilddetails();
	ob.childdeatails();
	ob.job();
	

	}

}
