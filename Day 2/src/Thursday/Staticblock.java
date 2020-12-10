package Thursday;
import java.util.Scanner;
public class Staticblock {
	static int a;
static{
	a=10;
	System.out.println("Program started ststic block 1");
}
static {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	a++;
	System.out.println(a+" in static block 2");

	
}
public static void main(String args[])
{
	System.out.println(a+" in main function");
}

}
