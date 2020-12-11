package friday;
class unboxing{
	void unboxing1 (Integer i)
	{
		int ia=i.intValue();
		System.out.println("This is int type Unboxing "+ia);
	}
	void unboxing1 (Double d)
	{
		double da=d.doubleValue();
		System.out.println("This is double type Unboxing "+da);
		
	}
	void unboxing1(Character c)
	{
		char ca=c.charValue();
		System.out.println("This is int type Unboxing "+ca);
		
	}
}
class boxing{
	Integer boxing1(int i)
	{
		Integer a=new Integer(i);
		System.out.println("This is a Integer class boxing "+a);
		return a;
	}
	Double boxing1(double d)
	{
		Double b=new Double(d);
		System.out.println("This is a Double class boxing "+b);
		return b;
	}
	Character boxing1(char c)
	{
		Character d=new Character(c);
		System.out.println("This is a Character boxing class "+d);
		return d;
	}
}
public class Wrapperclass1 {
public static void main(String args[])
{
	boxing objb=new boxing();
	Integer i1=objb.boxing1(20);
	Double d1=objb.boxing1(20.6578);
	Character c1=objb.boxing1('c');
	
	unboxing obju=new unboxing();
	obju.unboxing1(i1);
	obju.unboxing1(d1);
	obju.unboxing1(c1);
}
}
