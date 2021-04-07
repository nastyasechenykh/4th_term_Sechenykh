package javafxexamples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

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
        Label cpsLabel = new Label("Радиус");
        Circle circle = new Circle(25);

        main.getChildren().addAll(left, display);
        left.getChildren().addAll(sliderLabel, slider, cpfLabel, cp1, cpsLabel, cp2);
        display.getChildren().add(circle);

        HBox.setHgrow(display, Priority.ALWAYS);


        circle.setCenterX(250); //display.getWidth()/2
        circle.setCenterY(150); //display.getHeight()/2
        left.setAlignment(Pos.TOP_CENTER);

        slider.addEventHandler(ActionEvent.ACTION, e -> circle.setRadius(slider.getValue()));
        cp1.setOnAction(event -> circle.setFill(cp1.getValue()));
        cp2.setOnAction(event -> display.setBackground(new Background(new BackgroundFill(cp2.getValue(), new CornerRadii(0), null))));

        return main;
    }
}
