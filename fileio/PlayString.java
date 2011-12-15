import java.io.*;

public class PlayString {
  public static void main (String args[]) {
    String s = "substring";
    System.out.println(s.substring(0,5));
    StringBuffer sb = new StringBuffer("bharat");
    sb.append(5);
    System.out.println(sb);
    System.out.println(sb.delete(1,4));
    System.out.println(sb);
    System.out.println(sb.insert(1,"har"));
    System.out.println(sb);
    createfiles();
    bufferedWriter();
  }
  public static void bufferedWriter() {
    try {
      FileWriter f = new FileWriter("writer");
      BufferedWriter w = new BufferedWriter(f);
      w.write("test");
      w.flush();
      w.close();
    }
    catch (IOException e) {}
  }
  public static void createfiles() {
    try {
    File f = new File("namedir", "name1");
    FileWriter fw = new FileWriter(f);
    fw.write("This is a test");
    fw.flush();
    fw.close();
    }
    catch (IOException e) {}
  }
}
