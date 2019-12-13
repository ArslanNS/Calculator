package calculator;

/** Exception for when the operator input is not recognised.
 * @author zfac237
 *
 */
@SuppressWarnings("serial")
public class OperatorException extends RuntimeException {
  /**  The exception message displayed.
   * @param msg the string message being displayed for the exception being dealt with.
   */
  public OperatorException(String msg) {
    super(msg);
  }
}
