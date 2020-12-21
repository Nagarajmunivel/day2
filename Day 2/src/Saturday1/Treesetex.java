package Saturday1;
import java.util.*;
public class Treesetex {
public static void main(String args[])
{
	TreeSet<Integer> ts=new TreeSet<Integer>(new Comexam());
	ts.add(101);
	ts.add(209);
	ts.add(103);
	ts.add(405);
	ts.add(704);
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
