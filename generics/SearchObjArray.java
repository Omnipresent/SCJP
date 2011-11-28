import java.util.*;

class SearchObjArray {
  public static void main(String [] args) {
    String [] sa = {"bhaarat", "Ahuja", "sapan", "drake"};

    Arrays.sort(sa);
    printArray(sa);
    System.out.println("\nNormal Search sapan = " + Arrays.binarySearch(sa, "sapan"));
    Arrays.sort(sa, new ReSortComparator());
    printArray(sa);
    System.out.println("\nSearch after reversed (Normal)\nsapan = " + Arrays.binarySearch(sa, "sapan")); // you get an undefined answer because its no longer natural order
    System.out.println("\nSearch with comparator \nsapan = " + Arrays.binarySearch(sa, "sapan", new ReSortComparator()));
    System.out.println("\nSearch for nonexitent \nanand = " + Arrays.binarySearch(sa, "anand", new ReSortComparator()));
  }
  public static void printArray (String [] array) {
   for (String s : array)
      System.out.print(s + " ");
  }
  static class ReSortComparator implements Comparator<String> {
    public int compare(String a, String b) {
      return b.compareTo(a);
    }
  }
}

