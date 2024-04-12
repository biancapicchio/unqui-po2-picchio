package ar.edu.unq.po2.tp3;

public class Rectangle {
	private Point esquinaInferiorIzquierda = new Point();
	private int base = 0;
	private int altura = 0;
	
	public Rectangle(Point esquinaInferiorIzquierda, int base, int altura) {
		super();
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
		this.base = base;
		this.altura = altura;
	}
	
	public int area() {
		return getBase() * getAltura();
	}
	
	public int perimetro() {
		return (getBase() + getAltura()) *2;
	}
	
	public boolean esVertical() {
		return getAltura() > getBase();
	}
	
	public boolean esHorizontal() {
		return getBase() > getAltura();
	}

	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
}
