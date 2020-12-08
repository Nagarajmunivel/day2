package tuesday;

public class upcasting {

void m1()
{
	System.out.println("From parent class m1 function");
}
void m2()
{
	System.out.println("From parent m2 function");
}
}
class Upcasting2 extends upcasting{

	void m1()
	{
		System.out.println("From child class m1 function");
	}
	void m3()
	{
		System.out.println("From Child m3 function");
	}
}
class Upmain{
	public static void main(String args[])
	{
		upcasting nobj=new upcasting();
		Upcasting2 nobj2=new Upcasting2();
		
		upcasting uobj=new Upcasting2();
		uobj.m1();
		uobj.m2();
		
		Upcasting2 dobj= (Upcasting2)uobj;
		dobj.m1();
		dobj.m2();
		dobj.m3();
		
		nobj.m1();
		

	}
}