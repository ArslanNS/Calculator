package test;

import static org.junit.Assert.assertEquals;

import calculator.CalculatorFactory;

import org.junit.Test;

import stack.NumStack;

/** TDD for CalcModel.java
 * @author zfac237
 *
 */
public class TestCalcModel {
  /** Creates a CalcModel object then parses a boolean and equation to the evaluate method.
   *  The test checks if when infix is selected brackets work.
   */
  @Test
  public void testInfix() { //TEST 67 - test to check if equation is solved in infix.
    CalcModel calcModel = new CalcModel();
    float val = calcModel.evaluate("( 5 + 5 )", true)
    assertEquals("the value returned was not correct", 10, val, 0f);
  }
  
  /** Creates a CalcModel object then parses a boolean and equation to the evaluate method.
   *  test to check the equation calculated is done in postfix.
   */
  @Test
  public void testPostfix() { //TEST 67 - test to check if equation is solved in postfix.
    CalcModel calcModel = new CalcModel();
    float val = calcModel.evaluate("5 + 5 - 6", true)
    assertEquals("the value returned was not correct", 4, val, 0f);
  }
}
  
