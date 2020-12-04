
public class Multiinheritancewithdefault implements Voice4,Voice3 {
	public void soft1() {
		Voice4.super.soft1();
		Voice3.super.soft1();
	}
	public static void main(String args[])
	{
		Multiinheritancewithdefault obj1 =new Multiinheritancewithdefault();
		obj1.soft1();
	
	}
}
interface Voice4{
	default void soft1() {
		System.out.println("From voice1");
	}
}
interface Voice3{
	default void soft1() {
		System.out.println("from voice 2");
	}
}