package stack;

/**TDD for StrStack.java
 * @author zfac237
 *
 */
public class NumStack {
  private int size = 0;
  Stack numStack = new Stack();

  /** Constructor for creating a stack with initial size of 0
   * This initialises an empty stack.
   */
  public NumStack() {
    this.size = 0;
  }

  /** Inserts a float object to the stack using the push method from stack.
   * @param float object that is being inserted to the stack as an entry.
   */
  public void push(float f) {
    numStack.push(new Entry(f));
  }

  /** Checks if the stack has any values inside it using the isEmpty method from stack.
   * @return boolean true if the object is empty otherwise return false.
   */
  public boolean isEmpty() {
    return numStack.isEmpty();
  }

  /** removes the last value on the stack and converts value to string using getString.
   * @return The last Entry object in the stack.
   * @throws EmptyStackException stack is 0 or below then the stack is empty and you cannot pop.
   */
  public float pop() throws EmptyStackException {
    Entry floatval = numStack.pop();
    return floatval.getFloat();
  }
}
