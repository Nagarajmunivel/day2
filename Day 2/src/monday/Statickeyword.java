package monday;

public class Statickeyword {
	static String clg="velammal";
	static {
		System.out.println("this is a static block");
	}
public	static void print() {
		System.out.println(clg);
		System.out.println("this is a static method");
	}

static class abc{
	public void my1(){
		System.out.println("Static classs");
	}
}
public static void main(String args[])
{
	print();
	Extending obj=new Extending();
	obj.show();
	abc abc1=new abc();
	abc1.my1();
	
}
}
class Extending extends Statickeyword{
	void show()
	{
		Statickeyword.print();
	}
}