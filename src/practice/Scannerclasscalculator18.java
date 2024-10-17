package practice;

import java.util.Scanner;

public class Scannerclasscalculator18 {

	public static void main(String[] args) {
		int ch;
		do
		{
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		
		System.out.println("enter the value of a=");
		a=sc.nextInt();
		System.out.println("enter the value of b=");
		b=sc.nextInt();
		System.out.println("enter your choice");
		System.out.println("1.addition  2. subtraction  3. multiplication 4.division");
		ch=sc.nextInt();
	
		switch(ch)
		{
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
		while(ch<=4);
		{
			
		}
	
		
	}
}

