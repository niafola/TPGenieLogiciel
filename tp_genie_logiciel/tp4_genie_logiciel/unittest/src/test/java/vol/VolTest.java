package vol;

import org.junit.*;

public class VolTest {
  
  
  @Test(expected = IllegalArgumentException.class)
  public void toUpperIdZero() {
    Vol.toUpperId(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void toUpperNegative() {
    Vol.toUpperId(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void toUpperNonIntegerValue() {
    Vol.toUpperId(0.2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void concatZero() {
    Vol.concatId(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void concatNegativeValue() {
    Vol.concatId(-4);
  }

  @Test(expected = IllegalArgumentException.class)
  public void concatNonIntegerValue() {
    Vol.concatId(0.45);
  }

}
