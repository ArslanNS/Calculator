package operation;

/**Class to add float values.
 * @author zfac237
 *
 */
public class Addition implements Calculator {
  
  /** evaluate method to add two float values together.
   * @paramf1 
   * @paramf2
   * @return float that is f1 and f2 added together
   */
  public float evaluate(float f1, float f2) {
    return f1 + f2;
  }
}
