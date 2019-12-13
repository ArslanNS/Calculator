package gui;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Class that runs the javafx program.
 * @author zfac237
 *
 */
public class Main extends Application {
  static ViewInterface view;
  static Parent root; 
  static FXMLLoader loader;
  
  /** Set the and the window.
   *  then shows the stage that the user will work in.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
   
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();

  }
  
  /** main methods that is run to run the program and methods.
   * @param args arguments that are run.
   * @throws IOException when the input can be incorrect.
   */
  public static void main(String[] args) throws IOException {
    loader = new FXMLLoader(Main.class.getResource("Gui.fxml"));
    root = loader.load();
    view = loader.getController();
    new Controller(view);
    launch(args);
    
  }
}
