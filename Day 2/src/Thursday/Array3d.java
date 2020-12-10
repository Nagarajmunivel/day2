package Thursday;
import java.util.Scanner;
public class Array3d {
public static void main(String args[])
{
	int arr[][][]=new int[3][3][3];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 3d array");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
				arr[i][j][k]=s.nextInt();
			}
		}
	}
	showing obj =new showing(arr);
}
}
class showing{
	showing(int arr[][][])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				for(int k=0;k<3;k++)
				{
					System.out.print(arr[i][j][k]);
				}
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}