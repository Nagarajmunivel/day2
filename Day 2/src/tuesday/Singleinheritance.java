package tuesday;

class blueprint{
	public int a=10;
	void room(){
		System.out.println("This is a room from the base class");
	}
}
class building1 extends blueprint{
	int a=20;
	void hall()
	{
		System.out.println("This is a HAll from the child class");
	}
}

public class Singleinheritance {
	public static void main(String args[])
	{
		building1 obj=new building1();
		obj.room();
		obj.hall();

	}

}
