package controlstatement;

import java.util.Scanner;

public class Calculatorscannerclass {

	public static void main(String[] args) {
		int choice;
		do
		{
		System.out.println("enter two numbers");
		Scanner cal=new Scanner(System.in);
		int a= cal.nextInt();
		int b= cal.nextInt();
		System.out.println("1.addition 2.subtraction 3.multiplication 4.division");
		System.out.println("enter a choice");
		 choice= cal.nextInt();
		
	
	
		switch(choice)
		{
		case 1:System.out.println("a+b="+(a+b));
		break;
		case 2:System.out.println("a-b="+(a-b));
		break;
		case 3:System.out.println("a*b="+(a*b));
		break;
		case 4:System.out.println("a/b="+(a/b));
		break;
        default:System.out.println("invalid choice");
		}
		}
	
		while(choice>0&&choice<=4);
		
	
	
	}

}