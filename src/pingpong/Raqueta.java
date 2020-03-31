package pingpong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Raqueta {

	private int x,y;
	private static final int ancho=10,alto=25;
	
	public Raqueta(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Rectangle2D getRaqueta() {
		return new Rectangle2D.Double(x,y,ancho,alto);
	}
	public void moverR1(Rectangle limites) {
		if(EventoTeclado.w && y>0) {
			y--;
		}
		if(EventoTeclado.s && y<limites.getMaxY()-alto) {
			y++;
		}
	}
	public void moverR2(Rectangle limites) {
		if(EventoTeclado.up && y>0) {
			y--;
		}
		if(EventoTeclado.down && y<limites.getMaxY()-alto) {
			y++;
		}
	}
}