package eurotesting;

import junit.framework.*;

public class EuroTest extends TestCase {

  public EuroTest(String name) {
    super(name);
  }

  public void testAmount() {
    Euro two = new Euro(2.00);
    assertTrue(2.00 == two.getAmount());
  }

  public static void main(String[] args) {
    junit.swingui.TestRunner.run(EuroTest.class);
  }
}