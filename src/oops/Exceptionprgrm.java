package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprgrm {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("E://book1.xlsx");
	
		
		//.......Arithematic exception....
		
		try {
		int a=34, b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
		System.out.println(e.getMessage());

	}
        System.out.println("hello");
	
	
	//.....nullpoint exception....
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		System.out.println("nullpointexception");
		System.out.println(e.getMessage());
	}


}
}