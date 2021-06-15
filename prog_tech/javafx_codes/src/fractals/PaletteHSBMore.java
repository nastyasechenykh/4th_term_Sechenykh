package fractals;

import javafx.scene.paint.Color;

public class PaletteHSBMore implements Palette{
    @Override
    public Color colorize(double v) {
        return Color.hsb(((v * 10) % 1) * 360, 1, 1);
    }
}
