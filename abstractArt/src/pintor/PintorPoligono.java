package pintor;

import elementos.Poligono;

public class PintorPoligono extends Pintor {
	
	public PintorPoligono(int cantidad, int grosor) {
		for (int i = 0; i < cantidad; i++) {
			formas.add(new Poligono(grosor, generarNumAleatorio(3, 6), generarColorAleatorio()));
			// TODO -> coordenadas x , y tienen que ser seguidas
		}
		
	}
    
    public String determinarEstilo() {
    	return "poligono";
    }

}
