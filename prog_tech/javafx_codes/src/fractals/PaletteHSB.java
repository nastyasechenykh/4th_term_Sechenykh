package fractals;

import javafx.scene.paint.Color;

public class PaletteHSB implements Palette{
    @Override
    public Color colorize(double v) {
        return Color.hsb(v * 360, 1, 1);
    }
}
