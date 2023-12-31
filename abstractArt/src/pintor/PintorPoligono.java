package pintor;

import elementos.ColorIterator;
import elementos.Poligono;

public class PintorPoligono extends Pintor {
	public PintorPoligono(int cantidad, int grosor, Coords coords, ColorIterator colorIterator) {
		for (int i = 0; i < cantidad; i++) {
            int xCoord = generarNumAleatorio(-40, 40); 
            int yCoord = generarNumAleatorio(-40, 40);
            
            coords.setxCoord(coords.getxCoord() + xCoord); 
            coords.setyCoord(coords.getyCoord() + yCoord); 
            
            coords.setxCoord(Math.min(PANEL_X_max - 45, Math.max(PANEL_X_min + 40, coords.getxCoord())));
            coords.setyCoord(Math.min(PANEL_Y_max - 40, Math.max(PANEL_Y_min + 40, coords.getyCoord())));
            
            formas.add(new Poligono(grosor, generarNumAleatorio(3, 7), colorIterator.nextColor(), coords.getxCoord(), coords.getyCoord()));
        }
	}
    
    public String determinarEstilo() {
    	return "poligono";
    }

}
