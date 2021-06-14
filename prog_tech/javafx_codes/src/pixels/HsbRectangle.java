package pixels;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HsbRectangle extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Рисуем разноцветный прямоугольник");
        Parent root = initInterface();
        primaryStage.setScene(new Scene(root, 480, 320));
        primaryStage.show();
    }

    private Parent initInterface() {
        WritableImage writableFigures = new WritableImage(500, 300);
        ImageView figuresView = new ImageView(writableFigures);
        final PixelWriter figureWriter = writableFigures.getPixelWriter();
        figuresView.setX(50);
        figuresView.setY(50);

        for (int x = 0; x < 360; x++) {
            for (int y = 0; y < 100; y++) {
                figureWriter.setColor(x, y, Color.hsb(x, y/99, 1.0));
                for (int k = 100; k >= 0; k--) {
                    figureWriter.setArgb(x, 0, 0xFF000000);
                    figureWriter.setArgb(0, y, 0xFF000000);
                    figureWriter.setArgb(x, 100, 0xFF000000);
                    figureWriter.setArgb(360, k, 0xFF000000);
                }
            }
        }

        Pane panelForImages = new Pane();
        panelForImages.getChildren().add(figuresView);
        return panelForImages;
    }
}
