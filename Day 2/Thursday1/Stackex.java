import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;
public class Stackex {
  public static void main(String args[]) {
    Scanner s = new Scanner(System. in );
    Stack < Integer > st = new Stack < Integer > ();
    st.add(1);
    st.push(2);
    System.out.println(st);
    st.pop();
    System.out.println(st);
    st.add(3);
    System.out.println(st);
    System.out.println(st.peek());
    System.out.println(st.pop());
    System.out.println(st);

    Stack < String > st1 = new Stack < String > ();
    for (int i = 1; i <= 5; i++) {
      System.out.println("Enter the " + i + " th" + " Element ");
      st1.push(s.next());
    }
    System.out.println("Enter the element to remove");
    String sr = s.next();
    Iterator itr = st1.iterator();
    while (itr.hasNext()) {
      if (itr.next().equals(sr)) {
        itr.remove();
      }
    }
    System.out.println(st1);

  }
}