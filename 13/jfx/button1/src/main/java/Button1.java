// JavaFX event handling using an inner class

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Button1 extends Application {

  class Handler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
      Alert alert = new Alert(AlertType.INFORMATION);
      alert.setHeaderText("Button clicked!");
      alert.show();
    }
  }

  @Override public void start(Stage primaryStage) {
    Button button = new Button("Click Me!");
    button.setStyle("-fx-font: 22 arial;");

    button.setOnAction(new Handler());

    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    pane.getChildren().add(button);

    Scene scene = new Scene(pane, 250, 85);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Button1");
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
