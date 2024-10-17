package controlstatement;

import java.util.Scanner;

public class Singledimentionalarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int []ar=new int[4];
		for(int i=0;i<4;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("entered numbers=");
		
		 for(int i=0;i<4;i++)
			 System.out.println(ar[i]);
		

	}

}
