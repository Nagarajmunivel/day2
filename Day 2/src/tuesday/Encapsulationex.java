package tuesday;

class account{
	private int balance;
	private int accountno;
	private String name;
	public int  showbal() {
		
		return balance;

	}
	public int showacc(){
		return accountno;
	}
	public String showname(){
		return name;
	}
	
	public void setbal(int bal) {
		balance=bal;
	}
	public void setaccno(int acc) {
		accountno=acc;
	}
	public void setname(String nam)
	{
		name=nam;
	}
	
}
public class Encapsulationex {
	public static void main(String args[])
	{
		account obj=new account();
		obj.setbal(1000);
		obj.setname("pravin");
		obj.setaccno(12345678);
		
		System.out.println(obj.showbal());
		System.out.println(obj.showname());
		System.out.println(obj.showacc());
	}

}
