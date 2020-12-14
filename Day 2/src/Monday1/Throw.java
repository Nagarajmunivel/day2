package Monday1;
import java.util.Scanner;;
public class Throw {
public static void main(String args[])
{
	
	int age;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your age");
	age=s.nextInt();
	if(age<18)
		throw new ArithmeticException("Your are not eligible");
	System.out.println("Your can access to this game");
	System.out.println("Your are playing this game");
}
}
