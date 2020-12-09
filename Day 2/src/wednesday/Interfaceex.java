package wednesday;

interface join{
	public void hasInternet();
	public void hasLaptop();
	void completeDegree();
	static void hasbike()
	{
		System.out.println("Bike is necessay now");
	}
}

public class Interfaceex implements join{
	public void hasInternet()
	{
		System.out.println("Internet speed should be 20");
	}
	public void hasLaptop()
	{
		System.out.println("Laptop should have 8gb of Ram");
	}
	public void completeDegree()
	{
		System.out.println("You should have complete BE or B tech");

	}
	public void hasbike()
	{
		System.out.println("I have bike");
	}
	public static void main(String args[])
	{
		Interfaceex obj = new Interfaceex();
		obj.hasInternet();
		obj.hasLaptop();
		obj.hasbike();
		obj.completeDegree();
	}

}
