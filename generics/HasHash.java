class HasHash {
  public int x;
  HashHas(int xVal) {x = xVal;}

  public boolean equals (Object o) {
    if (o instanceof HasHash && ((HasHash)o).x == this.x) 
      return true
    else
      return false
  }

  public int hashCode {return (x*17);}
}
