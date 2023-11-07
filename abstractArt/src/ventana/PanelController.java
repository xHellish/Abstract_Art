package ventana;

import java.util.Random;
import javax.swing.Timer;

import elementos.ColorIterator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pintor.*;

public class PanelController {
	//Constantes de las coords en el lienzo
	public static final int PANEL_X_min = 178 + 30;
	public static final int PANEL_X_max = 165 + 846;
	public static final int PANEL_Y_min = 11 + 50;
	public static final int PANEL_Y_max = 20 + 404;
	
	Random random = new Random();
	private PanelModel modelo;
	private PanelView vista;
	
	public PanelController (PanelModel modelo, PanelView vista) {
		this.modelo = modelo;
		this.vista = vista;
		initEventHandlers();
		handleGammaClick();
	}
	
	private void initEventHandlers() {
		vista.getBtnPintar().addActionListener(e -> handlePintarClick());;
		vista.getBtnLimpiar().addActionListener(e -> handleLimpiarClick());
		vista.getBtnCambiarGamma().addActionListener(e -> handleGammaClick());
	}
	
	//Handlers
	private void handlePintarClick() {
		if (!vista.getTextField().getText().trim().isEmpty()) {
	        int cantidadFormas = Integer.parseInt(vista.getTextField().getText());

	        for (int i = 0; i < cantidadFormas; i++) {
	            modelo.agregarPintor(pintorRandom());
	        }
	        
	        //Actualizar el lienzo por cada pintor por medio de un Timer
	        Timer timer = new Timer(300, new ActionListener() {
	            private int currentIndex = 0;

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (currentIndex < modelo.getPintores().size()) {
	                    Pintor pintor = modelo.getPintores().get(currentIndex);
	                    for (Object forma : pintor.obtenerVectorFormas()) {
	                        vista.agregarForma(forma);
	                    }
	                    //vista.repintarLienzo();
	                    currentIndex++;
	                } else {
	                    ((Timer) e.getSource()).stop();
	                    modelo.limpiarPintores();
	                }
	            }
	        });

	        timer.start();
	    }
		//modelo.imprimirPintores();
		//modelo.limpiarPintores();
	}
	
	public void handleLimpiarClick() {
		vista.limpiarLienzo();
		
	}
	
	public void handleGammaClick() {
		colorIterator = new ColorIterator(generarNumAleatorio(0, 255), generarNumAleatorio(0, 255), generarNumAleatorio(0, 255));
		vista.cambiarGammaPanel(colorIterator.nextColor());
	}
	
	public int generarNumAleatorio(int min, int max) {
        Random rand = new Random();
        int numRandom = rand.nextInt(max - min + 1) + min;
        return numRandom;
    }
	
	// Generación primordial de coordenadas.
	int xVar = generarNumAleatorio(PANEL_X_min, PANEL_X_max);
	int yVar = generarNumAleatorio(PANEL_Y_min, PANEL_Y_max);
	Coords coords = new Coords(xVar, yVar);
	// Color.
	ColorIterator colorIterator = new ColorIterator(generarNumAleatorio(0, 255), generarNumAleatorio(0, 255), generarNumAleatorio(0, 255));
	int grosor = random.nextInt(20) + 1;
	
	// Generar pintor random
	private Pintor pintorRandom() {
		int numeroAleatorio = random.nextInt(3);
		int coinflip = random.nextInt(2);
		
		if (coinflip == 1) {
			grosor = grosor + 2;
		} else {
			grosor = grosor - 2;
		}
		int grosorMinimo = 5; 
		int grosorMaximo = 40; 
		
		if (grosor < grosorMinimo) {
		    grosor = grosorMinimo;
		} else if (grosor > grosorMaximo) {
		    grosor = grosorMaximo;
		}
		
		int elementos = Integer.parseInt(vista.getElementos().getText()); 
		//System.out.println(numeroAleatorio);
		if (numeroAleatorio == 0) {
			return new PintorLunares(elementos, grosor, coords, colorIterator);
		} else if (numeroAleatorio == 1) {
			return new PintorPoligono(elementos, grosor, coords, colorIterator);
		} else {
			return new PintorRayas(elementos, grosor, coords, colorIterator);
		}
	}
}
