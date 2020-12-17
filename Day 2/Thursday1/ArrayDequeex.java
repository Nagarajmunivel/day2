import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeex {
public static void main(String args [])
{
	ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(6);
	arr.add(8);
	arr.add(9);
	System.out.println(arr.getFirst());
	System.out.println(arr.peek());
	System.out.println(arr.getLast());
	System.out.println(arr);
	
	for(int i:arr)
	{
		System.out.println(i);
	}
	
	System.out.println();
	
	for(Iterator<Integer> i=arr.descendingIterator();i.hasNext(); )
	{
		System.out.println(i.next());
	}
	
	System.out.println();
	
	System.out.println(arr.poll());
	System.out.println(arr);
	
	System.out.println();
	
	System.out.println(arr.peek());
	System.out.println(arr);
}
}
