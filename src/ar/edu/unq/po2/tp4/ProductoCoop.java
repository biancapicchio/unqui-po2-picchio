package ar.edu.unq.po2.tp4;

import java.util.List;

public class ProductoCoop extends Producto{

	public ProductoCoop(int precio, List<Producto> stock) {
		super(precio, stock);

	}

	public int getPrecio() {
		return this.precio - 10 * 100;
	}
}
