package test;

import static org.junit.Assert.assertEquals;

import calculator.CalculatorFactory;

import org.junit.Test;

import stack.NumStack;

/** TDD for calculatorFactory.java
 * @author zfac237
 *
 */
public class TestCalculatorFactory {
  /** Creates several objects and passes them to a factory object. 
   *  The test checks the calculatorEquation adds correctly. 
   */
  @Test
  public void testFactoryAdd() { //TEST 39 - test to add two values with the factory.
    CalculatorFactory calcFactory = new CalculatorFactory();
    NumStack value = new NumStack();
    String symbol = "+";
    value.push(4f);
    value.push(2f);
    float val = calcFactory.calculatorEquations(value, symbol);
    assertEquals("the value returned was not correct", 6f, val, 0f);
  }
  
}
