package gui;

import java.util.function.Consumer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;


/** Class to handle events.
 * @author zfac237
 *
 */
public class GuiController implements ViewInterface {
  
  /** Checks if a new action has happened
   * then updates the observer.
   */
  public void calcObserver(Observer observer) {
    calculate.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        observer.update();
      }
    });
  }

  /** toggles between INFIX and POSTFIX.
   *
   */
  public void typeObserver(Consumer<OpType> consumer) {
    postOrIn.selectedToggleProperty().addListener(
        new ChangeListener<Toggle>() {
          @Override
          public void changed(ObservableValue<? extends Toggle> observable,
              Toggle from, Toggle to) {
            consumer.accept(to == infixButton ? OpType.INFIX : OpType.POSTFIX);
          }
        });
  }

  /** returns the expression TextField variable to what the user input.
   *
   */
  public String getExpression() {
    return equation.getText();
  }

  /** sets the answer TextField variable to what was calculated.
   * it is then displayed in the TextField.
   */
  public void setAnswer(String a) {
    answer.setText(a);
  }
  
  /** checks whether the infix button is selected.
   * if it is then returns true.
   */
  @Override
  public boolean isInfix() {
    if (infixButton.isSelected()) {
      return true;
    } else {
      return false;
    }
  }
  
  
  @FXML
    private TextField equation;

  @FXML
    private TextField answer;

  @FXML
    private RadioButton infixButton;

  @FXML
    private ToggleGroup postOrIn;

  @FXML
    private RadioButton postfixButton;

  @FXML
    private Button calculate;



  
}
