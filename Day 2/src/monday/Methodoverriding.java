package monday;

public class Methodoverriding {
public void show()
{
	System.out.println("From Methodoverriding");
}
}
class Methodoverriding1 extends Methodoverriding{
	public void show()
	{
		System.out.println("From Methodoverriding one");
	}
}
class Methodoverriding2 extends Methodoverriding1{
	public void show()
	{
		System.out.println("From Methodoverriding two");
	}
}
class Methodmain extends Methodoverriding2{
	public static void main (String args[])
	{
		Methodoverriding obj1=new Methodoverriding();
		obj1.show();
		obj1=new Methodoverriding1();
		obj1.show();
		Methodoverriding1 obj2=new Methodoverriding2();
		obj2.show();
		
	}
}