package Friday1;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
public static void main(String args[])
{
	HashSet<String> set=new HashSet<String>();
	set.add("Hello");
	set.add("World");
	set.add("This");
	set.add("is");
	set.add("Raj");
	set.add("hai");
	System.out.println(set);
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	set.add("hai11");
	System.out.println(set);
	for(String a:set)
	{
		System.out.println(a);
	}
	
	System.out.println();
	
}
}
