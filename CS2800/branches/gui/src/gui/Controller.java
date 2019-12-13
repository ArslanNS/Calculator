package gui;

import calculator.CalcModel;

/** Class that follows instructions from events.
 * @author zfac237
 *
 */
public class Controller {
  ViewInterface myView = null;
  CalcModel calc = new CalcModel();
  
  /** method calculates the equation.
   * It takes in the expression and where the user has selected infix.
   * then sets the answer to what the evaluate method returns.
   */ 
  private void calculateAction() {
    float answer = calc.evaluate(myView.getExpression(), myView.isInfix());
    myView.setAnswer(Float.toString(answer));
  }

  /** Changes the display box to show that the type has changed.
   * @param type can be either infix or postfix dependent on what the user has selected.
   */
  private void changeType(OpType type) {
    myView.setAnswer("Changed to " + type);
  }

  /** Constructor that creates an interface to work with.
   * @param view to refer to and work with.
   */
  public Controller(ViewInterface view) {
    myView = view;
    view.calcObserver(this::calculateAction);
    view.typeObserver(this::changeType);
  }

}
