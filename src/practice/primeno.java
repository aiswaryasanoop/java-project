package practice;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a no:");
		int a=sc.nextInt();
		boolean isPrime = true;
		if(a==0 || a==1)
		{
			System.out.println("not prime");
		}
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				//System.out.println("not prime");
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println("The given number is prime number");
		}
		else
		{
			System.out.println("The given number is not prime number");
		}
				
		
		}	
		
	}


