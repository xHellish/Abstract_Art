package pintor;

import elementos.Lunar;

public class PintorLunares extends Pintor {
	
	public PintorLunares (int cantidad, int grosor) {
		for (int i = 0; i < cantidad; i++) {
			formas.add(new Lunar(generarNumAleatorio(PANEL_X_min, PANEL_X_max), generarNumAleatorio(PANEL_Y_min, PANEL_Y_max), grosor, generarColorAleatorio()));
			// TODO -> coordenadas x , y tienen que ser seguidas
		}
	}
    
    public String determinarEstilo() {
    	return "lunares";
    }
}
