package calculator;

import operation.Addition;
import operation.Divide;
import operation.Multiply;
import operation.Subtract;
import stack.NumStack;

/** Calculates numbers in a stack with a specific operator.
 * @author zfac237
 *
 */
public class CalculatorFactory { 
  
  /** class that operates on two values.
   * @param stack that has values pushed on it.
   * @param str the operator that decides what to do with the values.
   * @return float that is the two values which have been operated on
   */
  public float calculatorEquations(NumStack stack, String str) throws OperatorException {
    if (str.equals("+")) {
      Addition add = new Addition();
      return add.evaluate(stack.pop(), stack.pop());
    } else if (str.equals("-"))  {
      Subtract sub = new Subtract();
      return sub.evaluate(stack.pop(), stack.pop());
    } else if (str.equals("*"))  {
      Multiply times = new Multiply();
      return times.evaluate(stack.pop(), stack.pop());
    } else if (str.equals("/"))  {
      Divide divide = new Divide();
      return divide.evaluate(stack.pop(), stack.pop());
    } else {
      throw new OperatorException("Operator not recognised");
    }
  } 
}
