
public class Abstractclassbasic {
	public static void main(String args[])
	{
		
		Raj obj1=new Raj();
		obj1.speak();
		Advita obj2=new Advita();
		obj2.speak();
		obj1.whistle();
		obj2.whistle();
	}
	
}

abstract class Voice{
	public abstract void speak();
	public void whistle() 
		{
			System.out.println("Whistling");
		}
	
}

class Raj extends Voice{
	public void speak() 
	{
	System.out.println("Raj's voice");
	}
}

class Advita extends Voice{
	public void speak()
	{
	System.out.println("Advita's voice");
	}
}
