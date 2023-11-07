package main;

import ventana.PanelController;
import ventana.PanelModel;
import ventana.PanelView;

public class Main {
	public static void main(String[] args) {
		PanelModel panelModel = new PanelModel();
		PanelView panelView = new PanelView();
		PanelController panelController = new PanelController(panelModel, panelView);
		panelView.setVisible(true);
		panelView.setResizable(false);
	}
}
