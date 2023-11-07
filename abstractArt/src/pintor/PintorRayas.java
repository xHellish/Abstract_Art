package pintor;

import elementos.Raya;

public class PintorRayas extends Pintor {
	
	public PintorRayas (int cantidad, int grosor) {
		for (int i = 0; i < cantidad; i++) {
			formas.add(new Raya(generarNumAleatorio(PANEL_X_min, PANEL_X_max), generarNumAleatorio(PANEL_Y_min, PANEL_Y_max), generarNumAleatorio(PANEL_X_min, PANEL_X_max), generarNumAleatorio(PANEL_Y_min, PANEL_Y_max), grosor, generarColorAleatorio()));
			// TODO -> coordenadas x , y tienen que ser seguidas
		}
	}
    
    public String determinarEstilo() {
    	return "rayas";
    }

}
