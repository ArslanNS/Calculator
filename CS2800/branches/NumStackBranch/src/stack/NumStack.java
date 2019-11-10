package stack;

import java.util.ArrayList;
import java.util.List;

public class NumStack {
  private int size = 0;
  Stack numStack = new Stack();

  public NumStack() {
    this.size = 0;
  }

  public void push(float f) {
    size += 1;
    numStack.push(new Entry(f));
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public Entry pop() {
    if (size <= 0) {
      throw new EmptyStackException("Stack is empty");
    } else {
      Entry last = Stack.entries.remove(--size);
      return last;
    } 
  }
}