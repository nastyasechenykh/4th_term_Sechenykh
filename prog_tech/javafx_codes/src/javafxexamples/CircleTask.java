package javafxexamples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

import static javafx.beans.binding.Bindings.min;

public class CircleTask extends Application {
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
        Slider slider = new Slider(0, 100, 55);
        ColorPicker cp1 = new ColorPicker();
        ColorPicker cp2 = new ColorPicker();
        Label sliderLabel = new Label("Радиус");
        Label cpfLabel = new Label("Цвет круга");
        Label cpsLabel = new Label("Цвет поля");
        Circle circle = new Circle(25);

        main.getChildren().addAll(left, display);
        left.getChildren().addAll(sliderLabel, slider, cpfLabel, cp1, cpsLabel, cp2);
        display.getChildren().add(circle);

        HBox.setHgrow(display, Priority.ALWAYS);


        left.setAlignment(Pos.TOP_CENTER);
        display.setMaxWidth(Double.MAX_VALUE);
        display.setMaxHeight(Double.MAX_VALUE);

        circle.radiusProperty().bind(slider.valueProperty());
        circle.centerXProperty().bind(display.widthProperty().divide(2));
        circle.centerYProperty().bind(display.heightProperty().divide(2));
        slider.maxProperty().bind(min(display.heightProperty(), display.widthProperty()).divide(2));
        cp1.setOnAction(event -> circle.setFill(cp1.getValue()));
        cp2.setOnAction(event -> display.setBackground(new Background(new BackgroundFill(cp2.getValue(), new CornerRadii(0), null))));

        return main;
    }
}
