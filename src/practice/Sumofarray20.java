package practice;

import java.util.Scanner;

public class Sumofarray20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a=sc.nextInt();
		System.out.println("enter the nos");
		int ar[]=new int[a];
		int sum=0;
        for(int i=0;i<a;i++)
        {
        	ar[i]=sc.nextInt();
        	sum=sum+ar[i]; 
         }
        	
         System.out.println("sum of array="+sum);
		

	}

}
