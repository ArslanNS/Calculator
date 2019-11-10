package stack;

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

}