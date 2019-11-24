package test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import stack.StrStack;

/**TDD for TestStrStack.java
 * @author zfac237
 *
 */
public class TestStrStack {

  /**Creates a Stack object and checks if after pushing an entry the stack contains and item.
   * The test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void strStackPushTest() { // TEST 33 - Pushing a symbol test.
    StrStack test = new StrStack();
    test.push("hello world");
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

  /** Creates a Stack object and checks if the Stack items can be removed after being pushed.
   * The test checks if the value pushed is equal to "hello world".
   */
  @Test
  public void stackStackPopTest() { // TEST 34 - Removing a value test.
    StrStack test = new StrStack();
    test.push("hello world");
    String stringPop = test.pop();
    assertEquals("hello world not popped' ","hello world", String.valueOf(stringPop.toString()));
  }
}
