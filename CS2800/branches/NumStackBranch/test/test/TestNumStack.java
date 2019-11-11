package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import stack.Entry;
import stack.NumStack;
import stack.Stack;


/**TDD for TestNumStack.java
 * @author zfac237
 *
 */
public class TestNumStack {

  /**Creates a Stack object and checks if after pushing an entry the stack contains and item.
   * The test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void numStackPushTest() { // TEST 29 - Pushing a float test.
    NumStack test = new NumStack();
    test.push(56.25f);
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

  /** Creates a Stack object and checks if the Stack items can be removed after being pushed.
   * The test uses isEmpty to check whether pushing then popping leaves the stack empty.
   */
  @Test
  public void numStackPopTest() { // TEST 30 - Removing a value test.
    NumStack test = new NumStack();
    test.push(42.74f);
    test.pop();
    assertTrue("pop() method did not remove entry from stack",test.isEmpty());
  }
}