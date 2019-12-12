package calculator;

import standardcalc.StandardCalc;

/**Class that handles what format the equation will be solved.
* @author zfac237
*
*/
public class CalcModel {
  StandardCalc standardCalc = new StandardCalc();
  RevPolCalc revPolCalc = new RevPolCalc();

  /**method evaluates the equation in the chosen methods.
   * @param str that is the equation
   * @param bool which decides whether the equation will be solved in infix or postfix
   * @return the answer of the evaluation
   */
  public float evaluate(String str, boolean bool) {
    if (bool) {
      return standardCalc.evaluate(str);
    } else {
      return revPolCalc.evaluate(str);
    }
  }
}
