package practice;

import java.util.Scanner;

public class Palindrom24 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	
	System.out.println("enter the string");
	String s=sc.next();
	int n=s.length();
	String st="";
	for(int i=(n-1);i>=0;i--)
	{
		st=st+s.charAt(i);
	}
   System.out.println("reverse="+st);
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
