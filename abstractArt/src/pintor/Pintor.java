package pintor;

import java.awt.Color;
import java.util.Random;
import java.util.Vector;

public abstract class Pintor {
	
	public Vector<Object> formas = new Vector<>();
	
    public String determinarEstilo() {
		return null;
	}
    
    protected void pintarLunares(int cantidad, Color color, int tamano) {
    	
    }
    void pintarRayas(int lados, Color color, int tamano) {
    	
    }
    void pintarPoligono(int cantidad, Color color, int grosor) {
    	
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
    
    public Vector<Object> obtenerVectorFormas(){
    	return formas;
    }
    
    public void vectorInfo () {
    	for (Object forma : formas) {
    		System.out.println(forma);
    	}
    }
}