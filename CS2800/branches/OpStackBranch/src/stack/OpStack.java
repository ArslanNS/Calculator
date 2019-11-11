package stack;

public class OpStack {
  private int size = 0;
  Stack opStack = new Stack();

  public OpStack() {
    this.size = 0;
  }

  public void push(Symbol s) {
    opStack.push(new Entry(s));
  }

  public boolean isEmpty() {
    return opStack.isEmpty();
  }

  public Symbol pop() {
    Entry floatval = opStack.pop();
    return floatval.getSymbol();
  }
}