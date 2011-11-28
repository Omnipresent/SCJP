import java.util.*;

public class Conversion {
  public static void main (String args[]) {
    //toList()
    String [] sa = {"one", "two", "three", "four"};
    List sList = Arrays.asList(sa);
    System.out.println("size " + sList.size());
    System.out.println("idx2 " + sList.get(2));

    sList.set(3, "six");
    sa[1] = "five";
    for (String s : sa)
      System.out.println(s + " ");
    System.out.println("\ns1[1] " + sList.get(1));

    sList.set(2, "bhaarat");
    sa[2] = "sapan";
    for (String s : sa)
      System.out.println(s + " ");
    System.out.println(sList.get(2));
    //toArray()
    List <Integer> iL = new ArrayList<Integer>();
    for (int x = 0; x<3; x++)
      iL.add(x);
    Object [] oa = iL.toArray();
    oa[3] = "bhaarat";
    Integer[] ia2 = new Integer[3];
    ia2 = iL.toArray(ia2);
    System.out.println("original list size: " + iL.size());
    System.out.println("Object Array length: " + oa.length);
    System.out.println("Integer array length: " + ia2.length);
  }
}
