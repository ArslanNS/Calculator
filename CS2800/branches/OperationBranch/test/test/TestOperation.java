package test;

import static org.junit.Assert.assertEquals;

import operation.Addition;

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

}
