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

  }
}
