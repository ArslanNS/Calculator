package stack;

/**A stack of float values.
 * @author zfac237
 *
 */
public class NumStack {
  Stack numStack = new Stack();

  /** Constructor for creating a stack with initial size of 0
   * This initialises an empty stack.
   */
  public NumStack() {
  }

  /** Inserts a float object to the stack using the push method from stack.
   * @param f object that is being inserted to the stack as an entry.
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

  /** removes the last value on the stack and converts value to string using getFloat.
   * @return The last Entry object in the stack.
   * @throws EmptyStackException stack is 0 or below then the stack is empty and you cannot pop.
   */
  public float pop() throws EmptyStackException {
    Entry floatval = numStack.pop();
    return floatval.getFloat();
  }
}
