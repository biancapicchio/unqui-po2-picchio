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
	
	public int numConMayorCantDeParesDe () {
		int numConMayorCantDePares = 0;
		int mayorCantDePares = 0;
		for (Integer numero : numeros) {
			if (this.cantParesDe(numero) >= mayorCantDePares)
				numConMayorCantDePares = numero;
				mayorCantDePares = this.cantParesDe(numero);
		}
		return numConMayorCantDePares;
	}

	private int cantParesDe (Integer n) {
		int cantDePares = 0;
		while (n != 0) {
			if (n % 2 == 0) {
				cantDePares++;
				n /= 10;
			}
		}
		return cantDePares;
	}
	
	public int mayorMultiploEntre_y_ (int x, int y) {
		for (int i = 1000; i > 0; i--) {
			if (i / x == 0 && i / y == 0) {
				return i;
			}
		}
		return 0;
	}
}

