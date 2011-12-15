import java.util.*;

public class RentalGeneric <T> {
  private List<T> rentalPool;
  private int maxNum;

  public RentalGeneric (int maxNum, List<T> rentalPool) {
    this.maxNum = maxNum;
    this.rentalPool = rentalPool;
  }
  public T getRental() {
    return rentalPool.get(0);
  }
  public void returnRental(T o) {
    rentalPool.add(o);
  }
  public static <E extends Number> List<E> process(List<E> nums) {return new ArrayList<E>();}
  public void test() {
    List<Integer> input  = null;
    ArrayList<Integer> output = null;
  }

}
