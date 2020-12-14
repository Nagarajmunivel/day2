package Monday1;

public class Default {
public static void main(String args[])
{

	one();
	System.out.println("Hello from main");
}

public static void one()
{
	System.out.println("Hello");
	two();
	
}
public static void two()
{
	System.out.println(10/0);
}
}
