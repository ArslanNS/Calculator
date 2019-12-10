package test;

import static org.junit.Assert.assertEquals;

import calculator.RevPolCalc;
import org.junit.Test;

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
    float val = revPolCalc.evaluate("5 3 +");
    assertEquals("the value returned was not correct", 8f, val, 0f);
  }
  
  /** Creates several objects and passes them to a RevPolCalc object. 
   *  The test checks the evaluate subtracts correctly. 
   */
  @Test
  public void testFactorySubtract() { //TEST 44 - test to subtract two values.
    RevPolCalc revPolCalc = new RevPolCalc();
    float val = revPolCalc.evaluate("5 3 -");
    assertEquals("the value returned was not correct", 2f, val, 0f);
  }
  
  /** Creates several objects and passes them to a RevPolCalc object. 
   *  The test checks the evaluate multiplies correctly. 
   */
  @Test
  public void testFactoryMulitply() { //TEST 45 - test to multiply two values.
    RevPolCalc revPolCalc = new RevPolCalc();
    float val = revPolCalc.evaluate("5 3 *");
    assertEquals("the value returned was not correct", 15f, val, 0f);
  }
  
  /** Creates several objects and passes them to a RevPolCalc object. 
   *  The test checks the evaluate divide correctly. 
   */
  @Test
  public void testFactoryDivide() { //TEST 46 - test to divide two values.
    RevPolCalc revPolCalc = new RevPolCalc();
    float val = revPolCalc.evaluate("15 3 /");
    assertEquals("the value returned was not correct", 5f, val, 0f);
  }
  
  /** Creates several objects and passes them to a RevPolCalc object. 
   *  The test checks the evaluate works with multiple operators. 
   */
  @Test
  public void testFactoryMultiple() { //TEST 47 - test with multiple operators.
    RevPolCalc revPolCalc = new RevPolCalc();
    float val = revPolCalc.evaluate("5 3 + 2 / 2 * 5 -");
    assertEquals("the value returned was not correct", 3f, val, 0f);
  }
}
