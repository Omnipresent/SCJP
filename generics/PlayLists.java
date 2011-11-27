import java.util.*;

public class PlayLists {
  public static void main (String args[]) {
    List<String> test = new ArrayList<String>();
    String s = "hi";
    test.add("string");
    test.add(s);
    test.add(s+s);
    System.out.println(test.size());
    System.out.println(test.contains(42));
    System.out.println(test.contains("hihi"));
    test.remove("hi");
    System.out.println(test.size());
    
    List <String> stuff = new ArrayList<String>();
    stuff.add("bhaarat");
    stuff.add("brian");
    stuff.add("sapan");
    stuff.add("Ahuja");
    stuff.add("patrick");
    stuff.add("drake");
    System.out.println("unsorted " + stuff);
    Collections.sort(stuff);
    System.out.println("sorted " + stuff);
  }
}

