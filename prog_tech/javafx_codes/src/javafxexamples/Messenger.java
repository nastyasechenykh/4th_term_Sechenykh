package javafxexamples;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Messenger extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Messenger App");

        Parent ui = createInterface();
        primaryStage.setScene(new Scene(ui, 640, 320));
        primaryStage.show();
    }

    private Parent createInterface() {
        GridPane field = new GridPane();
        HBox hBig = new HBox();
        VBox vLeft = new VBox();
        HBox hLittle = new HBox();
        VBox vRight = new VBox();
        Label contacts = new Label("Контакты");

        field.add(hBig, 0, 0);
        hBig.getChildren().addAll(vLeft, vRight);
        vLeft.getChildren().add(hLittle);


        return field;
    }
}
