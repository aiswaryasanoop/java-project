package practice;

public class Reversenum15 {

	public static void main(String[] args) {
		int a=1324,rev=0;
		
		while(a>0)
		{
			int r=a%10;
			a=a/10;
			rev=rev*10+r;
					
		}
System.out.println("rev="+rev);
	}

}