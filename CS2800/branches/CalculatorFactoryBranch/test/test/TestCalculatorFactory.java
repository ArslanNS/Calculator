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
  
  /** Creates several objects and passes them to a factory object. 
   *  The test checks the calculatorEquation subtracts correctly. 
   */
  @Test
  public void testFactorySubtract() { //TEST 40 - test to subtract two values with the factory.
    CalculatorFactory calcFactory = new CalculatorFactory();
    NumStack value = new NumStack();
    String symbol = "-";
    value.push(10f);
    value.push(3f);
    float val = calcFactory.calculatorEquations(value, symbol);
    assertEquals("the value returned was not correct.", 7f, val, 0f);
  }
  
  /** Creates several objects and passes them to a factory object. 
   *  The test checks the calculatorEquation multiplies correctly. 
   */
  @Test
  public void testFactoryMultiply() { //TEST 41 - test to multiply two values with the factory.
    CalculatorFactory calcFactory = new CalculatorFactory();
    NumStack value = new NumStack();
    String symbol = "*";
    value.push(3f);
    value.push(4f);
    float val = calcFactory.calculatorEquations(value, symbol);
    assertEquals("the value returned was not correct.", 12f, val, 0f);
  }multiplied
  
  /** Creates several objects and passes them to a factory object. 
   *  The test checks the calculatorEquation multiplies correctly. 
   */
  @Test
  public void testFactoryDivide() { //TEST 42 - test to divide two values with the factory.
    CalculatorFactory calcFactory = new CalculatorFactory();
    NumStack value = new NumStack();
    String symbol = "/";
    value.push(12f);
    value.push(4f);
    float val = calcFactory.calculatorEquations(value, symbol);
    assertEquals("the value returned was not correct.", 3f, val, 0f);
  }
}
