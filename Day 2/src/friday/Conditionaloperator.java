package friday;

public class Conditionaloperator {
	public static void main(String args[])
	{
int a=10;int b=20;int c=30;


int max=(a>b)?((a>c)?a:c):((b>c)?b:c);

int max1=(a>b)?a:b;

System.out.println(max);

System.out.println(max1);

}
}