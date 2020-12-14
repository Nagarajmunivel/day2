package Monday1;

public class Tryex {
	public static void main(String args[])
	{
		try {
				one();
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		finally {
			System.out.println("Hello from finally");	
		}
		
	}

	public static void one()
	{
		System.out.println("Hello from one");
		two();
	}
	public static void two()
	{ 
	 
		System.out.println(10/0);
		System.out.println("Hello");
		
	
	}
}
