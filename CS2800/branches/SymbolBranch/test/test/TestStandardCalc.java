package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/** TDD for the standard calculator.
 * @author zfac237
 *
 */
public class TestStandardCalc {

  /** Test to check if evaluate adds correctly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardAddTest() { //TEST 60  - test to see if values are added correctly.
    StandardCalculator stCalculator = new StandardCalculator();
    float ans = stCalculator.evaluate("5 + 5");
    assertEquals("answer was not added correctly", 5f, ans, 0f);
  }
}
