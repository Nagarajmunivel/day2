package friday;

public class IncrementDecrement {
public static void main(String args[])
{
	
	int a=10;
	int c=++a;
	int d=a++;
	System.out.println(" Pre increment "+c+" Post increment " +d+" Final value is "+a);
	int e=40;
	int g=e--;
	int h=--e;
	System.out.println(" Pre Decrement "+h+" Post ecrement " +g+" Final value is "+e);
	int x=a+++e;
	System.out.println(x);
	
}
}
