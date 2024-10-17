package practice;

public class Reversestring27 {

	public static void main(String[] args) {
		String rev="";
		String s="testing training center";
		String ar[]=s.split(" ");
		for(int i=2;i>=0;i--)
		{
			 rev=rev+" "+ar[i];
		}
        System.out.println("reverse string="+rev);
	}

}
