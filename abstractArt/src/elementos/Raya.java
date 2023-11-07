package elementos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Raya {
	
	private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int grosor;
    private Color color;
    
    public Raya(int x1, int y1, int x2, int y2, int grosor, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.grosor = grosor;
        this.color = color;
    }

    public void dibujar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(grosor));
        g2d.draw(new Line2D.Double(x1, y1, x2, y2));
    }

}
