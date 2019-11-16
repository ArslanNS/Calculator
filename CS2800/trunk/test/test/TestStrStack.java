package test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import stack.StrStack;

import stack.Symbol;

/**TDD for TestNumStack.java
 * @author zfac237
 *
 */
public class TestStrStack {

  /**Creates a Stack object and checks if after pushing an entry the stack contains and item.
   * The test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void opStackPushTest() { // TEST 31 - Pushing a symbol test.
    strStack test = new strStack();
    test.push(Symbol.TIMES);
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

  /** Creates a Stack object and checks if the Stack items can be removed after being pushed.
   * The test uses isEmpty to check whether pushing then popping leaves the stack empty.
   */
  @Test
  public void opStackPopTest() { // TEST 32 - Removing a value test.
    strStack test = new strStack();
    test.push("hello world");
    String stringPop = test.pop();
    assertEquals("Value popped is not 'hello world' ","hello world", String.valueOf(stringPop.getString()));
  }
}