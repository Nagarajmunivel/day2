package Thursday;
class one11{
	int a;
	int b;
	one11(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void change1(one11 f)
	{
		f.a+=500;
		f.b+=500;
	}
}

public class Passbyref3 {
	public static void change(one11 f)
	{
		f.a+=100;
		f.b+=200;
	}
public static void main(String args[] )
{
	
	one11 obj1=new one11(100,200);
	System.out.println("The values before passing "+obj1.a+" "+obj1.b);
	change(obj1);
	
	System.out.println("The values After passing "+obj1.a+" "+obj1.b);
	obj1.change1(obj1);
	System.out.println("The values After passing in other class "+obj1.a+" "+obj1.b);
}
}
