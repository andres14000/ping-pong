package pingpong;

import java.awt.Color;

import javax.swing.JFrame;



public class Ventana extends JFrame {
	
	private Tablero tab1;
	private Hilo hilo;
	
	public Ventana() {
		
		setTitle("Juego1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500,500);
		setResizable(false);
		
		
		tab1 = new Tablero();
		setContentPane(tab1);
		addKeyListener(new EventoTeclado());
		
		
		setVisible(true);
		
		hilo = new Hilo(tab1);
		hilo.start();
		
		
		
	}

}
