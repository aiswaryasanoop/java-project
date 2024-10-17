package practice;

class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	
	public void printdetails()
	{
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("address="+address);
	System.out.println("phoneno="+phoneno);
	System.out.println("salary="+salary);
	}
}
class Employee extends Member
{
	
	String specialization;
}

class Manager extends Member
{
	String department;
	
}
public class Member33 {

	public static void main(String[] args) {
		Employee emp= new Employee();
        emp.name="sanoop";
        emp.age=30;
        emp.address="asdfghj";
        emp.phoneno=1234567;
        emp.salary=9876;
        emp.printdetails();
        Manager man=new Manager();
        man.name="asdf";
        man.age=45;
        man.address="qwerty";
        man.phoneno=9876543;
        man.salary=678889;
        man.printdetails();
        man.department="hr";
        System.out.println("department="+man.department);
        
	

	}

}
