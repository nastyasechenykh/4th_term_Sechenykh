package javafxexamples;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        HBox hBig = new HBox();
        VBox vLeft = new VBox();
        HBox hLittle = new HBox();
        VBox vRight = new VBox();
        Label contacts = new Label("Контакты");
        ListView<String> listNames = new ListView<>();
        TextField text = new TextField("Введите сообщение");
        Button b = new Button("Отправить");
        TextArea display = new TextArea();

        hBig.getChildren().addAll(vLeft, vRight);
        vLeft.getChildren().addAll(display, hLittle);
        hLittle.getChildren().addAll(text, b);
        vRight.getChildren().addAll(contacts, listNames);


        return hBig;
    }
}
