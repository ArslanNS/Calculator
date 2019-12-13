package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import standardcalc.StandardCalc;

/** TDD for StandardCalc.java
 * @author zfac237
 *
 */
public class TestStandardCalc {

  /**Test to check if evaluate adds correctly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardAddTest() { //TEST 60  - test to see if values are added correctly.
    StandardCalc stCalculator = new StandardCalc();
    float ans = stCalculator.evaluate("51 + 5");
    assertEquals("ans was not added correctly", 56f, ans, 0f);
  }
  
  /**Test to check if evaluate subtracts correctly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardMinusTest() { //TEST 61 - test to see if values are subtracted correctly.
    StandardCalc stCalculator = new StandardCalc();
    float ans = stCalculator.evaluate("51 - 5");
    assertEquals("ans was not added correctly", 46f, ans, 0f);
  }
  
  /**Test to check if evaluate uses brackets correctly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardComplexBracketTest() { //TEST 62 - test to see if brackets are used correctly.
    StandardCalc stCalculator = new StandardCalc();
    float ans = stCalculator.evaluate("( 6 / 2 ) - ( ( 2 + 1 ) * ( 3 + 4 ) )");
    assertEquals("ans was not added correctly", -18f, ans, 0f);
  }

  /**Test to check if evaluate uses times correctly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardComplexMultiplicationTest() {
    StandardCalc stCalculator = new StandardCalc();
    float ans = stCalculator.evaluate("3 * 5 * 2");
    assertEquals(30f, ans, 0f);
  }

  /**Test to check if evaluate uses division properly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardComplexDivisionTest() {
    StandardCalc stCalculator = new StandardCalc();
    float ans = stCalculator.evaluate("12 / 4 / 3");
    assertEquals(1f, ans, 0f);
  }

  /**Test to check if evaluate uses brackets correctly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardBracketTest() throws Exception {
    StandardCalc stCalculator = new StandardCalc();
    float ans = stCalculator.evaluate("( 1 + 2 )");
    assertEquals(3f, ans, 0f);
  }

  /**Test to check if evaluate computes negative numbers correctly.
   * Test returns the correctly added value.
   */
  @Test
  public void standardNegativeNumberTest()  {
    StandardCalc stCalculator = new StandardCalc();
    float ans = stCalculator.evaluate("-10 + -4");
    assertEquals(-14f, ans, 0f);
  }
}
