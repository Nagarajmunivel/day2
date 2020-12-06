package Vararg;

public class Constructorchaining {
public Constructorchaining()
	{
		this(100);
	}
public Constructorchaining(int x)
{
	
	this(100,200);
}
public Constructorchaining(int x,int y)
{
	System.out.print(x+" "+y);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorchaining obj=new Constructorchaining();
	}

}
