package Thursday;
class one1{
	public int change(int x)
	{
		return (x+=10);
	}
}
public class Passbyref2 {
public static void main(String args[])
{
	int a=10;
	System.out.println("Values before passing "+a);
	one1 obj=new one1();
	a=obj.change(a);
	System.out.println("Value after changes "+a);
}
}
