package controlstatement;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		System.out.println("enter String");
		Scanner sc=new Scanner (System.in);		
		String s;
		String st="";
		int n;
		s= sc.nextLine();
        n= s.length();
   for(int i=(n-1); i>=0; i--)
   {
	   st =st + s.charAt(i);
   }
	   System.out.println(st);
   
       if(s.equals(st))
       {
    	   System.out.println("palindrom");
       }
       else
       {
    	   System.out.println("not palindrom");
       }
	}
}