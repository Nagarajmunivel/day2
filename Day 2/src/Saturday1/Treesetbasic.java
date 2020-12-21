package Saturday1;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetbasic {
	public static void main(String args[])
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(700);
		ts.add(600);
		ts.add(500);
		ts.add(400);
		ts.add(500);
		System.out.println(ts);
		Iterator i=ts.iterator();
		for(Integer it:ts)
		{
			System.out.println(it);
		}
		System.out.println();
		
		 for (Integer element : ts) 
	         System.out.print(element + " "); 
	}
}
