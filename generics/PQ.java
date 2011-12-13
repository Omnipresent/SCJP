import java.util.*;

class PQ {
  static class PQSort implements Comparator<Integer>{
    public int compare (Integer one, Integer two) {
      return two - one;
    }
  }
  public static void main (String args[]) {
    int [] ia = {1, 8, 3, 2, 5, 9, 4, 6};
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    for (int i : ia)
      pq.offer(i);
    for (int i : ia)
      System.out.print(pq.poll() + " ");
    PQSort pqs = new PQSort();

    PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(19, pqs);

    for (int i : ia)
      pq1.offer(i);

    System.out.println("Size : " + pq1.size());
    System.out.println("Peek: " + pq1.peek());
    System.out.println("Size : " + pq1.size());
    System.out.println("Poll: " + pq1.poll());
    System.out.println("Size : " + pq1.size());

    for (int i : ia)
      System.out.print(pq1.poll() + " ");
  }
}
