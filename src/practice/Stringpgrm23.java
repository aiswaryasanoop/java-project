package practice;

public class Stringpgrm23 {

	public static void main(String[] args) {
		String s="Java is platform indipendent language";
		String s1="jmeter is a performance tool";
		
		if(s.contains("platform"))
		{
			System.out.println("Text contain platform");
		}
		else
		{
			System.out.println("not contain platform");
		}
		  String str[]=s1.split(" ");
		for(String v:str)
		{
			System.out.println(v);
		}
	}

}
