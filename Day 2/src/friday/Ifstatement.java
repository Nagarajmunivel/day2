package friday;

public class Ifstatement {
public static void main(String args[])
{
//simple if
	int a=10;
	if(a>10)
	{
		System.out.println("Greater than 10");
	}
//else if	
	int b=25;
	if(b>10)
	{
		System.out.println("Greater than 10");
	}
	else if(b>20){
		System.out.println("Greater than 10");

	}
	else if(b>30) {
		System.out.println("Greater than 30");
	}else
	{
		System.out.println("it is a number");

	}
//nested if
	String nationality="INDIAN";
	int age=18;
	if(nationality=="INDIAN")
	{
		if(age>=18)
		{
			System.out.println("eligible to vote");

		}else {
			System.out.println("not eligible");

		}
	}
			
}
}
