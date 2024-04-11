package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Point (int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point () {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public void moverA (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sumarCon (Point p) {
		this.x += p.getX();
		this.y += p.getY();
	}

	
}
