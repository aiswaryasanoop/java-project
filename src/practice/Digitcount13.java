package practice;

public class Digitcount13 {

	public static void main(String[] args) {
		int a=123;
		int k=0;
		while(a>0) {
			a=a/10;
			k++;
		}
		System.out.println("digit count="+k);

	}

}
