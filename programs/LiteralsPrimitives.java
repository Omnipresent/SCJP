class LiteralsPrimitives{
  public static void main (String [] args)
  {
    int ten = 012;
    int eleven = 013;
    int twelve = 014;
    int thirteen = 015;
    int fourteen = 016;
    int fifteen = 017;
    int sixteen = 020;
    System.out.println("Octal 012 " + sixteen);

    int x = 0x0001;
    int y = 0xDeadCafe;
    int z = 0x7FFffFfF;
    System.out.println("x = " + x + " y = " + y + " z = " + z);

    float f = 23.234234F;

    double d = 987.897D;

    System.out.println("d = " + d);
    System.out.println("f = " + f);

    int yq=0;
    int [] ai = new int [6];
    System.out.println(ai[0]);
    System.out.println(yq);
    int [] testScore;
    testScore = new int []{5,3};
    byte by =12;
    String ch = "bhaarat";
    System.out.println(ch);
    changeString (ch);
    System.out.println(ch);
    int [][] a = {{1,2}, {3,4}};
  }
  static String changeString (String s) {s = "s"; return s;}
}
