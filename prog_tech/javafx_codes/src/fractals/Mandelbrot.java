package fractals;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Mandelbrot extends Application {
    int w = 640;
    int h = 480;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Фрактал Мандельброта");
        Parent pic = initInterface();
        primaryStage.setScene(new Scene(pic, w, h));
        primaryStage.show();
    }

    private Parent initInterface() {
        WritableImage writableFigures = new WritableImage(w, h);
        ImageView figuresView = new ImageView(writableFigures);
        final PixelWriter figureWriter = writableFigures.getPixelWriter();

        for (int x = 0; x < w; x++){
            for (int y = 0; y < h; y++){
                //int k = ;
            }
        }

        Pane panelForImages = new Pane();
        panelForImages.getChildren().add(figuresView);
        return panelForImages;
    }
}
