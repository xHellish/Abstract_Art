package elementos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Poligono {
	private int grosor;
    private int cantidadLados;
    private Path2D.Double path;
    private List<Point2D.Double> vertices;
    private Color color;

    public Poligono(int grosor, int cantidadLados, Color color, int xCentro, int yCentro) {
        this.grosor = grosor;
        this.cantidadLados = cantidadLados;
        this.color = color;
        
        path = new Path2D.Double();
        vertices = new ArrayList<>();
  
        double radio = 50.0; 
        double centroX = xCentro; 
        double centroY = yCentro; 
        
        for (int i = 0; i < cantidadLados; i++) {
            double angulo = 2 * Math.PI * i / cantidadLados;
            double x = centroX + radio * Math.cos(angulo);
            double y = centroY + radio * Math.sin(angulo);
            vertices.add(new Point2D.Double(x, y));
        }
        
        path.moveTo(vertices.get(0).getX(), vertices.get(0).getY());
        for (int i = 1; i < vertices.size(); i++) {
            path.lineTo(vertices.get(i).getX(), vertices.get(i).getY());
        }
        path.closePath();
    }

    public void dibujar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(grosor));
        g2d.draw(path);
    }
}
