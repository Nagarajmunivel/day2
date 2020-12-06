package Vararg;

public class Varargbasic {
	void add(int a,int...b)
	{
		int sum=0;
		System.out.println("integer element is "+ a);
		System.out.print("variable argument sum are ");
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
			if(i==b.length-1)
				System.out.print(b[i]);
			else
				System.out.print(b[i] +"+" );
		
		}
		System.out.println( "="+sum);
	}
	
public static void main(String args[])
{
	Varargbasic obj=new Varargbasic();
	obj.add(10,20,30,40);
}
}
