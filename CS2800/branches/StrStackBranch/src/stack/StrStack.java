package stack;

public class StrStack {
  private int size = 0;
  Stack strStack = new Stack();

  public StrStack() {
    this.size = 0;
  }

  public void push(String str) {
    strStack.push(new Entry(str));
  }

  public boolean isEmpty() {
    return strStack.isEmpty();
  }

  public String pop() {
    Entry stringval = strStack.pop();
    return stringval.getString();
  }
}
