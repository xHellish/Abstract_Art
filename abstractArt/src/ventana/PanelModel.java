package ventana;

import java.util.Vector;

import pintor.Pintor;

public class PanelModel {
	
	Vector<Pintor> pintores = new Vector<>();
	
	public void agregarPintor(Pintor pintor) {
		pintores.add(pintor);
	}
	
	public Vector<Pintor> getPintores(){
		return pintores;
	}
	
	public void limpiarPintores() {
		pintores = new Vector<>();
	}
	
	public void imprimirPintores() {
		for (Pintor pintor : pintores) {
			System.out.println(pintor.determinarEstilo());
		}
	}
	
	
}
