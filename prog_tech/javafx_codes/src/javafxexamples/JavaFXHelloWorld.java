package javafxexamples;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXHelloWorld extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello, goddamn JavaFX");

        Button button = initInterface();
        stage.setScene(new Scene(button, 640, 480));

        stage.show();
    }

    private Button initInterface() {
        Button PressMe = new Button("Click me");
        PressMe.setOnAction(e -> System.out.println("Don't touch me"));
        return PressMe;
    }
}
