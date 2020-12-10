package Thursday;

class on{
	String name;
	int dob;
	public void setdata(String a,int b){
		name=a;
		dob=b;
	}
	void show()
	{
		System.out.println(name+" "+dob);
	}
}
public class Arraypofobjects {
public static void main(String args[])
{
	on arr[]=new on[3];
	for(int i=0;i<3;i++)
	{
		arr[i]=new on();
	}
	arr[0].setdata("Raj",1);
	arr[1].setdata("Breezy",2);
	arr[2].setdata("zeemarcos",3);
	for(int i=0;i<3;i++)
	{
		arr[i].show();
	}
	System.out.println(arr[0]);
	System.out.println(arr[1]);
}
}
