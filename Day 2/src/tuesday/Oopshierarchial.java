package tuesday;

class parent1
{
	void car()
	{
		System.out.println("Hello from parent");
	}
}
class child1 extends parent1{
	void lorry()
	{
		System.out.println("Hello from child1");
	}
}
class child2 extends parent1{
	void auto()
	{
		System.out.println("Hello from child2");
	}
}

public class Oopshierarchial {
public static void main(String args[])
{
	child1 obj1=new child1();
	child2 obj=new child2();
	
	obj.car();
	obj1.lorry();
	obj.auto();
}
}
