package Friday1;

import java.util.*;
public class Hashset1 {
public static void main(String args[])
{
	HashSet<Integer> hs=new HashSet<Integer>();
	ArrayList <Integer> al=new ArrayList<Integer>();
	hs.add(9);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	hs.addAll(al);
	
	System.out.println(hs.add(2));
	
	for(int i:hs)
	{
		System.out.println(i);
	}
	
	LinkedList <Integer> ll=new LinkedList<Integer>();
	ll.add(3);
	ll.add(4);
	ll.add(6);
	System.out.println(hs.containsAll(ll));
	hs.addAll(ll);
	System.out.println(hs);
	
	Iterator r=hs.iterator();
	while(r.hasNext())
	{
		System.out.println(r.next());
	}
	
}
}
