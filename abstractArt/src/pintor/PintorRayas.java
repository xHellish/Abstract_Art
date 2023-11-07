package pintor;

import elementos.Raya;

public class PintorRayas extends Pintor {
	
	public PintorRayas (int cantidad, int grosor) {
		for (int i = 0; i < cantidad; i++) {
			formas.add(new Raya(generarNumAleatorio(1, 846), generarNumAleatorio(1, 404), generarNumAleatorio(1, 846), generarNumAleatorio(1, 404), grosor, generarColorAleatorio()));
			// TODO -> coordenadas x , y tienen que ser seguidas
		}
	}
    
    public String determinarEstilo() {
    	return "rayas";
    }

}
