package Thursday;
import java.util.Scanner;
public class Array2d {
public void show(int arr[][])
{
	for(int x[] :arr)
	{
		for(int y:x)
		{
			
			System.out.print(y+" ");
		}
		System.out.println();
	}
}
public static void main(String args[])
{
	int arr[][]=new int[3][3];
	System.out.println("Enter 2d array ");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	Array2d b=new Array2d();
	b.show(arr);
}
}
