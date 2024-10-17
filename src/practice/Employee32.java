package practice;

public class Employee32 {
	String empname;
	int empid;
	
	public Employee32(String empname,int empid)
	{
		this.empname=empname;
		this.empid=empid;
	}

	public static void main(String[] args) {
	Employee32 ob=new Employee32("achu",101);
	System.out.println("empid="+ob.empid);
	System.out.println("empmane="+ob.empname);
	

	}

}
