package Vararg;

public class Varargoverloading {
void add(int a,char b,String...c) {
	System.out.println(a);
	System.out.println(b);
	System.out.println("The following are the received string");
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
}
void add(int a)
{
	System.out.println("in I "+a);
	
}
void add(int a,int...b)
{
	System.out.println("in II "+a);
	System.out.println(b);
	
}
	

public static void main(String args[])
{
	Varargoverloading obj1=new Varargoverloading();
	obj1.add(1, 'a',"Raj" ,"breezy","coolpad");
	obj1.add(2);
}
}
