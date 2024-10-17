package practice;

import java.util.Scanner;

public class Vowelcount26 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String s=sc.next();
    s=s.toLowerCase();
    Vowelcount26 ob=new Vowelcount26();
    int count=ob.vowelcount(s);
    System.out.println("vowel count="+count);
    		

}
	public int vowelcount(String s)
	
	{
		int count=0;
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				count++;
		}
		 return count;
	}
	
}
