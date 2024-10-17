package controlstatement;

public class Paliandrom {

	public static void main(String[] args) {
		int n=132231, rev=0,r;
	int	temp=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}

			if(rev==temp)
			{
			System.out.println("paliandrom");
			}
			else
			{
				System.out.println("not palindrom");
			}
	}

}
