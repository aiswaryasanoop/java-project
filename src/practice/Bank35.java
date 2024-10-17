package practice;

import java.util.Scanner;

interface Bank
{
	public void accountdetailas();
	public void balance();
	public void Deposit();
	public void withdraw();
	
}
class sbi implements Bank


{
	 Scanner sc=new Scanner(System.in);
	 String name;
	int accountno;
	int balance=10000;
	int newbalance = 0;
	int deposit;
	int withdraw;

	@Override
	public void accountdetailas() {
		
		System.out.println("name=");
		sc.next();
		System.out.println("accountno=");
		sc.nextInt();
		
	}

	@Override
	public void balance() {
		
		System.out.println("available balance="+balance);
		
	}

	@Override
	public void Deposit() {
		System.out.println("enter amount to be deposit=");
		deposit = sc.nextInt();
		newbalance = balance+deposit;
		System.out.println("new balance after deposit="+newbalance);
	}

	@Override
	public void withdraw() {
		System.out.println("enter amount to withdraw=");
		withdraw=sc.nextInt();
		if(withdraw>newbalance)
		{
			System.out.println("insufficent fund");
		}
		else
		{
			System.out.println("account balance after withdrawal="+(newbalance-withdraw));
		}
		
		
	}
	
	
}

public class Bank35 {

	public static void main(String[] args) {
		int ch;
		
	Scanner bb=new Scanner(System.in);
	System.out.println(".........Welcome to SBI......");
	sbi ob=new sbi();
	ob.accountdetailas();
do
	{
	System.out.println("1.balance enquiry   2.deposit  3.withraw");
	System.out.println("enter your choice");
	ch=bb.nextInt();
	
	
	switch(ch)
	{
	case 1:ob.balance();
	break;
	
	case 2:ob.Deposit();
	break;
	
	case 3:ob.withdraw();
	break;
	default:System.out.println("invalid choice");
	}
	
		
	}
	while(ch>0 && ch<3);
}
}