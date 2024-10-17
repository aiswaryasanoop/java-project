package practice;

public class Blooddonation4 {

	public static void main(String[] args) {
		int age=26,weight=45;
		if(age>18)
		{
			if(weight>50) {
				System.out.println("eligible for blood donation");
			}
			else
			{
				System.out.println("not eligible due to under weight");
			}
			
		}
		else
		{
			System.out.println("not elegible due to age");
		}
	}

}
