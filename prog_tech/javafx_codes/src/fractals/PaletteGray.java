package fractals;

import javafx.scene.paint.Color;

public class PaletteGray implements Palette{
    @Override
    public Color colorize(double v) {
        return Color.gray(v);
    }
}
