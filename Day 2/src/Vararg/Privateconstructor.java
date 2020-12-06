package Vararg;

public class Privateconstructor {

	private Privateconstructor() {
		System.out.println("Hello form private constructor");
	}
	public void add()
	{
		System.out.println("Hello from add method");
	
		
		
	}
	public static void main(String args[])
	{
		Privateconstructor obj1=new Privateconstructor();
		
		//obj1.add();
	}
}
