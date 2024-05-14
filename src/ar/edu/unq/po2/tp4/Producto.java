package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Producto {

	protected int precio;
	private List<Producto> stock = new ArrayList<Producto>();
	
	public Producto(int precio, List<Producto> stock) {
		super();
		this.precio = precio;
		this.stock = stock;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void sacarDeStock() {
		stock.removeFirst();	
	}

}

