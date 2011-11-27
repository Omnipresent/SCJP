import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;

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
