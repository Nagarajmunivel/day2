package Wednesday1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serdemo1 {
public static void main(String args[])
{
	demo  obj=null;
	try {
		FileInputStream i=new FileInputStream("demo.sr");
		ObjectInputStream obji=new ObjectInputStream(i);
		obj=(demo)obji.readObject();
		obji.close();
		i.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Deserialization is Finished");
	System.out.println(obj.name);
	System.out.println(obj.rollno);
	System.out.println(obj.address);
	
}
}
