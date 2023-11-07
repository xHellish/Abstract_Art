package pintor;

import elementos.Lunar;

public class PintorLunares extends Pintor {
	
	//int variableX = generarNumAleatorio(PANEL_X_min, PANEL_X_max);
	//int variableY = generarNumAleatorio(PANEL_Y_min, PANEL_Y_max);
	
	public PintorLunares (int cantidad, int grosor, Coords coords) {
		
		for (int i = 0; i < cantidad; i++) {
            int xCoord = generarNumAleatorio(-40, 40);
            int yCoord = generarNumAleatorio(-40, 40);
            
            coords.setxCoord(coords.getxCoord() + xCoord); 
            coords.setyCoord(coords.getyCoord() + yCoord); 
            
            coords.setxCoord(Math.min(PANEL_X_max, Math.max(PANEL_X_min, coords.getxCoord())));
            coords.setyCoord(Math.min(PANEL_Y_max, Math.max(PANEL_Y_min, coords.getyCoord())));
            
            formas.add(new Lunar(coords.getxCoord(), coords.getyCoord(), grosor, generarColorAleatorio()));
        }
	}
    
    public String determinarEstilo() {
    	return "lunares";
    }
}
