package Wednesday1;
import java.util.*;
import java.util.Scanner;
public class Arraylist {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	ArrayList<String> al = new ArrayList<String>(); 
	al.add("RAj");
	al.add("Breezy");
	al.add("1");
	al.add("Breezy");
	al.add("RAj");
	System.out.println(al.contains("RAj"));
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}	
	Iterator i=al.iterator();
	while(i.hasNext())
	{
		if(i.next().equals("Breezy"))
		{
			i.remove();
		}
		
	}
	System.out.println(al);
	String ip;
	System.out.println("Enter a element to add in a list");
	ip=s.next();
	if(al.contains(ip))
	{
		System.out.println("Already found");
	}
	else
	{
		al.add(ip);
	}
	
	System.out.println("Enter number of elements to add");
	int n=s.nextInt();
	ArrayList<Integer> intl=new ArrayList<Integer>(n);
	for(int j=0;j<n;j++)
	{
		intl.add(s.nextInt());
	}
	intl.remove(intl.size());
}
}
