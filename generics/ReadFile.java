import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.Arrays;

public class ReadFile {
  public static void main (String args[]) {
    ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
    try {
      BufferedReader in = new BufferedReader(new FileReader("dvdinfo.txt"));
      String str;
      while ((str = in.readLine()) != null) {
        populateList(str,dvdList);
      }
    }
    catch (IOException e) {
      System.out.println(e);
    }

    //normal ordered
    System.out.println(dvdList);
    Collections.sort(dvdList);
    //sorted by title using comparable
    System.out.println(dvdList);
    Collections.sort(dvdList, new GenreSort());
    //sorted by genre using comparator
    System.out.println(dvdList);

    int [] numbers = new int [10];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i*20;
    }
    printArray(numbers);
    Arrays.sort(numbers);
    printArray(numbers);
//Arrays.sort(numbers, Collections.reverseOrder());
//    printArray(numbers);
    reverseArray(numbers);
    System.out.println("");
    printArray(numbers);

    Double [] array = new Double [5];
    array[0] = .5; array[1] = .1; array[2] = 2.0; array[3] = 1.45; array[4] = .01;
    printDoubleArray(array);
    Arrays.sort(array);
    System.out.println("");
    printDoubleArray(array);
    Arrays.sort(array, Collections.reverseOrder());
    printDoubleArray(array);
  }

  public static void reverseArray (int[] array) {
    for (int i = 0; i < array.length/2; i++) {
      int temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
  public static void printDoubleArray(Double [] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void populateList (String str, ArrayList<DVDInfo> dvdList) {
    String [] line = new String[3];//0 = title, 1 = genre, 2 = actor
    line = str.split("/");
    DVDInfo info = new DVDInfo(line[0], line[1], line[2]);
    dvdList.add(info);
  }
}

class DVDInfo implements Comparable<DVDInfo>{
  String title;
  String genre;
  String leadActor;
  public String getTitle() {
    return this.title;
  }

  public String getGenre() {
    return this.genre;
  }

  DVDInfo (String t, String g, String a) {
    title = t; genre = g; leadActor = a;
  }
  public String toString() {
    return title + " " + genre + " " + leadActor + "\n";
  }
  public int compareTo(DVDInfo d) {
    return this.title.compareTo(d.getTitle());
  }
}

class GenreSort implements Comparator<DVDInfo> {
  public int compare(DVDInfo one, DVDInfo two) {
    return one.getGenre().compareTo(two.getGenre());
  }
}

