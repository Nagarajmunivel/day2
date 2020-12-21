package Friday1;
import java.util.*;
import java.util.Vector;
public class Vectorcheck {
 public static void main(String args[])
 {
	 Vector <Integer> v=new Vector<Integer>();
	 v.add(9);
	 v.add(3);
	 v.add(2);
	 v.add(6);
	 v.add(5);
	 v.add(4);
	 System.out.println(v.firstElement());
	 System.out.println(v.lastElement());
	 System.out.println(v);

	 
	 Stack <Integer> s=new Stack<Integer>();
	 s.add(9);
	 s.add(3);
	 s.add(2);
	 s.add(6);
	 s.add(5);
	 s.add(4);
	 System.out.println(s.firstElement());
	 System.out.println(s.lastElement());
	 System.out.println(s);
	 

 }
}
