package test;

import static org.junit.Assert.assertEquals;

import operation.Addition;
import operation.Divide;
import operation.Multiply;
import operation.Subtract;

import org.junit.Test;

/** TDD for TestOperation.java
 * @author zfac237
 *
 */
public class TestOperation {

  /** Creates an add object then parses 2 and 2 into the evaluate method.
   * The test checks if the value returned is the correctly added value.
   */
  @Test
  public void additionTest() { //TEST 35 - test to see if addition class adds values correctly
    Addition add = new Addition();
    float val = add.evaluate(2f, 2f);
    assertEquals("add evaluate did not return 4 when adding 2 to 2.", 4f, val, 0f);
  }
  
  /** Creates an subtract object then parses 5 and 2 into the evaluate method.
   * The test checks if the value returned is the correctly subtracted value.
   */
  @Test
  public void subtractionTest() { //TEST 36 - test to see if values are subtracted correctly.
    Subtract sub = new Subtract();
    float val = sub.evaluate(2f, 5f);
    assertEquals("subract evaluate did not return 3 when subtracting 5 by 2.", 3f, val, 0f);
  }
  
  /** Creates an multiply object then parses 3 and 4 into the evaluate method.
   * The test checks if the value returned is the correctly multiplied value.
   */
  @Test
  public void multiplyTest() { //TEST 37 - test to see if values are multiplied correctly.
    Multiply times = new Multiply();
    float val = times.evaluate(3f, 4f);
    assertEquals("multiply evaluate did not return 12 when multiplying 3 by 4.", 12f, val, 0f);
  }
  
  /** Creates an divide object then parses 10 and 2 into the evaluate method.
   * The test checks if the value returned is the correctly divided value.
   */
  @Test
  public void divideTest() { //TEST 38 - test to see if values are divided correctly.
    Divide divide = new Divide();
    float val = divide.evaluate(2f, 10f);
    assertEquals("divide evaluate did not return 5 when dividing 10 by 2.", 5f, val, 0f);
  }

}
