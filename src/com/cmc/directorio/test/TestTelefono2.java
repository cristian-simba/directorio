package com.cmc.directorio.test;
import com.cmc.directorio.entidades.*;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "098234234", 20);
		AdminTelefono at = new AdminTelefono();
		at.activarMensajeria(telf);
		System.out.println("La operadora es: "+telf.getOperadora());
		System.out.println("El número es: "+telf.getNumero());
		System.out.println("El código es: "+ telf.getCodigo());
		System.out.println("Tiene Whatsapp: "+ telf.isTieneWhatsapp());
		
	}

}
