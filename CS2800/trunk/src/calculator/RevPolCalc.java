package calculator;

import stack.NumStack;

/** Evaluates a string in RPN.
 * @author zfac237
 *
 */
public class RevPolCalc { 
  private CalculatorFactory revPolFact = new CalculatorFactory();
  private NumStack val = new NumStack();
  private NumStack temp = new NumStack();

  /** Class to evaluate the result of operating on a function.
   * @param str to be evaluated. 
   * @return evaluated value.
   */
  public float evaluate(String str) {
    String[] array;
    array = str.split(" ");
    int count = 0;
    while (count < array.length) {
      try {    
        val.push(Float.parseFloat(array[count]));
        count++;
      } catch (Exception e) {
        float topVal = val.pop();
        temp.push(val.pop());
        temp.push(topVal);
        val.push(revPolFact.calculatorEquations(temp,array[count]));
        count++;
      }     
    }
    return val.pop();
  } 
}
