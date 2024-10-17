package practice;

import java.util.Scanner;

public class Countofpositivenegative21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("enter the size=");
		int n=sc.nextInt();
		
		int pcount=0,ncount=0,zcount=0;
		System.out.println("enter the numbers");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
				ar[i]=sc.nextInt();
		   if(ar[i]<0)
		   {
			   ncount++;
		   }
        
		 
         if(ar[i]>0)
         {
        	 pcount++;
         }
        
         
         if(ar[i]==0) {
        	 zcount++;
         }
         
		}
		 System.out.println("negative count="+ncount);
		 System.out.println("positive count="+pcount);
		 System.out.println("zero count="+zcount);
	}    
	

}
