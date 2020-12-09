package wednesday;

abstract class Vehicle{
	abstract void tyre();
	abstract void streeing();
	abstract void engine();
	void ac() {
		System.out.println("Having ac is optional");
	}
	void sunroof() {
		System.out.println("Having Sunroof is also optional");
	}
	
}
class Bike extends Vehicle
{
	void tyre()
	{
		System.out.println("two tyres");
	}
	void streeing()
	{
		System.out.println("Flat steering");
	}
	void engine()
	{
		System.out.println("Two Stoke engine");
	}
}
class Truck extends Vehicle{
	void tyre()
	{
		System.out.println("ten tyres");
	}
	void streeing()
	{
		System.out.println("round steering");
	}
	void engine()
	{
		System.out.println("four Stoke engine");
	}
	void ac()
	{
		System.out.println("Ac in on in driver cabin");
	}
}

class Abstractclass {
public static void main(String args[])
{
	Bike b=new Bike();
	b.tyre();
	b.streeing();
	b.ac();
	
	Truck t=new Truck();
	t.tyre();
	t.streeing();
	t.ac();
}
 
}
