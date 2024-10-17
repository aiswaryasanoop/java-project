package oops;

abstract class Animal2
{
	abstract public void animalmethod();
	public void sleeping()
	{
		System.out.println("animal sleep");
	}
}
	class Cat extends Animal2
	{

		@Override
		public void animalmethod() {
			System.out.println("cat details");
			
		}
		
	}

public class Abstractpgrm {

	public static void main(String[] args) {
		 Cat ca=new Cat();
		 ca.animalmethod();
		 ca.sleeping();
		 
		 
		 

	}

}
