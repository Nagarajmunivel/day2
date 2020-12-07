package monday;

public class Variables {
static int a=10;
int inst=20;
public static void main(String args[])
{
	int local=30;
	System.out.println(a);
	Variables obj1=new Variables();
	System.out.println(obj1.inst);
	System.out.println(local);
	Variables1 obj2=new Variables1();
	obj2.show();
	obj1.inst=50;
}
}
class Variables1{
	static int a=20;
	Variables obj3=new Variables();
	Variables obj5=new Variables();
	
	
	
	void show()
	{
		obj5.inst=4000;
		System.out.println("from another class inst "+obj3.inst);
		System.out.println("from another class inst using other obj "+obj5.inst);
		System.out.println(a);
		System.out.println("from another class static using class name "+Variables.a);
		System.out.println("from another class static using object "+obj3.a);
	}
	
}