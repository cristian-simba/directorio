package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;

public class TestContactos1 {
	public static void main(String[] args) {
		Telefono telf = new Telefono("claro", "09381828210", 10);
		Contacto ct1 = new Contacto("David", "Simba", telf, 10.92);
		Telefono telf2 = new Telefono("claro", "09381828220", 20);
		Contacto ct2 = new Contacto("Dayana", "Vargas", telf2, 9.32);
		AdminContacto ac = new AdminContacto();
		
		System.out.println(ac.buscarMasPesado(ct1, ct2));
		System.out.println("Tienen las mismas operadoras: "+ ac.compararOperadoras(ct1, ct2));
		
	}
}
