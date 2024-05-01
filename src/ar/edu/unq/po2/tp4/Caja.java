package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	public Caja(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	private List<Producto> productos = new ArrayList<Producto>();
	
	public void registrarProductos(Cliente cliente) {
		int montoAPagar = 0;
		for(Producto producto : productos) {
			montoAPagar += producto.precio();
			producto.sacarDeStock();
		}
		cliente.setMontoAPagar(montoAPagar);
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
}
