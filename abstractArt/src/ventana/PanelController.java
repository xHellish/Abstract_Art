package ventana;

import java.util.Random;
import pintor.*;

public class PanelController {
	
	Random random = new Random();
	private PanelModel modelo;
	private PanelView vista;
	
	public PanelController (PanelModel modelo, PanelView vista) {
		this.modelo = modelo;
		this.vista = vista;
		initEventHandlers();
	}
	
	private void initEventHandlers() {
		vista.getBtnPintar().addActionListener(e -> handlePintarClick());;
		vista.getBtnLimpiar().addActionListener(e -> handleLimpiarClick());
	}
	
	// Handlers
	private void handlePintarClick() {
		if (!vista.getTextField().getText().trim().isEmpty()) {
			for (int i = 0; i < Integer.parseInt(vista.getTextField().getText()); i++) {
				modelo.agregarPintor(pintorRandom());
			}
			for (Pintor pintor : modelo.getPintores()) {
				for (Object forma : pintor.obtenerVectorFormas()) {
					vista.agregarForma(forma);
				}
				//System.out.println("Tipo: " + pintor.determinarEstilo());
				//pintor.vectorInfo();
			}
		}
		//modelo.imprimirPintores();
		modelo.limpiarPintores();
	}
	
	public void handleLimpiarClick() {
		vista.limpiarLienzo();
	}
	
	// Generar pintor random
	private Pintor pintorRandom() {
		int numeroAleatorio = random.nextInt(3);
		int grosor = random.nextInt(20) + 1;
		int elementos = Integer.parseInt(vista.getElementos().getText()); 
		//System.out.println(numeroAleatorio);
		if (numeroAleatorio == 0) {
			return new PintorLunares(elementos, grosor);
		} else if (numeroAleatorio == 1) {
			return new PintorPoligono(elementos, grosor);
		} else {
			return new PintorRayas(elementos, grosor);
		}
	}
}
