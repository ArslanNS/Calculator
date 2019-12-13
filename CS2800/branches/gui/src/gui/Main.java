package gui;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
  static ViewInterface view;
  static Parent root; 
  static FXMLLoader loader;
  
 
  
  @Override
  public void start(Stage primaryStage) throws Exception {
   
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();

  }


  public static void main(String[] args) throws IOException {
    loader = new FXMLLoader(Main.class.getResource("Gui.fxml"));
    root = loader.load();
    view = loader.getController();
    new Controller(view);
    launch(args);
    
  }
}
