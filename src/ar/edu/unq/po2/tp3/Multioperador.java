package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	 
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int n) {
		numeros.add(n);
	}
	
	public int suma () { 
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
	}
	
	public int resta () {
		int resta = numeros.getFirst();
		numeros.remove(0);
		List<Integer> numerosSinPrimero = numeros;
		for (int numero : numerosSinPrimero) {
			resta -= numero;
		}
		return resta;
	}
	
	public int multiplicacion () {
		int multiplicacion = 1;
		for (int numero : numeros) {
			multiplicacion *= numero;
		}
		return multiplicacion;
	}
}
 
