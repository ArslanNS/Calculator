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


public class GuiController implements ViewInterface {
  public void calcObserver(Observer observer) {
    calculate.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        observer.update();
      }
    });
  }

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

  public String getExpression() {
    return equation.getText();
  }

  public void setAnswer(String a) {
    answer.setText(a);
  }
  
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
