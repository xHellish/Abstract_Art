package pintor;

import elementos.Poligono;

public class PintorPoligono extends Pintor {
	
	public PintorPoligono(int cantidad, int grosor) {
		for (int i = 0; i < cantidad; i++) {
			formas.add(new Poligono(grosor, generarNumAleatorio(3, 7), generarColorAleatorio(), generarNumAleatorio(PANEL_X_min + 40, PANEL_X_max - 45), generarNumAleatorio(PANEL_Y_min + 40, PANEL_Y_max - 40)));
			// TODO -> coordenadas x , y tienen que ser seguidas
		}
		
	}
    
    public String determinarEstilo() {
    	return "poligono";
    }

}
