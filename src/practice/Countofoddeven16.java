package practice;

public class Countofoddeven16 {

	public static void main(String[] args) {
	int countodd=0,counteven=0;
	for(int i=1;i<=10;i++)
	{
		if((i%2)==0)
		{
			counteven++;
		}
		else
		{
			countodd++;
		}
		
	}
	    System.out.println("count of odd="+countodd);
        System.out.println("count of even="+counteven);
	}

}
