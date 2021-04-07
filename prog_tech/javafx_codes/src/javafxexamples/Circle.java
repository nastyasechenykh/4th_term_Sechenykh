package javafxexamples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Circle extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Прикольчики с кругом");

        Parent ui = createInterface();
        primaryStage.setScene(new Scene(ui, 640, 320));
        primaryStage.show();
    }

    private Parent createInterface() {
        HBox main = new HBox();
        VBox left = new VBox();
        Pane display = new Pane();
        Slider slider = new Slider(1, 10, 5);
        ColorPicker cp1 = new ColorPicker();
        ColorPicker cp2 = new ColorPicker();
        Label sliderLabel = new Label("Радиус");
        Label cpfLabel = new Label("Цвет круга");
        Label cpsLabel = new Label("Радиус");
        //Circle circle = new Circle();

        //display.getChildren().add(circle);
        main.getChildren().addAll(left, display);
        left.getChildren().addAll(sliderLabel, slider, cpfLabel, cp1, cpsLabel, cp2);



        left.setAlignment(Pos.TOP_CENTER);

        return main;
    }
}
