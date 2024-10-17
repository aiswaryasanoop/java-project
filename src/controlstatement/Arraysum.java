package controlstatement;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int []ar=new int[4];
		 System.out.println("enter numbers");
		 int s=0;
		 for(int i=0;i<4;i++)
		 {
		 ar[i]= sc.nextInt();
		
		 s=s+ar[i];
		 
		 }
		 System.out.println("sum="+s);

	}

}
