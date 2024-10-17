package practice;

public class Calculator6 {

	public static void main(String[] args) {
		int a=10,b=2,ch=4;
		switch(ch){
		case 1: System.out.println("addition="+(a+b));
		break;
		case 2: System.out.println("subtraction="+(a-b));
		break;
		case 3: System.out.println("multiplication="+(a*b));
		break;
		case 4: System.out.println("division="+(a/b));
		break;
		default: System.out.println("invalid choice");
		
		}

	}

}
