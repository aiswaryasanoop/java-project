package oops;

class Animal
{
	public void animalmethod()
	{
		System.out.println("enter animal details");
	}
}
class Tiger extends Animal
{
	public void tigermethod() {
		System.out.println("tiger details");
	}
}
class Lion extends Animal
{
	public void lionmethod()
	{
		System.out.println("lion details");
	}
}
public class Hierarchialinheritance {

	public static void main(String[] args) {
		Tiger ob=new Tiger();
		ob.tigermethod();
		ob.animalmethod();
		Lion ob1=new Lion();
		ob1.lionmethod();
		ob1.animalmethod();

		
	}

}

