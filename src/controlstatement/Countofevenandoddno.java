package controlstatement;

public class Countofevenandoddno {

	public static void main(String[] args) {
		
		int i=1;
		int counteven=0;
		int countodd=0;
		for(i=1;i<=100;i++)
		{
			if(i%2==0) {
				counteven++;
		}
			else
			{
				countodd++;
			}	
			
		}
			System.out.println(counteven);
			
			System.out.println(countodd);

}
	}


