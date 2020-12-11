package friday;
//Logical operator 
public class Operator3 {
public static void main(String args[])
{
	int a=10,b=9;
	
	String a1=Integer.toBinaryString(a);
	String b1=Integer.toBinaryString(b);
	System.out.println(a1 +" & "+b1+" = "+(a&b));
	
	System.out.println(a1 +" | "+b1+" = "+(a|b));
	
	System.out.println(a1+" "+(~a));
	
	System.out.println(a1 +" "+Integer.toBinaryString(a>>2)+" "+(a>>2));
	
	System.out.println(a1 +" "+Integer.toBinaryString(a<<2)+" "+(a<<2));
	if((5>6)&&(7>6))
	{
		System.out.println("Hello");
	}
	else if(5>6||7>6)
	{
		System.out.println("Hello World");
	}
}
}
