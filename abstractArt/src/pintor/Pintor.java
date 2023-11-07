package pintor;

import java.awt.Color;
import java.util.Random;
import java.util.Vector;

public abstract class Pintor {
	// Constantes para el arte en el lienzo
	public static final int PANEL_X_min = 178 + 30;
	public static final int PANEL_X_max = 165 + 846;
	public static final int PANEL_Y_min = 11 + 50;
	public static final int PANEL_Y_max = 20 + 404;
	
	public Coords coords = new Coords(0, 0);
	public Vector<Object> formas = new Vector<>();
	public Vector<Object> obtenerVectorFormas(){
    	return formas;
    }
    
    public void vectorInfo () {
    	for (Object forma : formas) {
    		System.out.println(forma);
    	}
    }
    
    public String determinarEstilo() {
		return null;
	}
    
    public Color generarColorAleatorio() {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256); 
        int blue = rand.nextInt(256);
        return new Color(red, green, blue);
    }
    
    public int generarNumAleatorio(int min, int max) {
        Random rand = new Random();
        int numRandom = rand.nextInt(max - min + 1) + min;
        return numRandom;
    } 
}
