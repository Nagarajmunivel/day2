package tuesday;
class blueprint1{
	int a=10;
	void room(){
		System.out.println("This is a room from Base class");
	}
}
class building2 extends blueprint{
	void hall() {
		System.out.println("This is a room from child one class");
	}
}
class building3 extends building2{
	void reception() {
		System.out.println("This is a room from child two class");
	}
}
class OopsMultilevel {
	public static void main(String args[])
	{
		building3 obj=new building3();
		
		obj.room();
		obj.hall();
		obj.reception();
		
	}
}
