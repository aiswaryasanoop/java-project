package oops;

class Member
{
	String name;
	int age;
	int phoneno;
	String address;
	int salary;
	public void printdetails()
	{
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		
	}
}
class Employee1 extends Member
{
	String specialization;
	
}
class Manager extends Member
{
	String department;
	
	}

public class Inheritanceprgrm {

	public static void main(String[] args) {
    
     Employee1 emp=new Employee1();
     emp.name="arya";
     emp.age=20;
     emp.phoneno=45677288;
     emp.address="ghaystyu";
     emp.salary=25000;
     emp.printdetails();
     System.out.println(emp.specialization="developer");
     Manager man=new Manager();
     man.name="anu";
     man.age=40;
     man.phoneno=2345679;
     man.address="agyygyh";
     man.salary=50000;
     man.printdetails();
     System.out.println(man.department="IT");
   
     
	}

}
