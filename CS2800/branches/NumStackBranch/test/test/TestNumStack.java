package test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import stack.NumStack;


/** TDD for TestNumStack.java
 * @author zfac237
 *
 */
public class TestNumStack {

  /**Creates a Stack object and checks if after pushing an entry the stack contains and item.
   * The test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void pushTest() { // TEST 29 - Pushing a float test.
    NumStack test = new NumStack();
    test.push(56.25f);
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

}