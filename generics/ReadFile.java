import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
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
    System.out.println(dvdList);
    System.out.println(dvdList.size());
    Collections.sort(dvdList);
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
