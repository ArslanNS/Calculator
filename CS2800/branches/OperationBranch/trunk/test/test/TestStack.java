package test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import stack.EmptyStackException;

import stack.Entry;

import stack.Stack;

import stack.Symbol;

import stack.Type;

/** TDD for TEstStack.java
 * @author zfac237
 *
 */
public class TestStack {

  /**Creates a Stack object and checks if size is set to 2.
   * The test allows for the creation of a stack constructor and checks if it works with setSize().
   */
  @Test
  public void sizeTest() { // TEST 18 - Stack constructor, setSize(), getSize(). 
    Stack test = new Stack();
    test.setSize(2);
    assertEquals("setSize() method was not able to set the value of size to 2", 2,
        test.getSize());
  }

  /** Creates a Stack object and checks if is empty using isEmpty() method.
   *  The test allows for the creation of a isEmpty method() for empty stack testing.
   */
  @Test
  public void emptyTest() { // TEST 19 - Empty stack check.
    Stack test = new Stack();
    assertTrue("isEmpty() method did not return true for an empty stack",test.isEmpty());
  }

  /** Creates a Stack object and checks if after pushing an entry the stack contains and item.
   * The test allows for the creation of a push() function which loads up a stack.
   */
  @Test
  public void pushTest() { // TEST 20 - Pushing a value test.
    Stack test = new Stack();
    test.push(new Entry(56.25f));
    assertFalse("isEmpty() method did not return false for a non-empty stack", test.isEmpty());
  }

  /** Creates a Stack object and checks if the Stack items can be removed after being pushed.
   * The test uses isEmpty to check whether pushing then popping leaves the stack empty.
   */
  @Test
  public void popTest() { // TEST 21 - Removing a value test.
    Stack test = new Stack();
    test.push(new Entry(42.74f));
    test.pop();
    assertTrue("pop() method did not remove entry from stack",test.isEmpty());
  }

  /** Creates a Stack object and checks if the correct Float value is being contained.
   * The test pushes a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void floatPopTest() { // TEST 22 - Popping a Float test.
    Stack test = new Stack();
    test.push(new Entry(42.43f));
    Entry floatPop = test.pop();
    assertEquals("Value popped does not equal 42.43",42.43f, floatPop.getFloat(), 0.0f);
  }

  /** Creates a Stack object and checks if the correct Symbol value is being contained.
   * The test pushes a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void symbolPopTest() { // TEST 23 - Popping a Symbol test.
    Stack test = new Stack();
    test.push(new Entry(Symbol.TIMES));
    Entry symbolPop = test.pop();
    assertEquals("Value popped is not *","*", String.valueOf(symbolPop.getSymbol()));
  }

  /** Creates a Stack object and checks if the correct String value is being contained.
   * The test pushes a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void stringPopTest() { // TEST 24 - Popping a String test.
    Stack test = new Stack();
    test.push(new Entry("string"));
    Entry stringPop = test.pop();
    assertEquals("Value popped does not equal string","string", stringPop.getString());
  }

  /** Creates a Stack object and checks if the correct Type value is being contained.
   * The test pushes a value and then checks if the popped value is the same as the entered value.
   */
  @Test
  public void typePopTest() { // TEST 25 - Popping Type test.
    Stack test = new Stack();
    test.push(new Entry(Type.INVALID));
    Entry typePop = test.pop();
    assertEquals("Value popped does not equal INVALID","INVALID", typePop.toString());
  }
  
  /** Creates a stack object and checks if the values are being stored in correct order.
   * The test allows the creation of top() which compares the top value to the last value entry.
   */
  @Test
  public void topTest() { // TEST 26 - top() test with float value.
    Stack test = new Stack();
    test.push(new Entry(32.54f));
    Entry topVal = test.top();
    assertEquals("top() method does not return correct value of 32.54",
        32.54f, topVal.getFloat(), 0.0f);
  }
  
  /** Creates an empty Stack object and checks if exception is thrown when tried to pop.
   * The test creates a empty stack and immediately tries to pop it.
   */
  @Test(expected = EmptyStackException.class) // TEST 27 - Empty stack pop exception test.
  public void emptyStackPopExceptionTest() {
    Stack test = new Stack();
    test.pop();
  }
  
  /** Creates an empty Stack and checks if exception is thrown when top() tried on empty stack.
   * This test creates a stack, leaves it empty and tries to top.
   */
  @Test(expected = EmptyStackException.class)
  public void emptyTopExceptionTest() { // Test 28 : Empty stack top exception test.
    Stack testing = new Stack();
    testing.top();
  }
}

