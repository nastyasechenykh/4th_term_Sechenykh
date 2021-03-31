package javafxexamples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListenersExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Пример про слушателей");

        Parent ui = createInterface();
        primaryStage.setScene(new Scene(ui, 300, 300));

        primaryStage.show();
    }

    private Parent createInterface() {
        GridPane newPane = new GridPane();
        VBox vb = new VBox();
        Label label1 = new Label("Не жми ниже");
        Button b = new Button("Кнопочка, которую не надо нажимать");
        String[] phrases = {"Не нажимай больше на эту кнопку", "Я просил, больше не нажимай", "Ты нарываешься", "Это было последнее предупреждение"};

        newPane.add(vb, 0, 0);
        vb.getChildren().addAll(label1, b);
        VBox.setMargin(vb.getChildren().get(0),
                new Insets(8) // отступы со всех сторон
        );


        b.setOnAction(new EventHandler<>() {
            int i = 0;

            @Override
            public void handle(ActionEvent event) {
                if (i == phrases.length) {
                    vb.getChildren().clear();
                    vb.getChildren().add(new ImageView(new Image("https://i.gifer.com/origin/00/00ae53a95ee7af0be395f5291d792c9a.gif")));
                } else label1.setText(phrases[i++]);
            }
        });

        return newPane;
    }
}
