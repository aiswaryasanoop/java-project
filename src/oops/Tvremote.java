package oops;

interface Tvremotes
{
	public void power();
	public void volume();
	public void channel();
	
}
interface smarttvremote extends Tvremotes
{
	public void bluetooth();
	public void youtube();
}
class Tv implements smarttvremote
{

	@Override
	public void power() {
		System.out.println("power on and power off");
		
	}

	@Override
	public void volume() {
		System.out.println("volume up and volume down");
		
	}

	@Override
	public void channel() {
		System.out.println("select channels");
		
	}

	@Override
	public void bluetooth() {
		System.out.println("bluetooth facility");
		
	}

	@Override
	public void youtube() {
		System.out.println("youtube");
		
	}
}

public class Tvremote {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.power();
		ob.volume();
		ob.channel();
		ob.bluetooth();
		ob.youtube();
		

	}

}
