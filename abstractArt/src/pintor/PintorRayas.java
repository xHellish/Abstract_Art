package pintor;

import elementos.Raya;

public class PintorRayas extends Pintor {
	
	//int variableX = generarNumAleatorio(PANEL_X_min, PANEL_X_max);
	//int variableY = generarNumAleatorio(PANEL_Y_min, PANEL_Y_max);
	
	public PintorRayas (int cantidad, int grosor, Coords coords) {
		for (int i = 0; i < cantidad; i++) {
            int xCoord1 = generarNumAleatorio(-20, 20); 
            int yCoord1 = generarNumAleatorio(-20, 20); 
            int xCoord2 = generarNumAleatorio(-100, 100); 
            int yCoord2 = generarNumAleatorio(-100, 100); 
            
            coords.setxCoord(coords.getxCoord() + xCoord1); 
            coords.setyCoord(coords.getyCoord() + yCoord1);
            
            int xEnd = coords.getxCoord() + xCoord2;
            int yEnd = coords.getyCoord() + yCoord2;
            
            coords.setxCoord(Math.min(PANEL_X_max, Math.max(PANEL_X_min, coords.getxCoord())));
            coords.setyCoord(Math.min(PANEL_Y_max, Math.max(PANEL_Y_min, coords.getyCoord())));
            
            xEnd = Math.min(PANEL_X_max, Math.max(PANEL_X_min, xEnd));
            yEnd = Math.min(PANEL_Y_max, Math.max(PANEL_Y_min, yEnd));
            
            formas.add(new Raya(coords.getxCoord(), coords.getyCoord(), xEnd, yEnd, grosor, generarColorAleatorio()));
        }
	}
	
    public String determinarEstilo() {
    	return "rayas";
    }

}
