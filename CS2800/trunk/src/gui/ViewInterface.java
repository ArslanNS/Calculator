package gui;

import java.util.function.Consumer;

public interface ViewInterface {
  
  public String getExpression();
  
  public boolean isInfix();
  
  public void setAnswer(String s);
  
  public void typeObserver(Consumer<OpType> consumer);
  
  public void calcObserver(Observer observer);
  
  
  
}
