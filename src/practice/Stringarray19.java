package practice;

import java.util.Scanner;

public class Stringarray19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
	
		System.out.println("enter the size of array=");
		int a=sc.nextInt();
		String ar[]=new String[a];
		System.out.println("enter string");
	  
	    for(int i=0; i<a;i++)
	    {
	      ar[i]=sc.next();
	    }
	    
		System.out.println("entered string=");
		for(int i=0;i<a;i++)
		{
			System.out.println(ar[i]);
			
		}
		
	}

}
