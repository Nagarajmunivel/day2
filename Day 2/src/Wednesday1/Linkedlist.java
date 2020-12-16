package Wednesday1;

import java.util.LinkedList;
import java.util.*;
public class Linkedlist {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	LinkedList<Integer> list=new LinkedList<Integer>();
	System.out.println("Enter the list size");
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		int temp;
		temp=s.nextInt();
		if(list.contains(temp))
		{
			System.out.println("Already Exist");
		}
		else
		{
			list.add(temp);
		}
	}
	System.out.println(list);
	LinkedList<Integer> listi=new LinkedList<Integer>();
	listi.add(1);
	listi.add(2);
	list.add(3);
	LinkedList<Integer>listii=new LinkedList<Integer>();
	listii.addAll(listi);
	System.out.println(listii);
	
}
}
