package Thursday;

class ref1{
	void change(int x,int y)
	{
		x++;
		y++;
	}
}
public class Passbyvalue {
public static void main(String args[])
{
	int a=10;
	int b=20;
	System.out.println("Before Updation A value is "+a+" and b is "+b);
	ref1 obj=new ref1();
	obj.change(a, b);
	System.out.println("After Updation A value is "+a+" and b is "+b);
}
}
