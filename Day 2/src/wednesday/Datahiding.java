package wednesday;

class human{
	public String name;
	private int age;
	private int weight;
	
	public int getAge()
	{
		return age;
	}
	public int getWeight() {
		return weight;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
		
	}
}
public class Datahiding {
public static void main(String args[])
{
	human obj=new human();
	obj.setAge(20);
	obj.setWeight(50);
	obj.name="RAJ";

	System.out.println("Your age is "+obj.getAge());
	System.out.println("You weight is "+obj.getWeight());
}
}
