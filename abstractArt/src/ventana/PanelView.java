package ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import elementos.*;

public class PanelView extends JFrame {
	
	private List<Object> formas = new ArrayList<>();
	
	private JTextField textField;
    private JTextField textField_1;
    private JButton btnNewButton;
    private JButton btnLimpiar;
    private JPanel panel;
    private JPanel lienzo;
    
    private JLabel lblElementos;
    
    public PanelView() {
        // Configuración del JFrame principal
        getContentPane().setBackground(new Color(176, 196, 222));
        setBounds(100, 100, 1050, 467);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Panel lateral
        panel = new JPanel();
        panel.setBackground(new Color(0, 255, 255));
        panel.setBounds(0, 0, 168, 561);
        getContentPane().add(panel);
        panel.setLayout(null);

        // Componentes del panel lateral
        textField = new JTextField();
        textField.setBounds(82, 13, 76, 20);
        panel.add(textField);
        textField.setColumns(10);

        btnNewButton = new JButton("Pintar");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBounds(10, 75, 148, 29);
        panel.add(btnNewButton);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 115, 148, 2);
        panel.add(separator);

        JLabel lblNewLabel = new JLabel("Pintores");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(10, 11, 148, 20);
        panel.add(lblNewLabel);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnLimpiar.setBounds(10, 128, 148, 29);
        panel.add(btnLimpiar);
        
        lblElementos = new JLabel("Elementos");
        lblElementos.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblElementos.setBounds(10, 44, 87, 20);
        panel.add(lblElementos);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(107, 46, 51, 20);
        panel.add(textField_1);

        // Lienzo
        lienzo = new JPanel();
        lienzo.setBounds(178, 11, 846, 404);
        
        
        getContentPane().add(lienzo);
    }
    
    // Agregar una forma al panel lienzo
    public void agregarForma(Object forma) {
        formas.add(forma);
        repaint();
    }
    
    // Dibujar las formas en el panel lienzo
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Object forma : formas) {
            if (forma instanceof Lunar) {
                ((Lunar) forma).dibujar(g);
            } else if (forma instanceof Raya) {
                ((Raya) forma).dibujar(g);
            } else if (forma instanceof Poligono) {
            	((Poligono) forma).dibujar(g);
            }
        }
    }
    
    //Limpiar lienzo
    public void limpiarLienzo() {
    	formas.clear();
    	lienzo.removeAll();
    	lienzo.revalidate();
    	lienzo.repaint();
    }

	public JTextField getTextField() {
		return textField;
	}
	
	public JTextField getElementos() {
		return textField_1;
	}

	public JButton getBtnPintar() {
		return btnNewButton;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}
}
