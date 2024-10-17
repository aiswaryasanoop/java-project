package controlstatement;

import java.util.Scanner;

public class Oddandeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int ar[]=new int[6];
		System.out.println("enter the digit");
		for(int i=0;i<6;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		for(int i=0;i<6;i++)
		{
			if (ar[i]%2==0)
			{
				System.out.println("even numbers="+ar[i]);
			}
			
			else
			{
				System.out.println("odd numbers="+ar[i]);
			}
		}
		
		

	}

}
