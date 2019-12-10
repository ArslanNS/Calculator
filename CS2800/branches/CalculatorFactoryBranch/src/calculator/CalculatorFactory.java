package calculator;

import operation.Addition;
import stack.NumStack;

public class CalculatorFactory {
  
  /** class that operates on two values.
   * @param stack that has values pushed on it.
   * @param str the operator that decides what to do with the values.
   * @return float that is the two values which have been operated on
   */
  public float calculatorEquations(NumStack stack, String str) {
    if (str == "+") {
      Addition add = new Addition();
      return add.evaluate(stack.pop(), stack.pop());
    } else {
      return 0;
    }
  } 
}
