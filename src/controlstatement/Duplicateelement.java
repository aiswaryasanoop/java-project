package controlstatement;

import java.util.Scanner;

public class Duplicateelement {

	public static void main(String[] args) {
		int ar []=new int[6];
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the no");
		for(int i=0;i<6;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<6;i++)
		{
		
			for(int j=i+1;j<6;j++)
			{
				if(ar[i]==ar[j])
				{
					
					System.out.println("duplicate elements="+ar[j]);
				}
				
				
			}
		}
		
		
				
				

	}

}
