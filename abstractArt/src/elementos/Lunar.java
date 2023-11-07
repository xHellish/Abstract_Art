package elementos;

import java.awt.Color;
import java.awt.Graphics;

public class Lunar {
	
	private int x;
    private int y;
    private int radio;
    private Color color;

    public Lunar(int x, int y, int radio, Color color) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
    }
}
