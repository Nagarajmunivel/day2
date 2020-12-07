package monday;

public class Methodoverloading {
public void add(int a,int b)
{
int c=a+b;
System.out.println(c);
}
public void add(int a)
{
	int b=a*a;
	System.out.println(b);
}
public void add(char a)
{
	System.out.println(a);
}
public void add(String a)
{
	System.out.println(a);
}

}
class abc1 extends Methodoverloading{
		
	public static void main(String args[])
	{
		abc1 obj1=new abc1();
		obj1.add(1);
		obj1.add(2, 3);
		obj1.add('c');
		obj1.add("RAj");
		
		
	}
}
