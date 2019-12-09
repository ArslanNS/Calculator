package stack;

import java.util.ArrayList;
import java.util.List;


/** A stack of entry values.
 * @author zfac237
 *
 */
public class Stack {
  int size = 0;
  static List<Entry> entries = new ArrayList<>();

  /** Constructor for creating a stack with initial size of 0
   * This initialises an empty stack.
   */
  public Stack() {
    this.size = 0;
  }

  /** A get method to return the size of the stack.
   * @return An integer that represents the size of the stack
   */
  public int getSize() {
    return this.size;
  }

  /** a set method that sets the size of the stack.
   * @param size Integer value that can modify the private variable size.
   */
  public void setSize(int size) {
    this.size = size;
  }

  /** Checks if the stack has any values inside it.
   * @return boolean true if the object is empty otherwise return false.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /** Inserts a entry object to the stack which also increases the size.
   * @param entry object that is being inserted to the stack.
   */
  public void push(Entry entry) {
    size += 1;
    entries.add(entry);
  }

  /** Returns the last entry in the stack and also removes it.
   * @return The last Entry object in the stack.
   * @throws EmptyStackException stack is 0 or below then the stack is empty and you cannot pop.
   */
  public Entry pop() throws EmptyStackException {
    if (size <= 0) {
      throw new EmptyStackException("Stack is empty");
    } else {
      Entry last = entries.remove(--size);
      return last;
    }
  }

  /** Returns the last entry in the stack but doesn't remove it.
   * @return The last Entry object in the stack
   * @throws EmptyStackException stack is 0 or below then the stack is empty and you cannot pop.
   */
  public Entry top() throws EmptyStackException {
    if (size <= 0) {
      throw new EmptyStackException("Stack is empty");
    } else {
      Entry last = entries.remove(size - 1);
      return last;
    }
  }
}
