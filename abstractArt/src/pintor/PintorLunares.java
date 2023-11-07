package pintor;

import elementos.ColorIterator;
import elementos.Lunar;

public class PintorLunares extends Pintor {
	public PintorLunares (int cantidad, int grosor, Coords coords, ColorIterator colorIterator) {
		for (int i = 0; i < cantidad; i++) {
            int xCoord = generarNumAleatorio(-40, 40);
            int yCoord = generarNumAleatorio(-40, 40);
            
            coords.setxCoord(coords.getxCoord() + xCoord); 
            coords.setyCoord(coords.getyCoord() + yCoord); 
            coords.setxCoord(Math.min(PANEL_X_max, Math.max(PANEL_X_min, coords.getxCoord())));
            coords.setyCoord(Math.min(PANEL_Y_max, Math.max(PANEL_Y_min, coords.getyCoord())));
            
            formas.add(new Lunar(coords.getxCoord(), coords.getyCoord(), grosor, colorIterator.nextColor()));
        }
	}
    public String determinarEstilo() {
    	return "lunares";
    }
}
