package stack;

public class NumStack {
  private int size = 0;
  Stack numStack = new Stack();

  public NumStack() {
    this.size = 0;
  }

  public void push(float f) {
    numStack.push(new Entry(f));
  }

  public boolean isEmpty() {
    return numStack.isEmpty();
  }

  public float pop() {
    Entry floatval = numStack.pop();
    return floatval.getFloat();
  }
}