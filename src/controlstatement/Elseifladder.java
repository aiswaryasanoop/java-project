package controlstatement;

public class Elseifladder {

	public static void main(String[] args) {
     
		int a=20,b=90,c=50;
		
		if(a>b && a>c)
		{
		System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
		System.out.println("c is greater");
		}
	}

}
