package pkg;

public class Swap {

	public static void main(String[] args) {
		// swaping with variable
		
		int a=10, b=20,temp;
        System.out.println("before swapping value of a="+a + "value of b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping value of a="+a + "value of b="+b);
        
        
        // swapping without variable
        
        System.out.println("before swapping value of a="+a + "value of b="+b);
        a=a+b;//30
        b=b-a;//10
        a=a-b;//30-10=20
        System.out.println("after swapping value of a="+a + "value of b="+b);
        
        
        
		 
		 

	}

}
