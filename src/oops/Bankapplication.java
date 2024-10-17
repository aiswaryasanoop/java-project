package oops;

import java.util.Scanner;

interface Bank
{
	public void Accountdetails();
	public void Balance();
	public void Deposit();
	public void withdraw();
	
}
class Sbi implements Bank
{
	Scanner sc= new Scanner(System.in);
	int balance=7000;
	int deposit;
	int withdraw;
	
	
	@Override
	public void Accountdetails() {
		
		System.out.println("name=");
		String name=sc.next();
		System.out.println("Account number=");
		long Accountno=sc.nextLong();
		System.out.println("ifsc=");
		String ifsc=sc.next();
	}

	@Override
	public void Balance() {
		System.out.println("balance="+balance);
		
	}

	@Override
	public void Deposit() {
		System.out.println("deposit=");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("new balance after deposit="+balance);
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw=");
		int withdraw=sc.nextInt();
		if(balance<withdraw)
		{
			System.out.println("insufficent balance");
		}
		else
		{
			balance=balance-withdraw;
			System.out.println("new balance after deposit="+balance);
		}
	}
	
}

public class Bankapplication {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		/*ob.Accountdetails();
		ob.Balance();
		ob.Deposit();
		ob.withdraw();*/
		
		int choice;
		Scanner ch=new Scanner (System.in);
		System.out.println("1.Account details  2.balance  3.deposit  4.withdraw");
		System.out.println("enter your choice");
		choice=ch.nextInt();
		
		switch(choice)
		{
			case 1:ob.Accountdetails(); 
			break;
			case 2: ob.Balance();
			break;
			case 3: ob.Deposit();
			break;
			case 4: ob.withdraw();
			break;
			default: System.out.println("invalid choice");
			
		}

	}

}
