package oops;

interface Car
{
	public void Accileration();
	public void enginespeed();
}
interface Carworkshop
{
	public void workshopdetails();
	
}
class Maruti implements Car
{

	@Override
	public void Accileration() {
	System.out.println("maruti Acceleration");
		
	}

	@Override
	public void enginespeed() {
	System.out.println("maruti engine speed");
		
	}
	
}

class Kia implements Car,Carworkshop
{

	@Override
	public void workshopdetails() {
		System.out.println("workshop dtails");
		
	}

	@Override
	public void Accileration() {
		System.out.println("kia acceleration");
		
	}

	@Override
	public void enginespeed() {
		System.out.println("kia engine speed");
		
	}
	
}

public class Interfaceprgrm {

	public static void main(String[] args) {
		Maruti ob=new Maruti();
		ob.Accileration();
		ob.enginespeed();
		Kia ob1= new Kia();
		ob1.Accileration();
		ob1.enginespeed();
		ob1.workshopdetails();
		
		//object reference for interface
		/*Car ob=new Maruti();
		ob.Accileration();
		ob.enginespeed();
		ob=new Kia();
		ob.Accileration();
		ob.enginespeed();*/
		
		
		
		

	}

}
