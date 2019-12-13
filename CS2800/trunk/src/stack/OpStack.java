package stack;

/**A stack of symbol values.
 * @author zfac237
 *
 */
public class OpStack {
  Stack opStack = new Stack();
  int size = 0;

  /** Constructor for creating a stack with initial size of 0
   * This initialises an empty stack.
   */
  public OpStack() {
    opStack = new Stack();
  }

  /** Inserts a Symbol object to the stack using the push method from stack.
   * @param s object that is being inserted to the stack as an entry.
   */
  public void push(Symbol s) {
    opStack.push(new Entry(s));
  }

  /** Checks if the stack has any values inside it using the isEmpty method from stack.
   * @return boolean true if the object is empty otherwise return false.
   */
  public boolean isEmpty() {
    return opStack.isEmpty();
  }

  /** removes the last value on the stack and converts value to string using getSymbol.
   * @return The last Entry object in the stack.
   * @throws EmptyStackException stack is 0 or below then the stack is empty and you cannot pop.
   */
  public Symbol pop() throws EmptyStackException {
    Entry symbolval = opStack.pop();
    return symbolval.getSymbol();
  }
  
  /** returns the last value on the stack and converts value to string using getSymbol.
   * @return The last Entry object in the stack.
   * @throws EmptyStackException stack is 0 or below then the stack is empty and you cannot pop.
   */
  public Symbol top() throws EmptyStackException {
    Entry symbolval = opStack.top();
    return symbolval.getSymbol();
  }
}

 