package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Tablero extends JPanel {
	
	Pelota 	pelota  = new Pelota(0,0);
	Raqueta	r1 = new Raqueta(10,200);
	Raqueta	r2 = new Raqueta(474,200);
	
	int	limitX, limitY;
	
	public Tablero() {
		setBackground(Color.black);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		
		limitX = (int)getBounds().getMaxX();
		limitY = (int)getBounds().getMaxY();
		g2.drawLine(limitX/2,0, limitX/2, limitY );
		
		g2.drawString(Integer.toString(pelota.scoreP1), 220, 20);
		g2.drawString(Integer.toString(pelota.scoreP2), 280, 20);
		dibujar(g2);
		actualizar();
	}
	public void dibujar(Graphics2D g) {
		
		
		g.fill(pelota.getPelota());
		g.fill(r1.getRaqueta());
		g.fill(r2.getRaqueta());
		
		//System.out.println("x: "+getBounds().getMaxX());
		//System.out.println("y: "+getBounds().getMaxY());
	}
	public void actualizar() {
		pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()));
		System.out.println(pelota.scoreP1+ " "+pelota.scoreP2);
		r1.moverR1(getBounds());
		r2.moverR2(getBounds());
		
	}
	
	private boolean colision(Rectangle2D r) {
		return pelota.getPelota().intersects(r);
	}
 
}
