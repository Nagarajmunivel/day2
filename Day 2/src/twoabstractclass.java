
public class twoabstractclass {
public static void main(String atgs[])
{
	Mood2 obj1=new Mood2();
	obj1.softvoice();
	obj1.normalvoice();
	obj1.harshvoice();
}
}

abstract class Voice5 {
	void harshvoice()
	{
		System.out.println("Speaking Harshly");
	}
	abstract void normalvoice();
	abstract void softvoice();
}

abstract class Mood1 extends Voice5{
	void normalvoice()
	{
		System.out.println("Speaking Normally");
	}
}

class Mood2 extends Mood1{
	void softvoice()
	{
		System.out.println("Speaking Softlyy");
	}
}