package tuesday;

class employee{
	private int empid;
	private String empname;
	private String dept;
	
	public String getName()
	{
		return empname;
	}
	public int getid()
	{
		return empid;
	}
	public String getdept()
	{
		return dept;
	}
	public void setName(String name)
	{
		this.empname=name;
	}
	public void setempid(int id)
	{
		this.empid=id;
	}
	public void setdept(String de)
	{
		this.dept=de;
	}
}
public class Encapsusinggetset {
public static void main(String args[])
{
	employee obj=new employee();
	obj.setName("RAJ");
	obj.setempid(101);
	obj.setdept("iNTERN");
	
	System.out.println(obj.getName());
	System.out.println(obj.getid());
	System.out.println(obj.getdept());
	
}
}
