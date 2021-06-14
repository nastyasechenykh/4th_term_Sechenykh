package pixels;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CircleIn extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Рисуем круг в квадрате");
        Parent root = initInterface();
        primaryStage.setScene(new Scene(root, 480, 320));
        primaryStage.show();
    }

    private Parent initInterface() {
        WritableImage writableFigures = new WritableImage(200, 200);
        ImageView figuresView = new ImageView(writableFigures);
        final PixelWriter figureWriter = writableFigures.getPixelWriter();
        figuresView.setX(50);
        figuresView.setY(50);

        for (int x = 0; x < 200; x++) {
            for (int y = 0; y < 200; y++) {
                if ((x - 100) * (x - 100) + (y - 100) * (y - 100) > 80 * 80) figureWriter.setArgb(x, y, 0xFFFFFFFF);
                else figureWriter.setArgb(x, y, 0xFF800080);
                for (int k = 199; k >= 0; k--) {
                    figureWriter.setArgb(x, 0, 0xFF800080);
                    figureWriter.setArgb(0, y, 0xFF800080);
                    figureWriter.setArgb(x, 199, 0xFF800080);
                    figureWriter.setArgb(199, k, 0xFF800080);
                }
            }
        }

        Pane panelForImages = new Pane();
        panelForImages.getChildren().add(figuresView);
        return panelForImages;
    }
}
