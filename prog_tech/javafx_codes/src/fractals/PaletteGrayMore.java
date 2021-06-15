package fractals;

import javafx.scene.paint.Color;

public class PaletteGrayMore implements Palette{
    @Override
    public Color colorize(double v) {
        return Color.gray((v * 10) % 1);
    }
}
