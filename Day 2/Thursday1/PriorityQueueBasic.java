import java.util.PriorityQueue;

import java.util.Iterator;

public class PriorityQueueBasic {
	public static void main(String args[]){  
		PriorityQueue<String> q=new PriorityQueue<String>();  
		q.add("Raj");  
		q.add("Breezy");  
		q.add("Coolpad");  
		q.add("User");  
		q.add("Zeemarcos");
		System.out.println(q);
		System.out.println("This is the head:"+q.element());  
		System.out.println("");
		
		Iterator itr=q.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		q.remove();  
		q.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=q.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  
}
