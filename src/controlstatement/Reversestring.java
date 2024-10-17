package controlstatement;

public class Reversestring {

	public static void main(String[] args) {
		
		String s="Testing training center";
		String str[]=s.split(" ");
		for	(int i= str.length-1;i>=0;i--)
		{
			
			System.out.print(str[i]+" ");
				
		}
		System.out.println();
		String s1=" hello world";
		System.out.println(s1.replace("hello", "hi"));
	}

}
