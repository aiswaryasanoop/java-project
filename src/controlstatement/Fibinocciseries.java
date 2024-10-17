package controlstatement;

import java.util.Scanner;

public class Fibinocciseries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter limit");
	   int n= sc.nextInt();
	   
	 int a=0,b=1,c;
	   System.out.print(+a+" "+b+" ");
	  for(int i=1; i<(n-2); i++)
	  {
		c=a+b;
		
		a=b;
		b=c;
		System.out.print(c+" ");
	  }
	
	

	}

}

