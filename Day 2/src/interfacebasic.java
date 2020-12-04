
public class interfacebasic implements pay{
	public void initialize() {
		System.out.println("Initializing");
	}
	public void processing() {
		System.out.println("Processing");
	}
	public void completion() {
		System.out.println("Completing");
	}
public static void main(String args[]) {
	interfacebasic obj1=new interfacebasic();
	obj1.initialize();
	obj1.processing();
	obj1.completion();
}
}
interface pay
{
	void initialize();
	void processing();
	void completion();
	
}