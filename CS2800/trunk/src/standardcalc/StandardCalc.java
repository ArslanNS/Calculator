package standardcalc;

import calculator.RevPolCalc;
import stack.OpStack;
import stack.StrStack;
import stack.Symbol;

/** Class that solves an equation using a standard calculator.
 * @author zfac237
 *
 */
public class StandardCalc {

  private StandardSymbols standardSymbols = new StandardSymbols();
  private RevPolCalc revPolCalc = new RevPolCalc();
  private StrStack strStack = new StrStack();
  private OpStack opStack = new OpStack();

  /**Method that evaluates using brackets to give a solution.
   * @param question the equation that needs to be solved.
   * @return float that is the solution to the question.
   */
  public float evaluate(String question) {
    String[] values = question.split(" ");
    for (String str : values) {
      try {
        @SuppressWarnings("unused")
        float val = Float.parseFloat(str);
        strStack.push(str);
      } catch (Exception e) {
        Symbol op = standardSymbols.selector(str);
        if (op.equals(Symbol.PLUS) || op.equals(Symbol.MINUS) 
            || op.equals(Symbol.DIVIDE) || op.equals(Symbol.TIMES)) {
          if (opStack.isEmpty()) {
            opStack.push(op);
          } else {
            while (!opStack.isEmpty() && standardSymbols.symbolPrecedence(op, opStack.top())) {
              strStack.push(opStack.pop().toString());
            }
            opStack.push(op);
          }
        } else if (op.equals(Symbol.LEFT_BRACKET)) {
          opStack.push(op);
        } else if (op.equals(Symbol.RIGHT_BRACKET)) {
          while (!opStack.top().equals(Symbol.LEFT_BRACKET)) {
            strStack.push(opStack.pop().toString());
          }
          opStack.pop();          
        }
      }
    }
    
    while (!opStack.isEmpty()) {
      strStack.push(opStack.pop().toString());
    }    
    StringBuilder sb = new StringBuilder();
    while (!strStack.isEmpty()) {
      String currentVal = strStack.pop();
      if (currentVal.length() > 1) {
        StringBuilder reverseVal = new StringBuilder();
        sb.append(reverseVal.append(currentVal).reverse() + " ");
      } else {
        sb.append(currentVal + " ");
      }
    }
    return revPolCalc.evaluate(sb.reverse().deleteCharAt(0).toString());
  }
}