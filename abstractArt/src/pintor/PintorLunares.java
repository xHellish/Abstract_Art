package pintor;

import elementos.Lunar;

public class PintorLunares extends Pintor {
	
	public PintorLunares (int cantidad, int grosor) {
		for (int i = 0; i < cantidad; i++) {
			formas.add(new Lunar(generarNumAleatorio(1, 846), generarNumAleatorio(1, 404), grosor, generarColorAleatorio()));
			// TODO -> coordenadas x , y tienen que ser seguidas
		}
	}
    
    public String determinarEstilo() {
    	return "lunares";
    }
}
