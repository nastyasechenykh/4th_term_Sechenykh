package fractals;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mandelbrot extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Фрактал Мандельброта");
        Parent pic = initInterface();
        primaryStage.setScene(new Scene(pic, 640, 480));
        primaryStage.show();
    }

    private Parent initInterface() {
        return null;
    }
}
