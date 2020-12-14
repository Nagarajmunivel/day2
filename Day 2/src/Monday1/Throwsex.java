package Monday1;
import java.util.Scanner;;
public class Throwsex {
public static void one(int speed,int bit)throws ArithmeticException
	{
		System.out.println(speed/bit);
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Internet Speed and bit value");
	int speed=0,bit=0;
	speed=s.nextInt();
	bit=s.nextInt();
	try {
	one(speed,bit);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Hello from main");
	
}
}
