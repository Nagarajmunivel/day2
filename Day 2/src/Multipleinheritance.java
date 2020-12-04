
public class Multipleinheritance implements voice2,speak {
public void soft() {
	System.out.println("Hello");
}
	public static void main(String args[])
	{
		Multipleinheritance obj1=new Multipleinheritance();
		obj1.soft();
		voice2 obj2=new Multipleinheritance();
		obj2.soft();
		speak obj3=new Multipleinheritance();
		obj3.soft();
	}

}
interface voice2{

	void soft();

}
interface speak{
	
	void soft();
}