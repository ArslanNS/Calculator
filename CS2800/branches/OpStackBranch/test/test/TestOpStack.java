package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import stack.Entry;

import stack.OpStack;

import stack.Stack;

import stack.Symbol;

/**TDD for TestNumStack.java
 * @author zfac237
 *
 */
public class TestOpStack {

  /**Creates a Stack object and checks if after pushing an entry the stack contains and item.
   * The test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void pushTest() { // TEST 31 - Pushing a symbol test.
    OpStack test = new OpStack();
    test.push(Symbol.TIMES);
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

  /** Creates a Stack object and checks if the Stack items can be removed after being pushed.
   * The test uses isEmpty to check whether pushing then popping leaves the stack empty.
   */
  @Test
  public void popTest() { // TEST 32 - Removing a value test.
    OpStack test = new OpStack();
    test.push(Symbol.DIVIDE);
    Entry symbolPop = test.pop();
    assertEquals("Value popped is not /","/", String.valueOf(symbolPop.getSymbol()));
  }
}