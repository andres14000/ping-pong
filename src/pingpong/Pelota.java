package pingpong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Pelota {
	private int x;
	private int y;
	private final int ancho = 15;
	private final int alto  =15;
	int dx=1,dy=1;
	static int scoreP1=0;
	static int scoreP2=0;
	
	public Pelota(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Rectangle2D getPelota() {
		return new Rectangle2D.Double(x,y,ancho,alto);
	}
	public void mover(Rectangle limites, boolean colisionR1, boolean colisionR2) {
		x+=dx;
		y+=dy;
		
		if(colisionR1) {
			dx=-dx;
			x=25;
		}
		if(colisionR2) {
			dx=-dx;
			x=450; 
		}
		if(limites.getMaxX()<=x+ancho) {
			dx=-dx;
			x=245;
			scoreP1++;
		}
		if(limites.getMaxY()<=y+alto) {
			dy=-dy;
		}
		if(x<0) {
			dx=-dx;
			x=245;
			scoreP2++;
		}
		if(y<0) {
			dy=-dy;
		}
		
	}
	
}
