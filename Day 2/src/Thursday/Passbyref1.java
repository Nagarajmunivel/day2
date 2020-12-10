package Thursday;

class one{
	void change(int arr[])
	{
		arr[0]+=10;
	}
}
public class Passbyref1 {
public static void main(String args[])
{
	int arr[]= {0};
	one o =new one();
	System.out.println("Values before passing "+arr[0]);
	o.change(arr);
	System.out.println("Values After passing "+arr[0]);
}
}
