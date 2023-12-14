package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf = new Telefono("claro", "09381828210", 10);
		Contacto ct1 = new Contacto("David", "Simba", telf, 10.92);
		AdminContacto ac = new AdminContacto();
		
		System.out.println("----- Primera Impresion ------");
		System.out.println("Tiene Whatsapp: "+ct1.getTelefono().isTieneWhatsapp());
		ac.activarUsuario(ct1);
		System.out.println("----- Segunda Impresion ------");
		System.out.println("Tiene Whatsapp: "+ct1.getTelefono().isTieneWhatsapp());
	}

}
