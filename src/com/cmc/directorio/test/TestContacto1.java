package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;

public class TestContacto1 {
	public static void main(String[] args) {
		Telefono telf = new Telefono("claro", "09381828210", 10);
		Contacto c = new Contacto("David", "Simba", telf, 1.32);
		
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Apellido: "+c.getApellido());
		System.out.println("Operadora: "+c.getTelefono().getOperadora());
		System.out.println("Numero: "+c.getTelefono().getNumero());
		System.out.println("Peso: "+c.getPeso());
	}
}
