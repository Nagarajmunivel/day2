package Vararg;

public class Constructorpara {
	public static void main(String args[])
	{
	Constructordemo1 obj=new Constructordemo1(1);
	}
}
class Constructordemo1
{
	Constructordemo1(int x)
	{
		System.out.println("In 1st constructor "+x);
	}
	Constructordemo1(int x,int b)
	{
		System.out.println("In 2st constructor "+ x +" "+ b);
	}
}