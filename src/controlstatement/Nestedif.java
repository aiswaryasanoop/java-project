package controlstatement;

public class Nestedif {

	public static void main(String[] args) {
		int age= 17, weight=49;
		
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("can donate blood");
			}
			else
			{
				System.out.println("cannot donate blood weight less than 50");
				
			}
		}
			else
			{
				System.out.println("cannot donate blood age less than 18");
			}
		}
			
			

	}


