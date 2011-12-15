import java.io.*;

class Cat implements Serializable {String name; Cat (String name) { this.name = name;} String getCatName() {return this.name;}}

public class SerializeCat {
  public static void main (String args[]) {
    Cat c = new Cat ("memo");
    try {
      FileOutputStream f = new FileOutputStream ("catserialize11");
      ObjectOutputStream o = new ObjectOutputStream(f);
      o.writeObject(o);
      o.flush();
      o.close();
    }
    catch (IOException e) {}
    try {
      FileInputStream i = new FileInputStream("catserialize11");
      ObjectInputStream o = new ObjectInputStream(i);
      Cat d = (Cat) o.readObject();
      System.out.println("cat name " + d.getCatName());
      o.close();
    }
    catch (IOException e) {}
    catch (ClassNotFoundException e) {}
  }
}
