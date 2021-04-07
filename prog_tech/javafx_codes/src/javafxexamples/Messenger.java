package javafxexamples;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
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
        ObservableList<String> items = FXCollections.observableArrayList("Петров", "Катюшка", "Бублик", "Васнецов");
        ListView<String> listNames = new ListView<>(items);
        TextField text = new TextField("Введите сообщение");
        Button b = new Button("Отправить");
        TextArea display = new TextArea();

        hBig.getChildren().addAll(vLeft, vRight);
        vLeft.getChildren().addAll(display, hLittle);
        hLittle.getChildren().addAll(text, b);
        vRight.getChildren().addAll(contacts, listNames);

        VBox.setVgrow(display, Priority.ALWAYS);
        HBox.setHgrow(text, Priority.ALWAYS);

        b.setOnAction(event -> {
            display.setText(display.getText() + text.getText() + "\n");
            text.clear();
        });

        return hBig;
    }
}
