package controlstatement;

public class Stringprgrm2 {

	public static void main(String[] args) {
		
		String s= "java is platform independentlanguage";
		String s1="jmeter is a performance testing tool";
		 if(s.contains("platform"))
		 {
			 System.out.println("contains platform");
		 }
		 else
		 {
			 System.out.println("not contain platform");
		 }
		 
		String []str=s1.split(" ");
		for(String v:str)
		{
			System.out.println(v);
		}
		

	}

}
