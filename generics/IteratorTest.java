import java.util.*;

public class IteratorTest {
  public static void main (String [] args) {
    List<Dog> dogs = new ArrayList<Dog>();
    Dog d = new Dog ("Tiger");
    dogs.add(d);
    dogs.add(new Dog("brownie"));
    dogs.add(new Dog("mint"));
    Iterator<Dog> iter = dogs.iterator();
    while (iter.hasNext()) {
      Dog d2 = iter.next();
      System.out.println("Dog: " + d2.name);
    }
    System.out.println("Dog Size: " + dogs.size());
    System.out.println("Dog 1: " + dogs.get(1).name);
    System.out.println("Tiger: " + dogs.indexOf(d));
    System.out.println("mint: " + dogs.indexOf(new Dog("mint")));
    dogs.remove(2);
    Object [] oa = dogs.toArray();
    for (Object o : oa) {
      Dog d2 = (Dog) o;
      System.out.println("Dog Name in Array: " + d2.name);
    }
  }
}
class Dog {
  public String name;
  Dog (String name) {this.name = name;}
}

