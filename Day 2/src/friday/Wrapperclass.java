package friday;
class Autoboxing {
	
	void print (Integer i)
	{
		System.out.println("This is type of Interger class "+i);
	}
}
class AutoUnboxing{
	int convert(Integer i)
	{
		int number=i.intValue();
		return number;
	}
}
public class Wrapperclass {
public static void main(String args[])
{
	Integer i =new Integer (20);
	
	Autoboxing o =new Autoboxing();
	o.print(i);
	
	AutoUnboxing a=new AutoUnboxing();
	int num=a.convert(i);
	System.out.println("This is primitive type of int "+num);
}
}
