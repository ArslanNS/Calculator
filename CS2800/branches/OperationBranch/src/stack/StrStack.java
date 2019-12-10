package stack;

/**A stack of string values.
 * @author zfac237
 *
 */
public class StrStack {
  Stack strStack = new Stack();

  /** Constructor for creating a stack with initial size of 0
   * This initialises an empty stack.
   */
  public StrStack() {
  }

  /** Inserts a entry object to the stack using the push method from stack.
   * @param str object that is being inserted to the stack as an entry.
   */
  public void push(String str) {
    strStack.push(new Entry(str));
  }

  /** Checks if the stack has any values inside it using the isEmpty method from stack.
   * @return boolean true if the object is empty otherwise return false.
   */
  public boolean isEmpty() {
    return strStack.isEmpty();
  }

  /** removes the last value on the stack and converts value to string using getString.
   * @return The last Entry object in the stack.
   * @throws EmptyStackException stack is 0 or below then the stack is empty and you cannot pop.
   */
  public String pop() throws EmptyStackException {
    Entry stringval = strStack.pop();
    return stringval.getString();
  }
}
