package controlstatement;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
  
    System.out.println("enter the size");
    int a=Sc.nextInt();
    System.out.println("enter string");
    
    String[] st=new String[a];
     for(int i=0;i<a;i++)
     {
    		st[i]=Sc.nextLine();
     }
     /*System.out.println("entered string");
     for(int i=0;i<a;i++)
     {
    	 System.out.println(st[i]);
     }*/
     for(String v:st)
     {
    	 System.out.println(v);
     }

	}

}
