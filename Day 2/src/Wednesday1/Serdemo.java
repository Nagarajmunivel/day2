package Wednesday1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class demo implements java.io.Serializable {
	public String name;
	public int rollno;
	public String address;
}

class Serdemo{
	
	public static void main(String args[])
	{	
		demo objs=new demo();
		objs.name="Raj";
		objs.rollno=1;
		objs.address="Sarveshwara Nagar";
		try 
		{
			FileOutputStream o=new FileOutputStream("demo.sr");
			ObjectOutputStream obj=new ObjectOutputStream(o);
			obj.writeObject(objs);
			obj.close();
			o.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Serialization is finished");
}
}
