package controlstatement;

import java.util.Scanner;

public class Vowelcountusingmethod {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
	    String s;
		System.out.println("enter the string");
		s =sc.next();
        Vowelcountusingmethod ob=new Vowelcountusingmethod();
        int count=ob.vowelcount(s);
        s=s.toLowerCase();
        System.out.println("count="+count);
        
	}
	public int vowelcount(String s)
	{
	int count=0;
	
	for(int i=0;i<=s.length()-1;i++)	
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			count++;
		}
		
	}
	return count;
     
	}

}
