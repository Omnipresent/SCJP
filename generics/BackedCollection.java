import java.util.*;

class BackedCollection {
  public static void main (String args[]) {
    TreeMap<String, String> map = new TreeMap<String, String>();
    map.put("a", "ant"); map.put("d", "dog"); map.put("h", "horse");
    SortedMap<String, String> submap = map.subMap("b", "g");
    map.put("b", "bat");
    submap.put("f", "fish");
    map.put("r", "raccoon");//out of range
    submap.put("z", "zenith");
    System.out.println(map);
    System.out.println(submap);
  }
}
