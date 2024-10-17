package controlstatement;

import java.util.Scanner;

public class Countofpstvenegtvezeros {

	public static void main(String[] args) {
		
	int p=0,n=0,z=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size");
		int a= sc.nextInt();
		
		System.out.println("enter numbers");
		int[]ar=new int[a];
		for(int i=0;i<a;i++) 
		{
		ar[i]=sc.nextInt();
		
   if(ar[i]==0)
   {
	   z++;
	   
   }
   else if(ar[i]<0)
	   {
	n++;
	
	   }
	   else
	   {
	   p++;	
	   
		}
		}
		System.out.println("count of zero="+z);
		System.out.println("count of negative="+n);
		System.out.println("count of positive="+p);

}
				

	}
	

