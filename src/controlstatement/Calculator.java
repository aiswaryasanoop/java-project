package controlstatement;

public class Calculator {

	public static void main(String[] args) {
		
		int a=10, b=2;
		int ch;
		//System.out.println("1.addition 2.subtraction 3.multiplication 4.division");
		ch=5;
		switch(ch)
		{
		case 1: System.out.println("a+b="+(a+b));
		break;
		case 2: System.out.println("a-b="+(a-b));
		break;
		case 3: System.out.println("a*b="+(a*b));
		break;
		case 4: System.out.println("a/b="+(a/b));
		break;
		default : System.out.println("invalid choice");
		
		}

	}

}
