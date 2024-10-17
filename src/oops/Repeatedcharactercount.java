package oops;

import java.util.Scanner;

public class Repeatedcharactercount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count;
		System.out.println("enter the string");
		String s=sc.next();
	  char[]ch=s.toCharArray();
	  for (char v:ch)
	    
	  for(int i=0;i<s.length();i++) 
	  {
		  count=1;
		for(int j=i+1;j<s.length();j++)
		{
			if(ch[i]==ch[j])
			{
				count++;
				ch[j]='0';
			}
			
		}
		if(count>1 && ch[i]!='0')
		{
			System.out.println("repeating character="+ch[i]);
			System.out.println("count="+count);
		}
	  }
	

	}

}
