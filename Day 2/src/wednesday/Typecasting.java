package wednesday;
class Demo{
	
	void upConvert(int i)
	{
		long l1=i;
		float f1=i;
		double d1=i;
		System.out.println(i+" Integer is upcasted into " );
		System.out.println("long " + l1);
		System.out.println("float " + f1);
		System.out.println("double " + d1);
	}
	static void downConvert(int i)
	{
		byte b1=(byte)i;
		short s1=(short)i;
		char c1=(char)i;
		System.out.println(i+" Integer is downcasted into " );
		System.out.println("byte " + b1);
		System.out.println("short " + s1);
		System.out.println("char " + c1);
		
	}
	
}

public class Typecasting {
public static void main(String args[])
{
	Demo obj =new Demo();
	obj.upConvert(42365255);
	Demo.downConvert(24555);
	System.out.println((int)50.99 );

}
	
}

