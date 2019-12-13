package gui;

import calculator.CalcModel;

public class Controller {
  ViewInterface myView = null;
  CalcModel calc = new CalcModel();
  
  private void calculateAction() {
    float answer = calc.evaluate(myView.getExpression(), myView.isInfix());
    myView.setAnswer(Float.toString(answer));
  }

  private void changeType(OpType type) {
    myView.setAnswer("Changed to " + type);
  }

  public Controller(ViewInterface view) {
    myView = view;
    view.calcObserver(this::calculateAction);
    view.typeObserver(this::changeType);
  }

}
