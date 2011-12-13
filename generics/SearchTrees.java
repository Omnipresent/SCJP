import java.util.*;

class SearchTrees {
  public static void main (String args[]) {
    TreeSet<Integer> times = new TreeSet<Integer>();

    times.add(1200);
    times.add(1225);
    times.add(1500);
    times.add(1350);
    times.add(1760);
    times.add(1560);
    times.add(2010);
    times.add(1885);
    times.add(2200);

    //Java5
    TreeSet<Integer> subset = new TreeSet<Integer>();
    subset = (TreeSet)times.headSet(1600);
    System.out.println("Java5 before 1600: " + subset.last());

    subset = (TreeSet)times.tailSet(1800);
    System.out.println("Java5 before 1600: " + subset.first());

    //Java6
    System.out.println("Java6 before 1600: " + times.lower(1600));
    System.out.println("Java6 after 1800: " + times.higher(1800));

    Iterator<Integer> d = times.descendingIterator();
    TreeSet<Integer> descending = (TreeSet<Integer>)times.descendingSet();
    //NavigableSet d1 = times.descendingSet();
    //TreeSet d2 = (TreeSet) d1;
    System.out.println("descending iterator");
    while (d.hasNext()) {
      System.out.println(d.next());
    }

    System.out.println("descending set");
    Iterator<Integer> it = descending.iterator();
    while (it.hasNext())
      System.out.println(it.next());

    int last = times.pollLast();

    int first = times.pollFirst();
    
  }
}
