import java.util.regex.*;

public class Patterns {
  public static void main (String args[]) {
    Pattern p = Pattern.compile ("\\d+");
    Matcher m = p.matcher("1 a12 234b");
    while (m.find()) {
      System.out.println(m.start() + " " + m.group());
    }
    int i1 = -123;
    int i2 = 12345;

    System.out.printf(">%1$ \n", i1, true);
  }
}
