//using Maps
import java.util.*;


=======
import java.util.*;

//using Maps

class Dog {
  public Dog (String n) {System.out.println("in constructor");this.name = n;System.out.println("name = " + this.name);}
  public String name;
  public boolean equals (Object o) {
    if ((o instanceof Dog) && (((Dog)o).name == name)) {
      return true;
    }
    else
      return false;
  }
  public int hashCode() {return name.length();}
}

class Cat {}

enum Pets {DOG, CAT, HORSE}

class MapTest {
  public static void main (String[] args) {
    Map <Object, Object> m = new HashMap<Object, Object>();
    m.put("k1", new Dog("aiko")); 
    m.put("k2", Pets.DOG);
    m.put(Pets.CAT, "CAT key");
    Dog d1 = new Dog ("clover"); 
    m.put(d1, "Dog key");
    m.put(new Cat(), "Cat key");

    System.out.println(m.get("k1"));
    String k2 = "k2";
    System.out.println(m.get(k2));
    Pets p = Pets.CAT;
    System.out.println(m.get(p));
    System.out.println(m.get(d1));
    System.out.println(m.get(new Cat()));
    System.out.println(m.size());

    //what happens when object used as key has its values change?
    d1.name = "bob";
    System.out.println("When d1.name = bob: " + m.get(d1));
    d1.name = "clover";
    System.out.println("When d1.name = clover: " + m.get(new Dog("clover")));
    d1.name = "arthur";
    System.out.println("When d1.name = arthur: " + m.get(new Dog("")));

    System.out.println("Pets.CAT: " + m.get(Pets.CAT));

  }
}
>>>>>>> fa13825ca6266871bb0118ac3caad1002e4240fb
