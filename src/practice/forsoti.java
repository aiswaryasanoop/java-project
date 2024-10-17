package practice;

public class forsoti {
	
	public static void main(String[] args) {
		int a=1234;
		int b;
		int rev=0;
		while(a>0)
		{
			b=a%10;
			a=a/10;
			rev=rev*10+b;
		}
		
		System.out.println(rev);
 
	}

}
