public class EqualsTest {
  public static void main (String [] args) {
    Moof one = new Moof(8);
    Moof two = new Moof(8);
    if (one.equals(two)) {
      System.out.println("one and two are equal");
    }
    else {
      System.out.println("They aren't equal");
    }
  }
}

class Moof {
  private int moofValue;
  Moof (int val) {
    this.moofValue = val;
  }
  public int getMoofValue() {
    return this.moofValue;
  }
  public boolean equals (Object o) {
    if ((o instanceof Moof) && (((Moof)o).getMoofValue()) == this.getMoofValue())
        return true;
    else
        return false;
  }
}

