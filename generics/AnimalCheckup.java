import java.util.*;
abstract class Animal {
  public abstract void checkup();
}
class Dog extends Animal {
  public void checkup(){System.out.println("dog");};
}
class Cat extends Animal {
  public void checkup(){System.out.println("cat");};
}
class Bird extends Animal {
  public void checkup(){System.out.println("bird");};
}
public class AnimalCheckup {
  public void checkAnimals (List <? extends Animal> animals) {
    //for (Animal a : animals)
     // a.checkup();
  }
  public void addAnimal (List<? super Dog> animals) {
    animals.add(new Dog());
  }
  public static void main (String args[]) {
    Dog [] dogs = {new Dog(), new Dog()};
    Cat [] cats = {new Cat()};
    Bird [] birds = {new Bird(), new Bird(), new Bird()};
    AnimalCheckup check = new AnimalCheckup();
    ArrayList<Dog> d = new ArrayList<Dog>();
    check.checkAnimals(d);
    //check.checkAnimals(cats);
    //check.checkAnimals(birds);

  }
}
