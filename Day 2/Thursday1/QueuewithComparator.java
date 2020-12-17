import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuewithComparator {
  public static void main(String args[]) {

    PriorityQueue < Integer > pq = new PriorityQueue < Integer > (new Comimplement());
    pq.add(501);
    pq.add(402);
    pq.add(257);
    pq.add(164);
    pq.add(206);
    System.out.println("Priority queue using collection");
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());

    ArrayList < Integer > list = new ArrayList < Integer > ();
    list.add(254);
    list.add(364);
    list.add(445);
    list.add(145);
    list.add(845);
    list.add(754);
    Collections.sort(list, new Comimplement());
    System.out.println("List using collection");
    System.out.println(list);

  }
}