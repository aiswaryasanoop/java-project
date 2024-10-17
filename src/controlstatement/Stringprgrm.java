package controlstatement;

public class Stringprgrm {

	public static void main(String[] args) {
		
		//concat
		
		String s= "hello welcome to luminar";
		String s1= "welcome";
		String s2= "          Hello";
		System.out.println(s.concat(s1));
		System.out.println(3+2+s1+5+6);// 5welcome56
		
		//equal
		
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		// contains
		
		System.out.println(s.contains("welcome"));
		
		//toLowercase and toUppercase
		
		System.out.println(s.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//startswith and endswith
		
		System.out.println(s.startsWith("hello"));
        System.out.println(s.endsWith("luminar"));
        
        //trim
        
        System.out.println(s2.trim());
        
        //length
        
        System.out.println(s1.length());
        
        //charAt
        
        System.out.println(s.charAt(6));
        
        //substring
        
        System.out.println(s.substring(1,4));
        
        //replace
        
        System.out.println(s.replace("hello", "hai"));
        
        //split
        
        String[] str= s.split(" ");
        for (String v:str)
        	System.out.println(v);
        
        //tochararray
        
        char[] ch=s1.toCharArray();
        for( char v1:ch)
        	System.out.println(v1);
	}

	
}
