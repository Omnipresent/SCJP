public class TestContinue {
  public static void main (String [] args)
  {
    for (int x=0; x<10; x++) {
      if (x == 5)
        continue;
      System.out.println(x);
    }
    Mixer m2 = new Mixer();
    Mixer m3 = new Mixer (m2); m3.go();
    Mixer m4 = m3.m1;          m4.go();
    System.out.println(m4.i);
  }
}
