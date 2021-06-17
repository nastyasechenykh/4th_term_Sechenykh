package javafxexamples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class Exam extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Эффект Струпа");
        Parent window = initInterface();
        primaryStage.setScene(new Scene(window));
        primaryStage.show();
    }

    private Parent initInterface() {
        GridPane win = new GridPane();
        VBox colors = new VBox();
        Button addButton = new Button("Добавить");
        Label text1 = new Label("Синий");
        Label text2 = new Label("Желтый");
        Label text3 = new Label("Фиолетовый");
        Label text4 = new Label("Черный");
        Rectangle rec1 = new Rectangle(100, 25);
        Rectangle rec2 = new Rectangle(100, 25);
        final Random random = new Random();

        colors.getChildren().addAll(text1, text2, text3, rec1, text4, rec2);
        win.add(colors, 0,1);
        win.add(addButton, 1,0);

        win.setStyle("-fx-font-size: 2em; -fx-font-weight: bold");
        rec1.setFill(Color.BLUE);
        rec2.setFill(Color.PINK);
        text1.setStyle("-fx-text-fill: pink");
        text2.setStyle("-fx-text-fill: green");
        text3.setStyle("-fx-text-fill: orange");
        text4.setStyle("-fx-text-fill: red");

        colors.setAlignment(Pos.TOP_CENTER);
        colors.setPadding(new Insets(0, 20, 40, 20));
        addButton.setAlignment(Pos.BOTTOM_CENTER);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(Priority.ALWAYS);
        win.getColumnConstraints().add(col1);

        addButton.setOnAction(actionEvent ->{
            boolean value = random.nextBoolean();
            if (value)
            if (colors.getChildren().size() > 10) colors.getChildren().remove(0);
            //colors.getChildren().add();
        });

        return win;
    }
}
