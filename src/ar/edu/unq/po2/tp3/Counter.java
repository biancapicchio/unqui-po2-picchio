package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int n) {
		numeros.add(n);
	}
	
	public int cantDePares() {
		int cantDePares = 0;
		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				cantDePares++;
			}
		}
		return cantDePares;
	}
	
	public int cantDeImpares() {
		int cantDeImpares = 0;
		for (Integer numero : numeros) {
			if (numero % 2 != 0) {
				cantDeImpares++;
			}
		}
		return cantDeImpares;
	}

	
	public int cantDeMultiplosDe (int n) {
		int cantDeMul = 0;
		for (Integer numero : numeros) {
			if (numero % n == 0) {
				cantDeMul++;
			}
		} 
		return cantDeMul;
	}
}

