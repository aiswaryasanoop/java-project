package practice;

import java.util.Scanner;

public class Charactercount {

	public static void main(String[] args) {
		int count=0;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.next();
		for(int i=0;i<s.length();i++ )
		{
			count++;
		}
		System.out.println("character count="+count);
				
		

	}

}
