package pkg;

public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=20, b=30;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		System.out.println("---------assignment opeeator------");
		

		System.out.println("a+=b="+(a+=b));//20+30=50
		System.out.println("a-=b="+(a-=b));//50-30=20
		System.out.println("a*=b="+(a*=b));// 20*30=600

		int c=a;
		System.out.println(c);//600
		System.out.println("a/=b="+(a/=b));//600/30=20
		System.out.println("a%=b="+(a%=b));//20/30=20(reminder)
		System.out.println(c);
		
		System.out.println("---------relational opeeator------");
		
		int v1=10, v2=20;
		System.out.println(v1<v2);
		System.out.println(v1>v2);
		System.out.println(v1<=v2);
		System.out.println(v1>=v2);
		System.out.println(v1==v2);
		System.out.println(v1!=v2);
		
		System.out.println("---------logical operator------");
		
		String name="aiswarya";
		String password="aish123";
		System.out.println(name=="aiswarya"&& password=="aish123");
		System.out.println(name=="aiswarya"|| password=="aish123");
		System.out.println(name!="aiswarya");
		System.out.println(password!="aish123");
		
		System.out.println("---------unary operator------");
		
		int v3=7;
		System.out.println(v3++);//7
		System.out.println(v3);//8
		System.out.println(++v3);//9
		System.out.println(v3);//9
		System.out.println(v3--);//9
		System.out.println(v3);//8
		System.out.println(--v3);//7
		
		System.out.println("---------ternary operator------");
		String s= v1>v2? "v1 is greater":"v2 is greater";
		System.out.println(s);
		
		
	
		
		
		
				
		
		
		

	}

}
