package controlstatement;

import java.util.Scanner;

public class Greatestnumberinarray {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a=sc.nextInt();
		System.out.println("enter numbers");
       int []ar=new int[a];
     
	for(int i=0;i<a;i++)
	{
		ar[i]=sc.nextInt();
		
	}
     int max=0;
     for(int i=0;i<a;i++)
     {
     if( ar[i]>max)
     {
    	 max=ar[i];
    	 
     }
     else
     {
    	 max=max;
     }
}
	System.out.println("maximum value="+max);
	

	}
}