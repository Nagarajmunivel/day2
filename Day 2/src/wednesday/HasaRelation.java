package wednesday;



class name{
	String fname;
	String mname;
	String lname;
	void setName(String fname,String mname,String lname)
	{
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
	}
	boolean m1()
	{
		return true;
	}
}
class employee{
	name n;
	int age;
	void show (int age,name n)
	{
		System.out.println("This is the name "+n.fname +" "+n.mname +" "+n.lname);
		System.out.println("This is the age "+age);
	}
					  }
class intern{
	name n;
	int age;
	void show (int age,name n)
	{
		System.out.println("This is the name "+n.fname +" "+n.mname +" "+n.lname);
		System.out.println("This is the age "+age);
		
		
		System.out.println(n.m1());			
	}
	
}

	

public class HasaRelation {
	
public static void main(String args[])
{
	name n=new name();
	n.setName("COOL","PAD","USER");
	employee obj =new employee();
	obj.show(8,n);
	
	name n1=new name();
	n1.setName("Zee","Marcos","1");
	intern obj1=new intern();
	obj1.show(50,n1);
	
}
}
