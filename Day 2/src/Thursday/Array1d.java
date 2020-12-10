package Thursday;
import java.util.Scanner;
class print{
	print(char arrc[],String arrs[],int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" "+arrc[i]+" "+arrs[i]);
	}
}
public class Array1d {
public static void main(String args[])
{
	int arr[]=new int[5];
	char[] arrc;
	arrc=new char[5];
	String arrs[]=new String[5];
	System.out.println("Enter Initial Name Rollno");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		arrc[i]=s.next().charAt(0);
		arrs[i]=s.next();
		arr[i]=s.nextInt();
	}
	print p =new print(arrc,arrs,arr);
	
}
}
