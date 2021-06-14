package javafxexamples;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MessengerGrid extends Application
{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MessengerGrid");

        Parent window = createWindow();
        primaryStage.setScene(new Scene(window, 640,320));
        primaryStage.show();
    }

    private Parent createWindow() {
        GridPane win = new GridPane();
        Label contacts = new Label("Контакты");
        ObservableList<String> items = FXCollections.observableArrayList("Петров", "Катюшка", "Бублик", "Васнецов");
        ListView<String> listNames = new ListView<>(items);
        TextField text = new TextField("Введите сообщение");
        Button b = new Button("Отправить");
        TextArea display = new TextArea();

        win.add(display, 0, 0, 2, 2);
        win.add(text, 0, 2, 1, 1);
        win.add(b, 1,2);
        win.add(contacts, 3,0);
        win.add(listNames, 3,1);

        ColumnConstraints c1 = new ColumnConstraints();
        RowConstraints r1 = new RowConstraints();
        c1.setHgrow(Priority.ALWAYS);
        r1.setVgrow(Priority.ALWAYS);
        win.getColumnConstraints().add(c1);
        win.getRowConstraints().add(r1);

        win.setStyle("-fx-font-size: 1em");

        return win;
    }
}
