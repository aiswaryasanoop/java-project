package controlstatement;

import java.util.Scanner;

public class Reversestring2 {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		s=sc.next();
		String rev="";
		for( int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
        System.out.println("reverse string="+rev);
	}

}
