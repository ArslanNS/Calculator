package test;

import static org.junit.Assert.assertEquals;

import calculator.CalculatorFactory;

import org.junit.Test;

import stack.NumStack;

/** TDD for RevPolCalc.java
 * @author zfac237
 *
 */
public class TestRevPolCalc {
  /** Creates several objects and passes them to a RevPolCalc object. 
   *  The test checks the evaluate adds correctly. 
   */
  @Test
  public void testFactoryAdd() { //TEST 43 - test to add two values with the RevPolCalc.
    RevPolCalc revPolCalc = new RevPolCalc();
    float val = revPolCalc.evaluate("53+");
    assertEquals("the value returned was not correct", 8f, val, 0f);
  }
 
}
