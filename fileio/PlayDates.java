import java.util.*;
import java.text.DateFormat;
public class PlayDates {
  public static void main (String args[]) {
    Date d = new Date();
    System.out.println(d);
    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
    df.format(d);
    System.out.println(df.format(d));
    System.out.println((d));


    //calendar
    Calendar c = Calendar.getInstance();
    c.set(2012, 11, 18);
    System.out.println("Current Date: " + c.getTime());
    Date calDate = c.getTime();
    System.out.println(df.format(calDate));

    Locale l = new Locale("en", "english");
    System.out.println(l.getDisplayCountry());
    System.out.println(l.getDisplayLanguage());
  }

}
