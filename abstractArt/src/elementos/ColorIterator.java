package elementos;

import java.awt.Color;

public class ColorIterator {
	private int red;
    private int green;
    private int blue;

    public ColorIterator(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color nextColor() {
        red = (red + 10) % 256;
        return new Color(red, green, blue);
    }
}
