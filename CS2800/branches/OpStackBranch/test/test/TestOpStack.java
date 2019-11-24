package test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import stack.OpStack;

import stack.Symbol;

/**TDD for TestOpStack.java
 * @author zfac237
 *
 */
public class TestOpStack {

  /**Creates a Stack object and checks if after pushing an entry the stack contains and item.
   * The test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void opStackPushTest() { // TEST 31 - Pushing a symbol test.
    OpStack test = new OpStack();
    test.push(Symbol.TIMES);
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

  /** Creates a Stack object and checks if the Stack items can be removed after being pushed.
   * The test checks if the value popped is equal to the symbol "/".
   */
  @Test
  public void opStackPopTest() { // TEST 32 - Removing a value test.
    OpStack test = new OpStack();
    test.push(Symbol.DIVIDE);
    Symbol symbolPop = test.pop();
    assertEquals("Value popped is not /","/", String.valueOf(symbolPop.getSymbol()));
  }
}