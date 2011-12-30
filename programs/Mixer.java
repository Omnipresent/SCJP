class Mixer {
  Mixer () {}
  Mixer (Mixer m) {m1 = m;}
  protected Mixer m1;
  protected int i = 10;
  public static void main (String [] args)
  {
    Mixer m2 = new Mixer();
    Mixer m3 = new Mixer (m2); m3.go();
    Mixer m4 = m3.m1;          m4.go();
    System.out.println(m4.i);
  }
  void go() {System.out.println("hi ");}
}
