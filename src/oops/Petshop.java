package oops;

import java.util.Scanner;

interface Pet
{
	public void breed();
	public void number();
	public void price();
	public void quantity();
	public void colour();
}
class Cats implements Pet
{
   Scanner sc=new Scanner(System.in);
   String breed;
   int number=5;
   int price=5000;
   int quantity;
   String colour;
	@Override
	public void breed() {
		System.out.println("breed=persian, Russian blue");
		System.out.println("enter required breed=");
		String breed=sc.next();

	}

	@Override
	public void number() {
		System.out.println("available number="+number);
		
	}

	@Override
	public void quantity() {
		System.out.println("enter required quantity=");
        int quantity=sc.nextInt();
        
		if(quantity>number)
		{
			System.out.println("out of stock");
		}
		else
		{
			System.out.println("total price="+(quantity*price));
		}
	}
	
	@Override
	public void price() {
		System.out.println("price="+price);
		
	}

	@Override
	public void colour() {
		System.out.println("available colour= gray,black,white");
		System.out.println("enter required colour=");
		String colour=sc.next();
	}
}
class Dog implements Pet
{
	Scanner dg=new Scanner(System.in);
	String breed="German shepherd,Golden retriver";
	   int number=8;
	   int price=10000;
       int quantity;
       String colour;
	@Override
	public void breed() {
		System.out.println("breed=shepherd,Golden retriver");
		System.out.println("enter required breed=");
		String breed=dg.next();
		
	}

	@Override
	public void number() {
		System.out.println("number="+number);
	
				
	}


	@Override
	public void quantity() {
		System.out.println("enter required quantity=");
		int quantity=dg.nextInt();
		
		if(quantity>number)
		{
			System.out.println("out of stock");
		}
		else
		{
			System.out.println("total price="+(quantity*price));
		}
	}
	@Override
	public void price() {
		
		System.out.println("price="+price);
		
	}

	@Override
	public void colour() {
		System.out.println("available colour= gray,black,brown");
		System.out.println("enter required colour=");
		String colour=dg.next();
		
	}
	
}
public class Petshop {

	public static void main(String[] args) {
		Cats ob=new Cats();
		Dog ch=new Dog();
		
		
		int choice;
		String breed;
	    int b;
		Scanner s=new Scanner (System.in);
		System.out.println("enter your choice");
		System.out.println("1.cats  2.dog ");
		choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
        ob.breed();
        ob.colour();
		ob.number();
		ob.price();
		ob.quantity();
		break;
		case 2:System.out.println("Dog");
		ch.breed();
		ch.colour();
		ch.number();
		ch.price();
		ch.quantity();
		break;
		default:System.out.println("invalid choice");
		}
		}
		

	

}
