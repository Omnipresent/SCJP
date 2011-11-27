public class BobTest {
  public static void main (String [] args) {
    Bob f = new Bob ("gobobgo", 19);
    System.out.println(f);
  }
}

class Bob {
  int shoeSize;
  String nickname;

  Bob (String nickname, int shoeSize) {
    this.shoeSize = shoeSize;
    this.nickname = nickname;
  }

  public String toString() {
    return ("My nick name is " + nickname + " and my shoesize is " + shoeSize);
  }
}
