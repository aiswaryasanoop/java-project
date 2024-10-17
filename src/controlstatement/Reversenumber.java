package controlstatement;

public class Reversenumber {

	public static void main(String[] args) {
		 int i= 2768;
		 int rev=0, r;
		 {
		  while(i>0)//2768>0    276>0
		  {
			  r=i%10;//2768%10=8    276%10=6
			  rev=rev*10+r;//0=0+8=8  8=8*10+6= 86 
			  i=i/10;//2768/10=276    276/10=27
			  
		  }
		 
			System.out.println(rev);	
		 
		 }
	}

	}
