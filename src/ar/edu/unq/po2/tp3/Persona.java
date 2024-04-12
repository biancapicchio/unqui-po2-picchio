package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate fechaNac;
	
	public Persona(String nombre, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	
	public int getEdad() {
		return LocalDate.now().getYear() - fechaNac.getYear();		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
	
}
