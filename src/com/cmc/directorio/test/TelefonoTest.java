package com.cmc.directorio.test;
import com.cmc.directorio.entidades.Telefono;

public class TelefonoTest {
	public static void main(String[] args) {	
		Telefono telf = new Telefono("movi","09941234123", 10);
		System.out.println("La operadora es: "+telf.getOperadora());
		System.out.println("El número es: "+telf.getNumero());
		System.out.println("El código es: "+ telf.getCodigo());
		System.out.println("Tiene Whatsapp: "+ telf.isTieneWhatsapp());
		
		
	}
}
