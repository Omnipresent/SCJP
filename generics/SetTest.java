//using sets
import java.util.*;
class SetTest {
  public static void main (String [] args) {
    boolean [] ba = new boolean [5];

    Set s = new HashSet();
    
    //TreeSet s = new TreeSet(); //For TreeSet to work, elements in Set should be comparable

    ba[0] = s.add("a");
    ba[1] = s.add(new Integer(42));
    ba[2] = s.add("a");
    ba[3] = s.add("b");
    ba[4] = s.add(new Object());

    for (boolean b : ba) 
      System.out.println(b + " ");

    for (Object o : s) {
      System.out.println(o.toString());
    }
  }
}

