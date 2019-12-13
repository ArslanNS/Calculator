package gui;

import calculator.CalcModel;

import java.util.Scanner;

import java.util.function.Consumer;


/** Class that allows you to use calculator in console.
 * @author zfac237
 *
 */
public class AsciiView implements ViewInterface {
  private String question;
  Observer observer = null;
  Consumer<OpType> changeType = null;
  CalcModel calcModel = new CalcModel();

  /** menu method that runs the Ascii view.
   * checks what letter the user has entered and responds accordingly.
   */
  public void menu() {
    Scanner scanner = new Scanner(System.in);
    boolean done = false;
    boolean infix = true;
    instructions();

    // The order of these checks is critical because hasNext blocks
    while (!done && scanner.hasNextLine()) {
      String str = scanner.nextLine();
      if (str.substring(0,1).matches("i|I") && changeType != null) {
        changeType.accept(OpType.INFIX);
        infix = isInfix();
      } else if (str.substring(0,1).matches("p|P") && changeType != null) {
        changeType.accept(OpType.POSTFIX);
        infix = isInfix();
      } else if (str.substring(0,1).matches("q|Q")) {
        question = str.substring(2);
        System.out.println("Question set to: " + question);
      } else if (str.substring(0,1).matches("c|C")) {
        setAnswer(Float.toString(calcModel.evaluate(question, infix)));
      } else if (str.substring(0,1).matches("h|H")) {
        help();
      } else if (str.substring(0,1).matches("e|E")) {
        System.out.print("exiting...");
        done = true;
      }
    } 
    scanner.close();
  }

  /** method that prints instructions.
   * 
   */
  private void instructions() {
    System.out.println("Use one of the following:");
    System.out.println("  Q - to set expression");
    System.out.println("  P - to change to postfix");
    System.out.println("  I - to change to infix");
    System.out.println("  C - to calculate");
    System.out.println("  H - for help");
    System.out.println("  E - to exit");
  }
  
  /** method that prints the instruction along with a useful tip.
   * 
   */
  private void help() {
    System.out.println("Use one of the following:");
    System.out.println("  Q - to set expression");
    System.out.println("  P - to change to postfix");
    System.out.println("  I - to change to infix");
    System.out.println("  C - to calculate");
    System.out.println("  E - to exit");
    System.out.println("To enter a question, enter 'Q' then a space then the expression.");
  }

  public void calcObserver(Observer o) {
    observer = o;
  }

  public void typeObserver(Consumer<OpType> c) {
    changeType = c;
  }

  public String getExpression() {
    return question;
  }

  public void setAnswer(String a) {
    System.out.println(a);
  }

  @Override
  public boolean isInfix() {
    if (changeType.equals(OpType.INFIX)) {
      return true;
    } else {
      return false;
    }
  }
}